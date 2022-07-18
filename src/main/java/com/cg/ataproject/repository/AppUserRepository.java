package com.cg.ataproject.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ataproject.model.AppUser;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, String> {

}
