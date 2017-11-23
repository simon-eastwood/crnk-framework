/*
 * Auto generated from a template
 */
package io.crnk.example.springboot.domain.repository;

import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.repository.ResourceRepositoryBase;
import io.crnk.example.springboot.domain.model.ReadDossierResponse;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;




/**
 * ResourceRepositoryBase-based example with the base class providing some base functionality.
 */
@Component
public class ReadDossierResponseRepositoryImpl extends ResourceRepositoryBase<ReadDossierResponse, String> implements ReadDossierResponseRepository {

	private static final AtomicLong ID_GENERATOR = new AtomicLong(124);

	private Map<String, ReadDossierResponse> myHashMap = new HashMap<>();

	public ReadDossierResponseRepositoryImpl() {
		super(ReadDossierResponse.class);

		save(new ReadDossierResponse("121"));

	}

	@Override
	public synchronized void delete(String aNumber) {
		myHashMap.remove(aNumber);
	}

	@Override
	public synchronized <D extends ReadDossierResponse> D save(D e) {
		if (e.getJsonApiId() == null) {
			Long l = ID_GENERATOR.getAndIncrement();
			e.setJsonApiId(l.toString());
		}
		e.setEtag (String.valueOf ( System.currentTimeMillis() ) );
		myHashMap.put(e.getJsonApiId(), e);
		return e;
	}

	@Override
	public synchronized ReadDossierResponseList findAll(QuerySpec querySpec) {
		ReadDossierResponseList list = new ReadDossierResponseList();
		list.setMeta(new ReadDossierResponseListMeta());
		list.setLinks(new ReadDossierResponseListLinks());
		querySpec.apply(myHashMap.values(), list);
		return list;
	}

}