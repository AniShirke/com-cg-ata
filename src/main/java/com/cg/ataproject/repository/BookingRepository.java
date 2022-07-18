package com.cg.ataproject.repository;


	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

import com.cg.ataproject.model.Booking;

	@Repository
	public interface BookingRepository extends JpaRepository<Booking, Integer> {

	}


