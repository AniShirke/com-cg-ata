package com.cg.ataproject.repository;
	
	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

	import com.cg.ataproject.model.User;

	@Repository
	public interface UserRepository extends JpaRepository<User, Integer> {
		

	}


