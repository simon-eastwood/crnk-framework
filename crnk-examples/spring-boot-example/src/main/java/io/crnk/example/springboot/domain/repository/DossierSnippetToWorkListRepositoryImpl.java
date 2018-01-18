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
package io.crnk.example.springboot.domain.repository;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.crnk.core.engine.internal.utils.PropertyUtils;
import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.repository.RelationshipRepositoryV2;
import io.crnk.core.resource.list.ResourceList;
import io.crnk.example.springboot.domain.model.DossierSnippet;
import io.crnk.example.springboot.domain.model.WorkList;

/**
 * Manually-written, annotation-based relationship repository example.
 */
@Component
public class DossierSnippetToWorkListRepositoryImpl implements RelationshipRepositoryV2<DossierSnippet, String, WorkList, String> {
	private final DossierSnippetRepository dossierSnippetRepository;

	private final WorkListRepository workListRepository;

	@Autowired
	public DossierSnippetToWorkListRepositoryImpl(DossierSnippetRepository dossierSnippetRepository, WorkListRepository workListRepository) {
		this.dossierSnippetRepository = dossierSnippetRepository;
		this.workListRepository = workListRepository;
	}

	@Override
	public Class<DossierSnippet> getSourceResourceClass() {
		return DossierSnippet.class;
	}

	@Override
	public Class<WorkList> getTargetResourceClass() {
		return WorkList.class;
	}

	@Override
	public void setRelation(DossierSnippet dossierSnippet, String id, String fieldName) {
		WorkList worklist = workListRepository.findOne(id, null);
		try {
			PropertyUtils.setProperty(dossierSnippet, fieldName, worklist);
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
		dossierSnippetRepository.save(dossierSnippet);
	}

	@Override
	public void setRelations(DossierSnippet dossierSnippet, Iterable<String> ids, String fieldName) {
		Iterable<WorkList> worklists = workListRepository.findAll(ids, null);
		try {
			PropertyUtils.setProperty(dossierSnippet, fieldName, worklists);
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
		dossierSnippetRepository.save(dossierSnippet);
	}

	@Override
	public void addRelations(DossierSnippet dossierSnippet, Iterable<String> ids, String fieldName) {
		List<WorkList> newWorkList = new LinkedList<>();
		Iterable<WorkList> tasksToAdd = workListRepository.findAll(ids, null);
		for (WorkList task : tasksToAdd) {
			newWorkList.add(task);
		}
		if (PropertyUtils.getProperty(dossierSnippet, fieldName) != null) {
			Iterable<WorkList> tasks = (Iterable<WorkList>) PropertyUtils.getProperty(dossierSnippet, fieldName);
			for (WorkList task : tasks) {
				newWorkList.add(task);
			}
		}
		PropertyUtils.setProperty(dossierSnippet, fieldName, newWorkList);
		dossierSnippetRepository.save(dossierSnippet);
	}

	@Override
	public void removeRelations(DossierSnippet dossierSnippet, Iterable<String> ids, String fieldName) {		
	}

	@Override
	public WorkList findOneTarget(String dossierId, String fieldName, QuerySpec requestParams) {
		DossierSnippet dossierSnippet = dossierSnippetRepository.findOne(dossierId, requestParams);
		return (WorkList) PropertyUtils.getProperty(dossierSnippet, fieldName);
	}

	@Override
	public ResourceList<WorkList> findManyTargets(String dossierId, String fieldName, QuerySpec requestParams) {
		DossierSnippet dossierSnippet = dossierSnippetRepository.findOne(dossierId, requestParams);
		return requestParams.apply((Iterable<WorkList>) PropertyUtils.getProperty(dossierSnippet, fieldName));
	}
}
