package it.stefanolocati.app.user.model.dao;

import it.stefanolocati.app.user.model.entity.AppUser;

public interface AppUserDao {
	
	AppUser findByIdOrThrowException(int appUserId);
	
	void save(AppUser appUser);
	
	void delete(AppUser appUser);
		
	void flush();

}
