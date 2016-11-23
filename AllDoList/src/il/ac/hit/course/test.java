package il.ac.hit.course;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class test {

	public static void main(String[] args) throws IToDoListDAOException {
		//SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
		//Session session = factory.openSession();
	//	session.beginTransaction();
		//User newUser = new User("leon","12");
		//User newUser2 = new User("efi","noobas");
		//session.save(newUser2);
		////session.getTransaction().commit();
		//.close();
		
		HibernateToDoListDAO htd = new HibernateToDoListDAO();
		htd.addUser("leon", "123");
		//htd.deleteUser("efi");
		
	}

}
