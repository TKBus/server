package com.tkbus.app.route.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tkbus.app.route.entity.Route;

@Repository
public interface RouteRepository extends JpaRepository<Route, Integer> {

}
