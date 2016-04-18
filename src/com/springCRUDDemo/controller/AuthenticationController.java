package com.springCRUDDemo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springCRUDDemo.model.UserModel;
import com.springCRUDDemo.service.IAuthenticationDao;
import com.springCRUDDemo.viewmodel.Response;
import com.springCRUDDemo.viewmodel.UserViewModel;

@Controller
public class AuthenticationController {

	@Autowired
	private IAuthenticationDao authenticateDao;
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public Response authenticate(HttpServletRequest request, HttpServletResponse response, 
			@ModelAttribute("userBean")UserModel userModel)
	{
		Response resp = new Response();
		try{
			resp = authenticateDao.athenticate(userModel);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Exception: "+ e.getMessage());
		}
		return null;
		
	}
}
