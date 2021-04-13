package Topic1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;

public class q_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee e1 = new employee();
		employee e2 = new employee();
		employee e3 = new employee();
		employee e4 = new employee();
		employee e5 = new employee();
		int c = 1001;
		e1.setName("Raj");e1.setSalary(3000);e1.setDesign("Manager");e1.setEmpid(c);
		e2.setName("Arjun");e2.setSalary(5000);e2.setDesign("Designer");e2.setEmpid(c+1);
		e3.setName("Abhi");e3.setSalary(2300);e3.setDesign("Admin");e3.setEmpid(c+2);
		e4.setName("Sneha");e4.setSalary(9000);e4.setDesign("CEO");e4.setEmpid(c+3);
		e5.setName("Nitu");e5.setSalary(700000);e5.setDesign("Teacher");e5.setEmpid(c+4);
		
		Configuration c1=new AnnotationConfiguration();
		c1.configure();
		SessionFactory sf = c1.buildSessionFactory();
		Session s =sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(e1);
		s.save(e2);
		s.save(e3);
		s.save(e4);
		s.save(e5);
		t.commit();
		s.flush();
		s.close();
		/*  <property name="hibernate.connection.driver_class">oracle.jdbc.driver.OracleDriver</property>
      <property name="hibernate.connection.url">jdbc:oracle:thin:@APL-5LNB403:1521:XE</property>
      <property name="hibernate.connection.username">scott</property>
      <property name="hibernate.connection.password">tiger</property>
      */
		
	}

}
