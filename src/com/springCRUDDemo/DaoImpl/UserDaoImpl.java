package com.springCRUDDemo.DaoImpl;

import org.hibernate.Query;
import org.hibernate.Session;

import com.springCRUDDemo.Dao.UserDao;
import com.springCRUDDemo.model.UserModel;
import com.springCRUDDemo.springConfiguration.HibernateConfiguration;
import com.springCRUDDemo.viewmodel.UserViewModel;

public class UserDaoImpl implements UserDao{

	@Override
	public UserModel authenticate(UserModel userModel) {
		 Session session = HibernateConfiguration.getSessionFactory().openSession();
		 session.beginTransaction();
		 
		 Query query = session.createQuery("from user where Email=:Email AND Password=:Password").
				 setParameter("Email", userModel.getEmail()).
				 setParameter("Password", userModel.getPassword());
		 UserModel userData = (UserModel)query;
		 return userData;
	}

	public UserModel userFindById(UserViewModel viewModel)
	{
		Session session = HibernateConfiguration.getSessionFactory().openSession();
		session.beginTransaction();
		
		Query query = session.createQuery("from user where Code=:Code").
				setParameter("Code", viewModel.Code);
		
		UserModel userData = (UserModel)query.uniqueResult();
		return userData;
		
	}
}
