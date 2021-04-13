package Topic3;

import java.util.HashMap;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class q_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c1=new AnnotationConfiguration().configure();
		SessionFactory sf = c1.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Inner i = new Inner();
		List<String> l = new ArrayList<String>();
		l.add("Intro");
		l.add("My story");
		l.add("The end");
		i.setL(l);
		Map<String,Inner> map = new HashMap<String,Inner>();
		map.put("Songs",i);
		Album a1 = new Album();
		a1.setAid(1001);
		a1.setName("Wildlands");
		a1.setPhoto(map);
		
		//s.save(ctt);
		t.commit();
		s.flush();
		s.close();

	}

}
