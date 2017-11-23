/*
 * Auto generated from a template
 */
package io.crnk.example.springboot.domain.repository;

import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.repository.ResourceRepositoryBase;
import io.crnk.example.springboot.domain.model.DossierBI;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;




/**
 * ResourceRepositoryBase-based example with the base class providing some base functionality.
 */
@Component
public class DossierBIRepositoryImpl extends ResourceRepositoryBase<DossierBI, String> implements DossierBIRepository {

	private static final AtomicLong ID_GENERATOR = new AtomicLong(124);

	private Map<String, DossierBI> myHashMap = new HashMap<>();

	public DossierBIRepositoryImpl() {
		super(DossierBI.class);

		save(new DossierBI("121"));

	}

	@Override
	public synchronized void delete(String aNumber) {
		myHashMap.remove(aNumber);
	}

	@Override
	public synchronized <D extends DossierBI> D save(D e) {
		if (e.getJsonApiId() == null) {
			Long l = ID_GENERATOR.getAndIncrement();
			e.setJsonApiId(l.toString());
		}
		e.setEtag (System.currentTimeMillis().toString());
		myHashMap.put(e.getJsonApiId(), e);
		return e;
	}

	@Override
	public synchronized DossierBIList findAll(QuerySpec querySpec) {
		DossierBIList list = new DossierBIList();
		list.setMeta(new DossierBIListMeta());
		list.setLinks(new DossierBIListLinks());
		querySpec.apply(myHashMap.values(), list);
		return list;
	}

}