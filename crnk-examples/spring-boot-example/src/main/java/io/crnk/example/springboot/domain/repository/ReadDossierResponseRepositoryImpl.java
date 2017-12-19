/*
 * Auto generated from a template
 */
package io.crnk.example.springboot.domain.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Component;

import io.crnk.core.exception.ResourceNotFoundException;
import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.resource.list.ResourceList;
import io.crnk.example.springboot.domain.model.ReadDossierResponse;

/**
 * ResourceRepositoryBase-based example with the base class providing some base functionality.
 */
@Component
public class ReadDossierResponseRepositoryImpl implements ReadDossierResponseRepository {

	private static final AtomicLong ID_GENERATOR = new AtomicLong(124);

	private Map<String, ReadDossierResponse> myHashMap = new HashMap<>();

	public ReadDossierResponseRepositoryImpl() {
	}

	@Override
	public synchronized <D extends ReadDossierResponse> D save(D e) {
		if (e.getJsonApiId() == null) {
			Long l = ID_GENERATOR.getAndIncrement();
			e.setJsonApiId(l.toString());
		}
		e.seteTag(String.valueOf ( System.currentTimeMillis() ) );
		myHashMap.put(e.getJsonApiId(), e);
		return e;
	}

	@Override
	public ResourceList<ReadDossierResponse> findAll(QuerySpec querySpec) {
		return querySpec.apply(myHashMap.values());
	}
	
	@Override
	public ResourceList<ReadDossierResponse> findAll(Iterable<String> taskIds, QuerySpec querySpec) {
		List<ReadDossierResponse> foundTasks = new ArrayList<>();
		for (Map.Entry<String, ReadDossierResponse> entry : myHashMap.entrySet()) {
			for (String id : taskIds) {
				if (id.equals(entry.getKey())) {
					foundTasks.add(entry.getValue());
				}
			}
		}
		return querySpec.apply(foundTasks);
	}
	
	@Override
	public <S extends ReadDossierResponse> S create(S entity) {
		return save(entity);
	}

	@Override
	public Class<ReadDossierResponse> getResourceClass() {
		return ReadDossierResponse.class;
	}

	@Override
	public ReadDossierResponse findOne(String id, QuerySpec querySpec) {
		ReadDossierResponse readDossierResponse = myHashMap.get(id);
		if (readDossierResponse == null) {
			throw new ResourceNotFoundException("ReadDossierResponse not found!");
		}
		return readDossierResponse;
	}

	@Override
	public synchronized void delete(String aNumber) {
		myHashMap.remove(aNumber);
	}
}