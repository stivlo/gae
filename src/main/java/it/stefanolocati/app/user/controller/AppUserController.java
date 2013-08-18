package it.stefanolocati.app.user.controller;

import it.stefanolocati.app.user.model.entity.AppUser;
import it.stefanolocati.app.user.model.service.AppUserManager;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppUserController {

	@Resource
	private AppUserManager appUserManager;
	
	@RequestMapping(value = "/app-user/{appUserId}", method = RequestMethod.GET)
	@ResponseBody
	public AppUser findById(@PathVariable int appUserId) {
		return appUserManager.findByIdOrThrowException(appUserId);
	}
	
	@RequestMapping(value = "/app-user", method = RequestMethod.POST)
	@ResponseBody
	public Integer save(@RequestBody AppUser appUser) {
		return appUserManager.save(appUser);
	}
	
	@RequestMapping(value = "/app-user/{appUserId}", method = RequestMethod.DELETE)
	@ResponseBody
	public void delete(@PathVariable int appUserId) {
		appUserManager.delete(appUserId);
	}
	
}
