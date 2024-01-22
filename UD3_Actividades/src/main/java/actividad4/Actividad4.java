package actividad4;

import org.hibernate.Session;

import hibernateTools.HibernateUtil;

public class Actividad4 {

	public static void main(String[] args) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();
		
		s.createQuery("from Clientes where id=7369", actividad3.Clientes.class).list().forEach(
				t -> System.out.println(t.getNombre())
				);


	}

}
