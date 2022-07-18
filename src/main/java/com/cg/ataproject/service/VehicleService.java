package com.cg.ataproject.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.ataproject.exception.VehicleNotFoundException;
import com.cg.ataproject.model.Vehicle;
import com.cg.ataproject.repository.RouteRepository;
import com.cg.ataproject.repository.VehicleRepository;


@Service
public class VehicleService 
{
	
	@Autowired(required=true)
	VehicleRepository  vehiRepository;
	
	@Autowired(required=true)
	RouteService routeService;
	
	@Autowired(required=true)
	RouteRepository routeRepository;
	
	
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	
	public List<Vehicle> getAllVehicle() {
		LOG.info("getAllVehicle");
		return vehiRepository.findAll();
	}
	
	public Vehicle getVehicleById(int vehicleId) { 
		Optional<Vehicle> vehiOptional = vehiRepository.findById(vehicleId);

		Vehicle vehi = null;
		if (vehiOptional.isPresent()) {
			vehi = vehiOptional.get();
			LOG.info(vehi.toString());
			return vehi;
		} else {
			String errorMessage = "vehicle with vehicleId " + vehicleId + " does not exist.";
			LOG.error(errorMessage);
			throw new VehicleNotFoundException(errorMessage);
//			throw new EmployeeNotFoundException();
		}
	
	}
	
	public  Vehicle addVehicle(Vehicle vehicle) {
		LOG.info( vehicle .toString());
		if ( vehicle.getRoute() != null)
			routeService.getRouteById( vehicle.getRoute().getRouteId());
		return vehiRepository.save( vehicle);
	}
	
	
	public Vehicle updateVehicle(Vehicle vehicle) {
		LOG.info(vehicle.toString());
		this.getVehicleById(vehicle.getVehicleId());
		return vehiRepository.save(vehicle);
	}
	
	
	public Vehicle deleteVehicle(int vehicleId) {
		LOG.info(Integer.toString(vehicleId));
		Vehicle vehiToDelete = this.getVehicleById(vehicleId);
		vehiRepository.delete(vehiToDelete);
		return vehiToDelete;
	}



	
}
