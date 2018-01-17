/*
 * Auto generated from a template
 */
package io.crnk.example.springboot.domain.repository;

import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.repository.ResourceRepositoryBase;
import io.crnk.example.springboot.domain.model.TTTT;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;




/**
 * ResourceRepositoryBase-based example with the base class providing some base functionality.
 */
@Component
public class TTTTRepositoryImpl extends ResourceRepositoryBase<TTTT, String> implements TTTTRepository {

	private static final AtomicLong ID_GENERATOR = new AtomicLong(124);

	private Map<String, TTTT> myHashMap = new HashMap<>();

	public TTTTRepositoryImpl() {
		super(TTTT.class);

		save(new TTTT("121"));

	}

	@Override
	public synchronized void delete(String aNumber) {
		myHashMap.remove(aNumber);
	}

	@Override
	public synchronized <D extends TTTT> D save(D e) {
		if (e.getJsonApiId() == null) {
			Long l = ID_GENERATOR.getAndIncrement();
			e.setJsonApiId(l.toString());
		}
		e.setEtag (String.valueOf ( System.currentTimeMillis() ) );
		myHashMap.put(e.getJsonApiId(), e);
		return e;
	}

	@Override
	public synchronized TTTTList findAll(QuerySpec querySpec) {
		TTTTList list = new TTTTList();
		list.setMeta(new TTTTListMeta());
		list.setLinks(new TTTTListLinks());
		querySpec.apply(myHashMap.values(), list);
		return list;
	}

}