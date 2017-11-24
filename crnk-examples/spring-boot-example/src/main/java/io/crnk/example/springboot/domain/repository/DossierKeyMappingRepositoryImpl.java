/*
 * Auto generated from a template
 */
package io.crnk.example.springboot.domain.repository;

import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.repository.ResourceRepositoryBase;
import io.crnk.example.springboot.domain.model.DossierKeyMapping;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;




/**
 * ResourceRepositoryBase-based example with the base class providing some base functionality.
 */
@Component
public class DossierKeyMappingRepositoryImpl extends ResourceRepositoryBase<DossierKeyMapping, String> implements DossierKeyMappingRepository {

	private static final AtomicLong ID_GENERATOR = new AtomicLong(124);

	private Map<String, DossierKeyMapping> myHashMap = new HashMap<>();

	public DossierKeyMappingRepositoryImpl() {
		super(DossierKeyMapping.class);

		save(new DossierKeyMapping("121"));

	}

	@Override
	public synchronized void delete(String aNumber) {
		myHashMap.remove(aNumber);
	}

	@Override
	public synchronized <D extends DossierKeyMapping> D save(D e) {
		if (e.getJsonApiId() == null) {
			Long l = ID_GENERATOR.getAndIncrement();
			e.setJsonApiId(l.toString());
		}
		e.setEtag (String.valueOf ( System.currentTimeMillis() ) );
		myHashMap.put(e.getJsonApiId(), e);
		return e;
	}

	@Override
	public synchronized DossierKeyMappingList findAll(QuerySpec querySpec) {
		DossierKeyMappingList list = new DossierKeyMappingList();
		list.setMeta(new DossierKeyMappingListMeta());
		list.setLinks(new DossierKeyMappingListLinks());
		querySpec.apply(myHashMap.values(), list);
		return list;
	}

}