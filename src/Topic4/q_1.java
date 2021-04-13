package Topic4;

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
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.setId(101);e1.setName("Arjun");
		//e1.setDid(1001);e2.setDid(1001);
		e2.setId(102);e2.setName("Aman");
		Department d1 = new Department();
		d1.setId(1001);d1.setName("Tech");
		d1.getCc().add(e1);
		d1.getCc().add(e2);
		
		s.save(d1);
		t.commit();
		s.flush();
		s.close();
	}

}
