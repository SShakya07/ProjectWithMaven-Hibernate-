package com.map;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("com/map/hibernate.cfg1.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		
		//Creating Question
		Question q1 = new Question();
		q1.setQuestionId(1212);
		q1.setQuestion("What is Java");
		
		Answer ans = new Answer();
		ans.setAnswerId(343);
		ans.setAnswer("Java is programming language");
		ans.setQ(q1);
		
		q1.setAnswer(ans);
		
		//Session
		
		Session s = factory.openSession();
		
		//Question q = s.get(Question.class,1212);
		//System.out.println(q.getQuestion());
		Answer a = s.get(Answer.class, 343);
		System.out.println(a.getAnswer());
		
		
		
	//	System.out.println(ans.getAnswer());
		System.out.println(q1.getQuestion());
		
		Transaction tx = s.beginTransaction();
		//save
		s.save(q1);
		s.save(ans);
		
		tx.commit();
		// get
		
		
		s.close();
		factory.close();
		
		
	}

}
