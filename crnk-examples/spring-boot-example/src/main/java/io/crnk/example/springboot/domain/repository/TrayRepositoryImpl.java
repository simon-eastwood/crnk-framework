/*
 * Auto generated from a template
 */
package io.crnk.example.springboot.domain.repository;

import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.repository.ResourceRepositoryBase;
import io.crnk.example.springboot.domain.model.Tray;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;




/**
 * ResourceRepositoryBase-based example with the base class providing some base functionality.
 */
@Component
public class TrayRepositoryImpl extends ResourceRepositoryBase<Tray, String> implements TrayRepository {

	private static final AtomicLong ID_GENERATOR = new AtomicLong(124);

	private Map<String, Tray> myHashMap = new HashMap<>();

	public TrayRepositoryImpl() {
		super(Tray.class);

		save(new Tray("121"));

	}

	@Override
	public synchronized void delete(String aNumber) {
		myHashMap.remove(aNumber);
	}

	@Override
	public synchronized <D extends Tray> D save(D e) {
		if (e.getJsonApiId() == null) {
			Long l = ID_GENERATOR.getAndIncrement();
			e.setJsonApiId(l.toString());
		}
		e.setEtag (String.valueOf ( System.currentTimeMillis() ) );
		myHashMap.put(e.getJsonApiId(), e);
		return e;
	}

	@Override
	public synchronized TrayList findAll(QuerySpec querySpec) {
		TrayList list = new TrayList();
		list.setMeta(new TrayListMeta());
		list.setLinks(new TrayListLinks());
		querySpec.apply(myHashMap.values(), list);
		return list;
	}

}