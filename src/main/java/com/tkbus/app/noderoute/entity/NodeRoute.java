package com.tkbus.app.noderoute.entity;

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

	protected NodeRoute() {}

}
