/*
 * Auto generated from a template
 */
package io.crnk.example.springboot.domain.repository;

import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.repository.ResourceRepositoryBase;
import io.crnk.example.springboot.domain.model.DossierBiblio;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;




/**
 * ResourceRepositoryBase-based example with the base class providing some base functionality.
 */
@Component
public class DossierBiblioRepositoryImpl extends ResourceRepositoryBase<DossierBiblio, String> implements DossierBiblioRepository {

	private static final AtomicLong ID_GENERATOR = new AtomicLong(124);

	private Map<String, DossierBiblio> myHashMap = new HashMap<>();

	public DossierBiblioRepositoryImpl() {
		super(DossierBiblio.class);

		save(new DossierBiblio("121"));

	}

	@Override
	public synchronized void delete(String aNumber) {
		myHashMap.remove(aNumber);
	}

	@Override
	public synchronized <D extends DossierBiblio> D save(D e) {
		if (e.getJsonApiId() == null) {
			Long l = ID_GENERATOR.getAndIncrement();
			e.setJsonApiId(l.toString());
		}
		e.setEtag (String.valueOf ( System.currentTimeMillis() ) );
		myHashMap.put(e.getJsonApiId(), e);
		return e;
	}

	@Override
	public synchronized DossierBiblioList findAll(QuerySpec querySpec) {
		DossierBiblioList list = new DossierBiblioList();
		list.setMeta(new DossierBiblioListMeta());
		list.setLinks(new DossierBiblioListLinks());
		querySpec.apply(myHashMap.values(), list);
		return list;
	}

}