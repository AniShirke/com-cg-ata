package com.cg.ataproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Driver_table")
public class Driver {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int driverId;

	@Column(name = "driverName", nullable = false, length = 20)
	private String driverName;

	@Column(name = "driverAdress", nullable = false, length = 40)
	private String driverAddress;

	@Column(name = "driverContactNumber", nullable = false, length = 10)
	private long driverContactNumber;

	@Column(name = "driverLincenceNumber")
	private String driverLincenceNumber;

	public Driver() {
		super();
	}

	public Driver(int driverId, String driverName) {
		super();
		this.driverId = driverId;
		this.driverName = driverName;
	}

	public Driver(int driverId, String driverName, String driverAddress) {
		super();
		this.driverId = driverId;
		this.driverName = driverName;
		this.driverAddress = driverAddress;
	}

	public Driver(int driverId, String driverName, String driverAddress, long driverContactNumber) {
		super();
		this.driverId = driverId;
		this.driverName = driverName;
		this.driverAddress = driverAddress;
		this.driverContactNumber = driverContactNumber;
	}

	public Driver(int driverId, String driverName, String driverAddress, long driverContactNumber,
			String driverLincenceNumber) {
		super();
		this.driverId = driverId;
		this.driverName = driverName;
		this.driverAddress = driverAddress;
		this.driverContactNumber = driverContactNumber;
		this.driverLincenceNumber = driverLincenceNumber;
	}

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getDriverAddress() {
		return driverAddress;
	}

	public void setDriverAddress(String driverAddress) {
		this.driverAddress = driverAddress;
	}

	public long getDriverContactNumber() {
		return driverContactNumber;
	}

	public void setDriverContactNumber(long driverContactNumber) {
		this.driverContactNumber = driverContactNumber;
	}

	public String getDriverLincenceNumber() {
		return driverLincenceNumber;
	}

	public void setDriverLincenceNumber(String driverLincenceNumber) {
		this.driverLincenceNumber = driverLincenceNumber;
	}

	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", driverName=" + driverName + ", driverAddress=" + driverAddress
				+ ", driverContactNumber=" + driverContactNumber + ", driverLincenceNumber=" + driverLincenceNumber
				+ "]";
	}

}