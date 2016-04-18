package com.springCRUDDemo.springConfiguration;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

@SuppressWarnings("deprecation")
public class HibernateConfiguration {

	private static SessionFactory sessionFactory;
	
	static{
		try
		{
			//creating configuration and sessionFactory object using AnnotationConfiguration instead 
			//of Configuration which is used in XML mapping 
			sessionFactory = new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Exception: "+ e.getMessage());
		}
		catch(Throwable tw)
		{
			System.out.println("Initial Session factory creation failed .. " + tw);
			throw new ExceptionInInitializerError(tw);
		}
	}
	public static SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}
}
