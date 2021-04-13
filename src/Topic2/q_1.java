package Topic2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import Topic1.Product;

public class q_1 {

	public static void main(String[] args) {
		Configuration c1=new AnnotationConfiguration();
		//SessionFactory f = new Configuration().configure().buildSessionFactory();
		c1.configure();
		SessionFactory sf = c1.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		e1.setEband("B1");e1.setEmpid(101);e1.setEname("Arjun");
		e2.setEband("B2");e2.setEmpid(102);e2.setEname("Raj");
		e3.setEband("B1");e3.setEmpid(103);e3.setEname("Akki");
		s.save(e3);
		s.delete(e2);
		s.update(e3);
		t.commit();
		s.flush();
		s.close();

	}

}
