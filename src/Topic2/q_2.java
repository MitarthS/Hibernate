package Topic2;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class q_2 {
	static Configuration c1=new AnnotationConfiguration().configure();
	static SessionFactory sf = c1.buildSessionFactory();
	static Session s = sf.openSession();
	Transaction t = s.beginTransaction();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1 = new Emp();
		Date d2 = new Date(2020,06,20);
		Date d1 = new Date(1997,03,22);
		e1.setAge(23);
		e1.setDesig("Manager");
		e1.setDob(d1);
		e1.setEmpcode(1001);
		e1.setEname("Amanek");
		e1.setSal(30000);
		e1.setStdate(d2);		
		
		SAVE(e1);
		DELETE(e1);
		
	}
	
	public static void SAVE(Emp e1) {
		s.save(e1);
		System.out.println("Record is saved.");
	}
	public static void DELETE(Emp e1) {
		
		Configuration c2=new AnnotationConfiguration().configure();
		SessionFactory ssf = c2.buildSessionFactory();
		Session s1 = ssf.openSession();
		Transaction t1 = s1.beginTransaction();
		
		Employee_log el1 = new Employee_log();
		el1.setE(e1);
		el1.setLe(new Date(2020,05,11));
		s1.save(el1);
		s.delete(e1);
		t1.commit();
		s1.flush();
		s1.close();
		System.out.println("Record is deleted.");
	}
	
	

}
