package com.tkbus.app.route.entity;

import org.springframework.stereotype.Repository;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class RouteDetail {

	@Id
	@Column(name = "route_id")
	private Integer routeId;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "route_id", referencedColumnName = "id", insertable = false, updatable = false)
	private Route route;
}
