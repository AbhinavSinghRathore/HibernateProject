package com;

import org.hibernate.cfg.Configuration;
import org.hibernate.*;

public class Demo 
{
	public static void main(String arg[])
	{
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory=config.buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		com.Product product=new com.Product();
		product.setProdId("P1002");
		product.setProdName("Samsung Galaxy");
		product.setPrice(11000);
		
		session.save(product);
		
		transaction.commit();
		
		session.close();
		
		System.out.println("Object Saved");
		
	}
}