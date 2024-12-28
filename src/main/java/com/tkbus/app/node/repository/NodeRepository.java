package com.tkbus.app.node.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tkbus.app.node.entity.Node;

@Repository
public interface NodeRepository extends JpaRepository<Node, Integer> {
}
