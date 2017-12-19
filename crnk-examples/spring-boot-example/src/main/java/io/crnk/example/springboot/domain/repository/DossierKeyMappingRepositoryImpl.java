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
import io.crnk.example.springboot.domain.model.DossierKeyMapping;

/**
 * ResourceRepositoryBase-based example with the base class providing some base functionality.
 */
@Component
public class DossierKeyMappingRepositoryImpl implements DossierKeyMappingRepository {

	private static final AtomicLong ID_GENERATOR = new AtomicLong(124);

	private Map<String, DossierKeyMapping> myHashMap = new HashMap<>();
	
	public DossierKeyMappingRepositoryImpl() {
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
		e.seteTag (String.valueOf ( System.currentTimeMillis() ) );
		myHashMap.put(e.getJsonApiId(), e);
		return e;
	}
	
	@Override
	public ResourceList<DossierKeyMapping> findAll(QuerySpec querySpec) {
		return querySpec.apply(myHashMap.values());
	}

	@Override
	public ResourceList<DossierKeyMapping> findAll(Iterable<String> taskIds, QuerySpec querySpec) {
		List<DossierKeyMapping> foundTasks = new ArrayList<>();
		for (Map.Entry<String, DossierKeyMapping> entry : myHashMap.entrySet()) {
			for (String id : taskIds) {
				if (id.equals(entry.getKey())) {
					foundTasks.add(entry.getValue());
				}
			}
		}
		return querySpec.apply(foundTasks);
	}
	
	@Override
	public <S extends DossierKeyMapping> S create(S entity) {
		return save(entity);
	}

	@Override
	public Class<DossierKeyMapping> getResourceClass() {
		return DossierKeyMapping.class;
	}

	@Override
	public DossierKeyMapping findOne(String id, QuerySpec querySpec) {
		DossierKeyMapping dossierKeyMapping = myHashMap.get(id);
		if (dossierKeyMapping == null) {
			throw new ResourceNotFoundException("DossierKeyMapping not found!");
		}
		return dossierKeyMapping;
	}
}