package com.cg.ataproject.service;



import java.util.List;

import com.cg.ataproject.model.AppUser;

public interface IAppUserService {

	public abstract List<AppUser> getAllUsers();

	public abstract AppUser registerUser(AppUser appUser);

	public abstract AppUser loginUser(AppUser appUser);

	public abstract String logoutUser(String userName);

}
