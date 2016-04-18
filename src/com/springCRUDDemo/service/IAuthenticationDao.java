package com.springCRUDDemo.service;

import com.springCRUDDemo.model.UserModel;
import com.springCRUDDemo.viewmodel.Response;

public interface IAuthenticationDao {

	public Response athenticate(UserModel userModel);
}
