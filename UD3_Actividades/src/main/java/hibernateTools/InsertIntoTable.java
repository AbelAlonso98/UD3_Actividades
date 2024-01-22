package hibernateTools;

import org.hibernate.Session;



public class InsertIntoTable {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		


	}

}
