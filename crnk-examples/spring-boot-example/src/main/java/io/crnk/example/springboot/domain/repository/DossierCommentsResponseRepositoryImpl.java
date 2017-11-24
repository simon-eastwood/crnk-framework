/*
 * Auto generated from a template
 */
package io.crnk.example.springboot.domain.repository;

import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.repository.ResourceRepositoryBase;
import io.crnk.example.springboot.domain.model.DossierCommentsResponse;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;




/**
 * ResourceRepositoryBase-based example with the base class providing some base functionality.
 */
@Component
public class DossierCommentsResponseRepositoryImpl extends ResourceRepositoryBase<DossierCommentsResponse, String> implements DossierCommentsResponseRepository {

	private static final AtomicLong ID_GENERATOR = new AtomicLong(124);

	private Map<String, DossierCommentsResponse> myHashMap = new HashMap<>();

	public DossierCommentsResponseRepositoryImpl() {
		super(DossierCommentsResponse.class);

		save(new DossierCommentsResponse("121"));

	}

	@Override
	public synchronized void delete(String aNumber) {
		myHashMap.remove(aNumber);
	}

	@Override
	public synchronized <D extends DossierCommentsResponse> D save(D e) {
		if (e.getJsonApiId() == null) {
			Long l = ID_GENERATOR.getAndIncrement();
			e.setJsonApiId(l.toString());
		}
		e.setEtag (String.valueOf ( System.currentTimeMillis() ) );
		myHashMap.put(e.getJsonApiId(), e);
		return e;
	}

	@Override
	public synchronized DossierCommentsResponseList findAll(QuerySpec querySpec) {
		DossierCommentsResponseList list = new DossierCommentsResponseList();
		list.setMeta(new DossierCommentsResponseListMeta());
		list.setLinks(new DossierCommentsResponseListLinks());
		querySpec.apply(myHashMap.values(), list);
		return list;
	}

}