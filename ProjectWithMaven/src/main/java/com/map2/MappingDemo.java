package com.map2;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {
	public static void main(String[] args) {
		 Configuration cfg = new Configuration();
		 cfg.configure("com/map2/manytomany.cfg.xml");
		 SessionFactory factory = cfg.buildSessionFactory();
		 
		 Emp e1 = new Emp();
		 Emp e2 = new Emp();
		 e1.setId(32);
		 e1.setName("Ramu");
		 
		 e2.setId(35);
		 e2.setName("Shyam");
		 
		 
	Project p1 = new Project();
	Project p2 = new Project();
	
	   p1.setPid(1212);
	   p1.setProjectName("Radar prject");
	   p2.setPid(2123);
	   p2.setProjectName("Water level");
	   
	   
	   List<Emp> l1= new ArrayList<Emp>();
	   List<Project> l2= new ArrayList<Project>();
	   
	   l1.add(e1);
	   l1.add(e2);
	   
	   l2.add(p1);
	   l2.add(p2);
	   
	   
	   // 
	   e1.setProjects(l2);
	   p2.setEmps(l1);
	   
		 
		 Session s = factory.openSession();
		 Transaction tx = s.beginTransaction();
		 
		 s.save(e1);
		 s.save(e2);
		 s.save(p1);
		 s.save(p2);
		 
		 tx.commit();
		 s.close();
		 factory.close();
		 
		 
	}

}
