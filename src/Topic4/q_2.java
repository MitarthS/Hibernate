package Topic4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import Topic3.Album;
import Topic3.Inner;

public class q_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c1=new AnnotationConfiguration().configure();
		SessionFactory sf = c1.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Passport p1 = new Passport();
		Empe e1 = new Empe();
		p1.setName("cyan");p1.setPcode("KCI121");
		
		e1.setName("red");e1.setId(101);
		//e1.setP(p1);		Employee table modified for Assignment 1 
		
		s.save(p1);
		s.save(e1);
		t.commit();
		s.flush();
		s.close();

	}

}
