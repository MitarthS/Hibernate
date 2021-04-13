package Topic1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;

public class q_2 {

	public static void main(String[] args) {
		Configuration c1=new AnnotationConfiguration();
		c1.configure();
		SessionFactory sf = c1.buildSessionFactory();
		Session s =sf.openSession();
		Transaction t = s.beginTransaction();
		for (int i = 1; i<=10;i++) {
			Product p = new Product();
			p.setPrice(10*i + 500);
			p.setProductId(100+i);
			p.setProductName("Product A"+Integer.toString(i));
			s.save(p);
			
		}
		t.commit();
		s.flush();
		s.close();

	}

}
