package com.map1;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class mapDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("com/map1/OneToMany.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
//		Question q = new Question();
//		q.setId(123);
//		q.setQuestion("laptos name");
//		
//		
//		Answer a1= new Answer();
//		a1.setId(34);
//		a1.setAnswer("HP");
//		
//		
//		Answer a2= new Answer();
//		a2.setId(37);
//		a2.setAnswer("ASUS");
//		
//		Answer a3= new Answer();
//		a3.setId(343);
//		a3.setAnswer("LENOVO");
//		
//		List<Answer> list = new ArrayList<Answer>();
//		list.add(a1);
//		list.add(a2);
//		list.add(a3);
//		
//		q.setAnswere(list);
		
		
		
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
//		s.save(q);
//		s.save(a1);
//		s.save(a2);
//		s.save(a3);
		
		
		// get
		
		Question q1 =(Question)s.get(Question.class, 123);
		System.out.println(q1.getQuestion());
		for(Answer a : q1.getAnswere()) {
			System.out.println(a.getAnswer());
		}
	
		tx.commit();
		
		s.close();
		factory.close();
	}

}
