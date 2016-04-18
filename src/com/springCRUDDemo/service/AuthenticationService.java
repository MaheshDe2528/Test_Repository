package com.springCRUDDemo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.springCRUDDemo.Dao.UserDao;
import com.springCRUDDemo.model.UserModel;
import com.springCRUDDemo.viewmodel.Response;

public class AuthenticationService implements IAuthenticationDao {

	@Autowired
	private UserDao userDao;
	
	@Override
	public Response athenticate(UserModel userModel) {
		Response response = new Response();
		if(null != userModel)
		{
			UserModel user = userDao.authenticate(userModel);
			if(null != user)
			{
				System.out.println("logged in successfully .. ");
			}
			else
			{
				System.out.println("Incorrect email id or password .. ");
			}
		}
		
		return response;
	}

}
