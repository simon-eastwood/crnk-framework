/*
 * Auto generated from a template
 */
package io.crnk.example.springboot.domain.repository;

import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.repository.ResourceRepositoryBase;
import io.crnk.example.springboot.domain.model.DossierClass;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;




/**
 * ResourceRepositoryBase-based example with the base class providing some base functionality.
 */
@Component
public class DossierClassRepositoryImpl extends ResourceRepositoryBase<DossierClass, String> implements DossierClassRepository {

	private static final AtomicLong ID_GENERATOR = new AtomicLong(124);

	private Map<String, DossierClass> myHashMap = new HashMap<>();

	public DossierClassRepositoryImpl() {
		super(DossierClass.class);

		save(new DossierClass("121"));

	}

	@Override
	public synchronized void delete(String aNumber) {
		myHashMap.remove(aNumber);
	}

	@Override
	public synchronized <D extends DossierClass> D save(D e) {
		if (e.getJsonApiId() == null) {
			Long l = ID_GENERATOR.getAndIncrement();
			e.setJsonApiId(l.toString());
		}
		e.setEtag (String.valueOf ( System.currentTimeMillis() ) );
		myHashMap.put(e.getJsonApiId(), e);
		return e;
	}

	@Override
	public synchronized DossierClassList findAll(QuerySpec querySpec) {
		DossierClassList list = new DossierClassList();
		list.setMeta(new DossierClassListMeta());
		list.setLinks(new DossierClassListLinks());
		querySpec.apply(myHashMap.values(), list);
		return list;
	}

}