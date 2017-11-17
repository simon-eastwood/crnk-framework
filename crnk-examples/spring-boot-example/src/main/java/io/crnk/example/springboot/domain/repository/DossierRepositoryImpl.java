/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package main.java.io.crnk.example.springboot.domain.repository;

import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.repository.ResourceRepositoryBase;
import io.crnk.example.springboot.domain.model.Dossier;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * ResourceRepositoryBase-based example with the base class providing some base functionality.
 */
@Component
public class DossierRepositoryImpl extends ResourceRepositoryBase<Dossier, String> implements DossierRepository {

	private static final AtomicLong ID_GENERATOR = new AtomicLong(124);

	private Map<String, Dossier> dossiers = new HashMap<>();

	public DossierRepositoryImpl() {
		super(Dossier.class);

		save(new Dossier("121"));

	}

	@Override
	public synchronized void delete(String aNumber) {
		dossiers.remove(aNumber);
	}

	@Override
	public synchronized <D extends Dossier> D save(D dossier) {
		if (dossier.getTrimmedApplicationNumberId() == null) {
			Long l = ID_GENERATOR.getAndIncrement();
			dossier.setTrimmedApplicationNumberId(l.toString());
		}
		dossiers.put(dossier.getTrimmedApplicationNumberId(), dossier);
		return dossier;
	}

	@Override
	public synchronized DossierList findAll(QuerySpec querySpec) {
		DossierList list = new DossierList();
		list.setMeta(new DossierListMeta());
		list.setLinks(new DossierListLinks());
		querySpec.apply(dossiers.values(), list);
		return list;
	}

}
