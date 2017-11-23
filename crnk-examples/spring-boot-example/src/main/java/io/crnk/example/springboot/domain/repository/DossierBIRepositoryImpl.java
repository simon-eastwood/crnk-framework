/*
 * Auto generated from a template
 */
package io.crnk.example.springboot.domain.repository;

import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.repository.ResourceRepositoryBase;
import io.crnk.example.springboot.domain.model.DossierBI;
import io.crnk.example.springboot.domain.model.Sticker;
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
		
		Sticker s = new Sticker();
		s.sticker = "sticker";
		s.priority  = 99;
		s.tooltip = "tot";
		s.shownOn= "preview";
			
		DossierBI b = new DossierBI("121");
		b.DossierIndicators.add (s);
		save(b);

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
