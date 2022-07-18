package com.cg.ataproject.repository;


	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

	import com.cg.ataproject.model.Driver;

	@Repository
	public interface DriverRepository extends JpaRepository<Driver, Integer> {

	}

