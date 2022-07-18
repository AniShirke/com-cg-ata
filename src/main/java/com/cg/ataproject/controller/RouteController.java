package com.cg.ataproject.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ataproject.model.Route;
import com.cg.ataproject.model.Vehicle;
import com.cg.ataproject.service.RouteService;



@RestController
@RequestMapping("/Rou")
public class RouteController {

	@Autowired(required=true)
	RouteService routeService;

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	

	// http://localhost:9999/dep/view-all-Rou
	@GetMapping("/view-all-Rou")
	public ResponseEntity<List<Route>> getAllDeps() {
		List<Route> rouList = routeService.getAllRoutes();
		for (Route rou : rouList)
			LOG.info(rou.toString());
		HttpStatus status = HttpStatus.OK;
		ResponseEntity<List<Route>> response = new ResponseEntity<>(rouList, status);
		return response;
	}

//	// http://localhost:9999/dep/get-dep-by-id/{did}
//	@GetMapping("/get-Rou-by-id/{Rou}")
//	public ResponseEntity<Route> getDepById(@PathVariable(name = "routeId") int routeId) {
//		LOG.info(Integer.toString(routeId));
//		Route rou = routeService.getRouteById(routeId);
//		HttpStatus status = HttpStatus.OK;
//		ResponseEntity<Route> response = new ResponseEntity<>(rou, status);
//		return response;
//	}

	// http://localhost:9999/dep/add-rou
	@PostMapping("/add-Rou")
	public Route addEmp(@RequestBody Route route) {
		LOG.info(route.toString());
		return routeService.addRoute(route);
	}
	
	// http://localhost:9999/emp/delete-emp
		@DeleteMapping("/delete-Rou/{routeId}")
		public ResponseEntity<Route> deleteRoute(@PathVariable(name = "routeId") int routeId) {
			LOG.info(Integer.toString(routeId));
			HttpStatus status = HttpStatus.OK;
			ResponseEntity<Route> response = new ResponseEntity<>(routeService.deleteRoute(routeId), status);
			return response;
		}

	  	// http://localhost:9999/vehi/update-rou
			@PutMapping("/modify-rou")
		 public ResponseEntity<Route> updateRoute(@RequestBody Route route) {
			 LOG.info(route.toString());
			 HttpStatus status = HttpStatus.CREATED; 
			 ResponseEntity<Route> response = new ResponseEntity<>(routeService.updateRoute(route), status);
			 return response;
			}

}
