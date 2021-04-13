package Topic6;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class q_3 {

	public static void main(String[] args) {
/*		
		Change inheritance type in Employee.java to 
		InheritanceType.TABLE_PER_CLASS
		
																							*/

		Employee e1 = new Employee();
		ContractEmployee ce1 = new ContractEmployee();
		RegularEmployee re1 = new RegularEmployee();
		e1.setEid(101);e1.setEname("Raj");e1.setSal(2000);
		ce1.setAllw(2000);ce1.setEid(1001);ce1.setEname("Andres");ce1.setSal(200);
		re1.setQplc(2000);re1.setEid(1002);re1.setEname("Bax");re1.setSal(200);
		
		
		Configuration c1=new AnnotationConfiguration().configure();
		SessionFactory sf = c1.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		s.save(e1);
		s.save(re1);
		s.save(ce1);
		t.commit();
		s.flush();
		s.close();

	}

}
