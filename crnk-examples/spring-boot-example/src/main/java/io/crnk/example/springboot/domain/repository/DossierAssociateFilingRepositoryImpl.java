/*
 * Auto generated from a template
 */
package io.crnk.example.springboot.domain.repository;

import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.repository.ResourceRepositoryBase;
import io.crnk.example.springboot.domain.model.DossierAssociateFiling;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;




/**
 * ResourceRepositoryBase-based example with the base class providing some base functionality.
 */
@Component
public class DossierAssociateFilingRepositoryImpl extends ResourceRepositoryBase<DossierAssociateFiling, String> implements DossierAssociateFilingRepository {

	private static final AtomicLong ID_GENERATOR = new AtomicLong(124);

	private Map<String, DossierAssociateFiling> myHashMap = new HashMap<>();

	public DossierAssociateFilingRepositoryImpl() {
		super(DossierAssociateFiling.class);

		save(new DossierAssociateFiling("121"));

	}

	@Override
	public synchronized void delete(String aNumber) {
		myHashMap.remove(aNumber);
	}

	@Override
	public synchronized <D extends DossierAssociateFiling> D save(D e) {
		if (e.getJsonApiId() == null) {
			Long l = ID_GENERATOR.getAndIncrement();
			e.setJsonApiId(l.toString());
		}
		e.setEtag (String.valueOf ( System.currentTimeMillis() ) );
		myHashMap.put(e.getJsonApiId(), e);
		return e;
	}

	@Override
	public synchronized DossierAssociateFilingList findAll(QuerySpec querySpec) {
		DossierAssociateFilingList list = new DossierAssociateFilingList();
		list.setMeta(new DossierAssociateFilingListMeta());
		list.setLinks(new DossierAssociateFilingListLinks());
		querySpec.apply(myHashMap.values(), list);
		return list;
	}

}