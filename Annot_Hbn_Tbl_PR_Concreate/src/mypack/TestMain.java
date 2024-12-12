package mypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestMain {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tr=session.beginTransaction();
		Employee e= new Employee();
		e.setName("Ak");
		Reg_Employee reg=new Reg_Employee();
		reg.setBonus(200);
		reg.setName("Ak");
		reg.setSalary(300);
		Contract_Employee cont= new Contract_Employee();
		cont.setContract_period("2months");
		cont.setName("BKC");
		cont.setPay_per_hear(400);
		
session.save(e);
session.save(reg);
session.save(cont);
tr.commit();
session.close();
	}

}
