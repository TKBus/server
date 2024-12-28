package com.tkbus.app.noderoute.entity;


/*
* create table node_route (
	route_id INT NOT NULL, -- route 인조키
    node_id INT NOT NULL, -- node 인조키
    node_order INT NOT NULL -- nodeord, 정류소 순번
);
*
* */

import com.tkbus.app.node.entity.Node;
import com.tkbus.app.route.entity.Route;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

@Entity
@Getter
public class NodeRoute {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	private Route route;

	@ManyToOne
	private Node node;

	private Integer nodeOrder;

}
