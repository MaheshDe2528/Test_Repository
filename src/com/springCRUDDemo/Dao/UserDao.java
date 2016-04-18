package com.springCRUDDemo.Dao;

import com.springCRUDDemo.model.UserModel;

public interface UserDao {

	UserModel authenticate(UserModel userModel);
}
