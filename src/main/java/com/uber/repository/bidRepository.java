package com.uber.repository;

import com.uber.model.Bid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
@RepositoryRestResource(collectionResourceRel = "bid", path = "bid")
public interface bidRepository extends JpaRepository<Bid, Long> {
}
