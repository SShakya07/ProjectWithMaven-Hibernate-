package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		
		student student = new student();
		student.setId(1);
		student.setStudentName("Adarsh Mathav");
		student.setStudentAddress("Mathura");
		
		
		Certificate certificate = new Certificate();
		
		certificate.setCourse("Java");
		certificate.setDuration("2 month");
		
		student.setCerti(certificate);
		
		Session s =factory.openSession();
		Transaction tx =s.beginTransaction();
		
		
		//object 
		
		s.save(student);
		
		
		tx.commit();
		s.close();
		factory.close();
		
	}

}
