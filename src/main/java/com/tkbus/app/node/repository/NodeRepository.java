package com.tkbus.app.node.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tkbus.app.city.entity.City;
import com.tkbus.app.node.entity.Node;

@Repository
public interface NodeRepository extends JpaRepository<Node, Integer> {
	List<Node> findByCity(City city);
}
