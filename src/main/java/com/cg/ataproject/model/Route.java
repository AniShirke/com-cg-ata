package com.cg.ataproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Route_Table")
public class Route {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int routeId;

	@Column(name = "source", nullable = false, length = 20)
	private String source;

	@Column(name = "distination", nullable = false, length = 40)
	private String distination;

	@Column(name = "duration", nullable = false, length = 20)
	private String duration;

	@Column(name = "distance", nullable = false, length = 10)
	private String distance;

	public Route() {
		super();
	}

	public Route(int routeId, String source) {
		super();
		this.routeId = routeId;
		this.source = source;
	}

	public Route(int routeId, String source, String distination) {
		super();
		this.routeId = routeId;
		this.source = source;
		this.distination = distination;
	}

	public Route(int routeId, String source, String distination, String duration) {
		super();
		this.routeId = routeId;
		this.source = source;
		this.distination = distination;
		this.duration = duration;
	}

	public Route(int routeId, String source, String distination, String duration, String distance) {
		super();
		this.routeId = routeId;
		this.source = source;
		this.distination = distination;
		this.duration = duration;
		this.distance = distance;
	}

	public int getRouteId() {
		return routeId;
	}

	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDistination() {
		return distination;
	}

	public void setDistination(String distination) {
		this.distination = distination;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	@Override
	public String toString() {
		return "Route [routeId=" + routeId + ", source=" + source + ", distination=" + distination + ", duration="
				+ duration + ", distance=" + distance + "]";
	}

}
