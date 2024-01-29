package com.tut;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Project Started !!!" );
        Configuration cfg = new Configuration();
        cfg.configure("Hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        System.out.println(factory);
        System.out.println(factory.isClosed());
        
        // create student
//        student student1 = new student();
//        student1.setId(1);
//        student1.setStudentName("Satyam");
//        student1.setStudentAddress("Gangapur");
//          System.out.println(student1);
//        
        
        //creating object of address class
//        Address ad = new Address();
//        ad.setStreet("street1");
//        ad.setCity("delhi");
//        ad.setOpen(true);
//        ad.setAddedDate(new Date());
//        ad.setX(1234.234);
        
        //Reading image
//      FileInputStream fis   = new FileInputStream("src/main/java/ganesh.jpg");
//        byte[]data = new byte[fis.available()];
//        fis.read(data);
//        ad.setImage(data);
        
       Session session = factory.openSession();
       
       // get  
       
      student student = session.load(student.class,1);
      System.out.println(student);
       
//       Address address = session.get(Address.class, 1);
//       System.out.println(address);
       
       Transaction tx = session.beginTransaction();
//    session.save(student1);
//   
//     session.save(ad);
       tx.commit();
       session.close();
       System.out.println("done...");
    }
}
