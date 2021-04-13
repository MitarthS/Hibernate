package Topic3;

import java.util.ArrayList;
import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class q_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c1=new AnnotationConfiguration().configure();
		SessionFactory sf = c1.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Country ct = new Country();
		ct.setCon("India");
		Capital cp = new Capital();
		cp.setCap("Delhi");
		Continent ctt = new Continent();
		ctt.setCname("Asia");
		Map<Country,Capital> map = new HashMap<Country,Capital>();
		map.put(ct,cp);
		ctt.setMap(map);
		
		s.save(ctt);
		t.commit();
		s.flush();
		s.close();

	}

}
