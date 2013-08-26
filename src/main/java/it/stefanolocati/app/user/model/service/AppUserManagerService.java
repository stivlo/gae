package it.stefanolocati.app.user.model.service;

import it.stefanolocati.app.user.model.dao.AppUserDao;
import it.stefanolocati.app.user.model.entity.AppUser;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AppUserManagerService implements AppUserManager {

	@Resource
	private AppUserDao appUserDao;

	@Override
	public AppUser findByIdOrThrowException(int appUserId) {
		return appUserDao.findByIdOrThrowException(appUserId);
	}

	@Override
	@Transactional
	public Long save(AppUser appUser) {
		appUserDao.save(appUser);
		appUserDao.flush();
		return appUser.getId();
	}

	@Override
	@Transactional
	public void delete(int appUserId) {
		AppUser appUser = appUserDao.findByIdOrThrowException(appUserId);
		appUserDao.delete(appUser);
	}

}
