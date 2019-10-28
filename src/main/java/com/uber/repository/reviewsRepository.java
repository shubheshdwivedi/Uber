package com.uber.repository;

import com.uber.model.Bid;
import com.uber.model.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
@RepositoryRestResource(collectionResourceRel = "reviews", path = "reviews")
public interface reviewsRepository extends JpaRepository<Reviews, Long> {
}
