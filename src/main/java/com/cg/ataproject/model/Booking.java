package com.cg.ataproject.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Booking_Table")
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookingId;

	@Column(name = "bookingDate", nullable = false)
	private LocalDate bookingDate;

	@Column(name = "journeyDate", nullable = false)
	private LocalDate journeyDate;

	@Column(name = "boardingPoint", nullable = false, length = 40)
	private String boardingPoint;

	@Column(name = "dropPoint", nullable = false, length = 30)
	private String dropPoint;

	@Column(name = "source", nullable = false, length = 40)
	private String source;

	@Column(name = "noOfPassenger", nullable = false, length = 10)
	private int noOfPassenger;

	@Column(name = "bookingStatus", nullable = false, length = 40)
	private String bookingStatus;

	public Booking() {
		super();
	}

	public Booking(int bookingId, LocalDate bookingDate) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
	}

	public Booking(int bookingId, LocalDate bookingDate, LocalDate journeyDate) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.journeyDate = journeyDate;
	}

	public Booking(int bookingId, LocalDate bookingDate, LocalDate journeyDate, String boardingPoint) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.journeyDate = journeyDate;
		this.boardingPoint = boardingPoint;
	}

	public Booking(int bookingId, LocalDate bookingDate, LocalDate journeyDate, String boardingPoint,
			String dropPoint) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.journeyDate = journeyDate;
		this.boardingPoint = boardingPoint;
		this.dropPoint = dropPoint;
	}

	public Booking(int bookingId, LocalDate bookingDate, LocalDate journeyDate, String boardingPoint, String dropPoint,
			String source) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.journeyDate = journeyDate;
		this.boardingPoint = boardingPoint;
		this.dropPoint = dropPoint;
		this.source = source;
	}

	public Booking(int bookingId, LocalDate bookingDate, LocalDate journeyDate, String boardingPoint, String dropPoint,
			String source, int noOfPassenger) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.journeyDate = journeyDate;
		this.boardingPoint = boardingPoint;
		this.dropPoint = dropPoint;
		this.source = source;
		this.noOfPassenger = noOfPassenger;
	}

	public Booking(int bookingId, LocalDate bookingDate, LocalDate journeyDate, String boardingPoint, String dropPoint,
			String source, int noOfPassenger, String bookingStatus) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.journeyDate = journeyDate;
		this.boardingPoint = boardingPoint;
		this.dropPoint = dropPoint;
		this.source = source;
		this.noOfPassenger = noOfPassenger;
		this.bookingStatus = bookingStatus;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public LocalDate getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(LocalDate journeyDate) {
		this.journeyDate = journeyDate;
	}

	public String getBoardingPoint() {
		return boardingPoint;
	}

	public void setBoardingPoint(String boardingPoint) {
		this.boardingPoint = boardingPoint;
	}

	public String getDropPoint() {
		return dropPoint;
	}

	public void setDropPoint(String dropPoint) {
		this.dropPoint = dropPoint;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public int getNoOfPassenger() {
		return noOfPassenger;
	}

	public void setNoOfPassenger(int noOfPassenger) {
		this.noOfPassenger = noOfPassenger;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", bookingDate=" + bookingDate + ", journeyPoint=" + journeyDate
				+ ", journeyDate=" + journeyDate + ", boardingPoint=" + boardingPoint + ", dropPoint=" + dropPoint
				+ ", source=" + source + ", noOfPassenger=" + noOfPassenger + ", bookingStatus=" + bookingStatus + "]";
	}

}
