package io.crnk.example.springboot.domain.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Component;

import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.repository.ResourceRepositoryBase;
import io.crnk.example.springboot.domain.model.DossierSnippet;

@Component
public class DossierSnippetRepositoryImpl extends ResourceRepositoryBase<DossierSnippet, String> implements DossierSnippetRepository {

	private static final Map<String, DossierSnippet> dossierSnippetMap = new HashMap<>();

	private static final AtomicLong ID_GENERATOR = new AtomicLong(4);

	public DossierSnippetRepositoryImpl() {
		super(DossierSnippet.class);
	}
	
	@Override
	public synchronized <D extends DossierSnippet> D save(D e) {
		if (e.getJsonApiId() == null) {
			Long l = ID_GENERATOR.getAndIncrement();
			e.setJsonApiId(l.toString());
		}
		e.seteTag(String.valueOf ( System.currentTimeMillis() ) );
		dossierSnippetMap.put(e.getLalTaskId(), e);
		return e;
	}

	@Override
	public synchronized DossierSnippetList findAll(QuerySpec querySpec) {
		DossierSnippetList list = new DossierSnippetList();
		list.setMeta(new DossierSnippetListMeta());
		list.setLinks(new DossierSnippetListLinks());
		querySpec.apply(dossierSnippetMap.values(), list);
		return list;
	}
}
