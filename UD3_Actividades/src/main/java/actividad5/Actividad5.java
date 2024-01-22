package actividad5;

import org.hibernate.Session;

import hibernateTools.HibernateUtil;

public class Actividad5 {

	public static void main(String[] args) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();
		
		s.createQuery("from Ventas as v left outer join v.idempleado as Empleado", actividad3.Ventas.class).list().forEach(
				v -> {
					System.out.println(v.getFechaventa());
				}
				);

	}

}
