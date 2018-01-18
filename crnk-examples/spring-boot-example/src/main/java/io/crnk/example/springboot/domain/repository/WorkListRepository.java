package io.crnk.example.springboot.domain.repository;

import io.crnk.core.repository.ResourceRepositoryV2;
import io.crnk.example.springboot.domain.model.WorkList;

public interface WorkListRepository extends ResourceRepositoryV2<WorkList, String> {
	
}