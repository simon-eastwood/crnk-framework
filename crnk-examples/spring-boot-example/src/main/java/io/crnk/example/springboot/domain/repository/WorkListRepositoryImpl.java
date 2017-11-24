/*
 * Auto generated from a template
 */
package io.crnk.example.springboot.domain.repository;

import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.repository.ResourceRepositoryBase;
import io.crnk.example.springboot.domain.model.WorkList;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;




/**
 * ResourceRepositoryBase-based example with the base class providing some base functionality.
 */
@Component
public class WorkListRepositoryImpl extends ResourceRepositoryBase<WorkList, String> implements WorkListRepository {

	private static final AtomicLong ID_GENERATOR = new AtomicLong(124);

	private Map<String, WorkList> myHashMap = new HashMap<>();

	public WorkListRepositoryImpl() {
		super(WorkList.class);

		save(new WorkList("121"));

	}

	@Override
	public synchronized void delete(String aNumber) {
		myHashMap.remove(aNumber);
	}

	@Override
	public synchronized <D extends WorkList> D save(D e) {
		if (e.getJsonApiId() == null) {
			Long l = ID_GENERATOR.getAndIncrement();
			e.setJsonApiId(l.toString());
		}
		e.setEtag (String.valueOf ( System.currentTimeMillis() ) );
		myHashMap.put(e.getJsonApiId(), e);
		return e;
	}

	@Override
	public synchronized WorkListList findAll(QuerySpec querySpec) {
		WorkListList list = new WorkListList();
		list.setMeta(new WorkListListMeta());
		list.setLinks(new WorkListListLinks());
		querySpec.apply(myHashMap.values(), list);
		return list;
	}

}