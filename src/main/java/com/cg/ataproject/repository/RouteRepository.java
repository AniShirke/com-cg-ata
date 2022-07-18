package com.cg.ataproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ataproject.model.Route;

@Repository
public interface RouteRepository extends JpaRepository<Route, Integer> {

}
