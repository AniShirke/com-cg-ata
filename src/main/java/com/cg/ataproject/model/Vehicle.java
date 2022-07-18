package com.cg.ataproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
(name="Vehicle_Table")
public class Vehicle 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vehicleId;
	
	@Column( name="vehicleName",nullable = false, length = 20)
	private String vehicleName;
	
	@Column(name="vehicleType",nullable = false, length = 20)
	private String vehicleType;
	
	@Column(name="vehicleSeatingCapacity",nullable = false, length = 20)
	private int vehicleSeatingCapacity;
	
	@Column(name="farePerKM",nullable = false, length = 20)
	private double farePerKM ;
	

	@ManyToOne
	@JoinColumn(name = "Fk_routeId")
	private Route route;
	
	
	public Vehicle() {
		super();
		
	}


	public Vehicle(int vehicleId, String vehicaleName) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleName = vehicaleName;
	}


	public Vehicle(int vehicleID, String vehicaleName, String vehicleType) {
		super();
		this.vehicleId = vehicleID;
		this.vehicleName = vehicaleName;
		this.vehicleType = vehicleType;
	}


	public Vehicle(int vehicleID, String vehicaleName, String vehicleType, int vehicleSeatingCapacity) {
		super();
		this.vehicleId = vehicleID;
		this.vehicleName = vehicaleName;
		this.vehicleType = vehicleType;
		this.vehicleSeatingCapacity = vehicleSeatingCapacity;
	}
	
	
	public Vehicle(int vehicleID, String vehicaleName, String vehicleType, int vehicleSeatingCapacity,
			double farePerKM) {
		super();
		this.vehicleId = vehicleID;
		this.vehicleName = vehicaleName;
		this.vehicleType = vehicleType;
		this.vehicleSeatingCapacity = vehicleSeatingCapacity;
		this.farePerKM = farePerKM;
	}
	public Vehicle(int vehicleID, String vehicaleName, String vehicleType, int vehicleSeatingCapacity,
			double farePerKM, Driver driver) {
		super();
		this.vehicleId = vehicleID;
		this.vehicleName = vehicaleName;
		this.vehicleType = vehicleType;
		this.vehicleSeatingCapacity = vehicleSeatingCapacity;
		this.farePerKM = farePerKM;
	
	}
	
	

	public Vehicle(int vehicleID, String vehicaleName, String vehicleType, int vehicleSeatingCapacity, double farePerKM,
			com.cg.ataproject.model.Route route) {
		super();
		this.vehicleId = vehicleID;
		this.vehicleName = vehicaleName;
		this.vehicleType = vehicleType;
		this.vehicleSeatingCapacity = vehicleSeatingCapacity;
		this.farePerKM = farePerKM;
		this.route = route;
	}


	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleID) {
		this.vehicleId = vehicleID;
	}
	public String getVehicaleName() {
		return vehicleName;
	}
	public void setVehicaleName(String vehicaleName) {
		this.vehicleName = vehicaleName;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public int getVehicleSeatingCapacity() {
		return vehicleSeatingCapacity;
	}
	public void setVehicleSeatingCapacity(int vehicleSeatingCapacity) {
		this.vehicleSeatingCapacity = vehicleSeatingCapacity;
	}
	public double getFarePerKM() {
		return farePerKM;
	}
	public void setFarePerKM(double farePerKM) {
		this.farePerKM = farePerKM;
	}
	public Route getRoute() {
		return route;
	}


	public void setRoute(Route route) {
		this.route = route;
	}


	@Override
	public String toString() {
		return "Vehicle [vehicleID=" + vehicleId + ", vehicaleName=" + vehicleName + ", vehicleType=" + vehicleType
				+ ", vehicleSeatingCapacity=" + vehicleSeatingCapacity + ", farePerKM=" + farePerKM + ", Route=" + route
				+ "]";
	}



	
	

}
