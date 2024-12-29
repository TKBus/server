package com.tkbus.app.route.entity;


import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.tkbus.app.city.entity.City;
import com.tkbus.app.node.entity.Node;
import com.tkbus.app.noderoute.entity.NodeRoute;

import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;

@Entity
@Getter
public class Route {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "city_id", nullable = false, foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
	private City city;

	private String code;

	private String name;

	private String type;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "start_node_id", nullable = false, foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
	private Node startNode;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "end_node_id", nullable = false, foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
	private Node endNode;

	private LocalTime startVehicleTime;

	private LocalTime endVehicleTime;

	@OneToOne(mappedBy = "route")
	private RouteDetail detail;

	@OneToMany(mappedBy = "route")
	private List<NodeRoute> nodeRoutes = new ArrayList<>();

	protected Route() {}
}
