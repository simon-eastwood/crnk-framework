/*
 * Auto generated from a template
 */
package io.crnk.example.springboot.domain.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Component;

import io.crnk.core.exception.ResourceNotFoundException;
import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.resource.list.ResourceList;
import io.crnk.example.springboot.domain.model.DossierSnippet;
import io.crnk.example.springboot.domain.model.WorkList;

/**
 * ResourceRepositoryBase-based example with the base class providing some base functionality.
 */
@Component
public class WorkListRepositoryImpl implements WorkListRepository {

	private static final AtomicLong ID_GENERATOR = new AtomicLong(124);

	private Map<String, WorkList> myHashMap = new ConcurrentHashMap<>();

	private DossierSnippetRepositoryImpl dossierSnippetRepository;
	
	public WorkListRepositoryImpl(DossierSnippetRepositoryImpl dossierSnippetRepository) {
		this.dossierSnippetRepository = dossierSnippetRepository;
		
	}

	@Override
	public synchronized <D extends WorkList> D save(D e) {
		if (e.getJsonApiId() == null) {
			Long l = ID_GENERATOR.getAndIncrement();
			e.setJsonApiId(l.toString());
		}
		e.seteTag(String.valueOf ( System.currentTimeMillis() ) );
		myHashMap.put(e.getJsonApiId().toString(), e);
		return e;
	}

	@Override
	public ResourceList<WorkList> findAll(QuerySpec querySpec) {
		return querySpec.apply(myHashMap.values());
	}

	@Override
	public ResourceList<WorkList> findAll(Iterable<String> taskIds, QuerySpec querySpec) {
		List<WorkList> foundTasks = new ArrayList<>();
		for (Map.Entry<String, WorkList> entry : myHashMap.entrySet()) {
			for (String id : taskIds) {
				if (id.equals(entry.getKey())) {
					foundTasks.add(entry.getValue());
				}
			}
		}
		return querySpec.apply(foundTasks);
	}
	
	@Override
	public <S extends WorkList> S create(S entity) {
		return save(entity);
	}

	@Override
	public Class<WorkList> getResourceClass() {
		return WorkList.class;
	}

	@Override
	public WorkList findOne(String id, QuerySpec querySpec) {
		WorkList workList = myHashMap.get(id);
		if (workList == null) {
			throw new ResourceNotFoundException("DossierSnippet not found!");
		}
		if (workList.getDossierSnippet() == null) {
			List<DossierSnippet> list = new ArrayList<DossierSnippet>();
			list.add(dossierSnippetRepository.findOne(workList.getJsonApiId().toString(), new QuerySpec(WorkList.class)));
			workList.setDossierSnippet(list);
		}
		return workList;
	}

	
	@Override
	public void delete(String id) {
		myHashMap.remove(id);
	}	
}