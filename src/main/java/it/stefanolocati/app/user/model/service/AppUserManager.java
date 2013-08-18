package it.stefanolocati.app.user.model.service;

import it.stefanolocati.app.user.model.entity.AppUser;

public interface AppUserManager {

	AppUser findByIdOrThrowException(int appUserId);

	Integer save(AppUser appUser);

	void delete(int appUserId);

}
