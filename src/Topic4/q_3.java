package Topic4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class q_3 {

	public static void main(String[] args) {
		Configuration c1=new AnnotationConfiguration().configure();
		SessionFactory sf = c1.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Course co1= new Course();
		Course co2= new Course();
		Student st1 = new Student();
		Student st2 = new Student();
		co1.setId(101);co1.setName("Maths");
		co2.setId(102);co2.setName("English");
		st1.setName("Kenny");st1.setRollno(10);
		st2.setName("Niko");st2.setRollno(11);
		st1.getC().add(co1);st1.getC().add(co2);
		st2.getC().add(co1);st2.getC().add(co2);		
		
		s.save(st1);
		t.commit();
		s.flush();
		s.close();

	}

}
