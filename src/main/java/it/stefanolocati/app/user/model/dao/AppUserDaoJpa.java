package it.stefanolocati.app.user.model.dao;

import it.stefanolocati.app.user.model.entity.AppUser;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.dao.EmptyResultDataAccessException;

public class AppUserDaoJpa implements AppUserDao {

	private EntityManager entityManager;

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public AppUser findByIdOrThrowException(int appUserId) {
		AppUser appUser = entityManager.find(AppUser.class, appUserId);
		if (appUser == null) {
			throw new EmptyResultDataAccessException("AppUser with id="
					+ appUserId + " wasn't found.", 1);
		}
		return appUser;
	}

	@Override
	public void save(AppUser appUser) {
		entityManager.persist(appUser);
	}

	@Override
	public void delete(AppUser appUser) {
		entityManager.remove(appUser);
	}

	@Override
	public void flush() {
		entityManager.flush();
	}

}
