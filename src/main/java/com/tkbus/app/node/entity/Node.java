package com.tkbus.app.node.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.tkbus.app.noderoute.entity.NodeRoute;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;


@Entity
@Getter
public class Node {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String code;

	private String name;

	@Enumerated(EnumType.STRING)
	private Direction updown;

	private BigDecimal gpslati;

	private BigDecimal gpslong;

	public enum Direction {
		UP, DOWN
	}

	protected Node() {}


	@OneToMany(mappedBy = "node")
	private List<NodeRoute> nodeRoutes = new ArrayList<>();
}
