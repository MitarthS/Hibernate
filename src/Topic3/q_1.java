package Topic3;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class q_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c1=new AnnotationConfiguration().configure();
		SessionFactory sf = c1.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		List<String> l = new ArrayList<String>();
		l.add("Hello");
		l.add("Hola");
		l.add("Konichiwa");
		Question q1 = new Question();
		q1.setAnswer("Option (c)");
		q1.setId(101);
		q1.setOptions(l);
		q1.setQname("What is hello in Japanese");
		s.save(q1);
		t.commit();
		s.flush();
		s.close();

	}

}
