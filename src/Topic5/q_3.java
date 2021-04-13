package Topic5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class q_3 {
	public static void main(String[] args) {
		Car cr1 = new Car("KL-07 AB 123" ,"Polo" ,"White" ,"Volkswagen",700000);
		Car cr2 = new Car("KL-07 AB 234","Vento","Black","Volkswagen",600000);
		Car cr3 = new Car("KL-07 AC 345" ,"Corolla" ,"Silver","Toyota",1000000);
		Car cr4 = new Car("KL-07 BC 123", "Sail Uva", "Red" ,"Chevrolet",500000);
		
		Configuration c1=new AnnotationConfiguration().configure();
		SessionFactory sf = c1.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		s.save(cr1);
		s.save(cr2);
		s.save(cr3);
		s.save(cr4);
		t.commit();
		
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		Query q1 = s.createQuery("from Car where regno =:dno");
        q1.setParameter("dno",x);
        List list = q1.list();
        for (int i = 0;i<list.size();i++) {
    		Car cci = (Car) list.get(i);
    		System.out.println(cci.getRegno()+"  "+cci.getModel()+"  "+cci.getColor()+"  "+cci.getMf()+"  "+cci.getPrice());
    	}
		sc.close();
		s.flush();
		s.close();

		
	}
}
