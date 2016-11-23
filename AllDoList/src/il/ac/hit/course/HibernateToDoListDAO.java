package il.ac.hit.course;

import javax.transaction.Transaction;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

//implement this interface  ToDoListDAO it should use Hibernate .
//HibernateToDoListDAO class should implement the singleton pattern.
public class HibernateToDoListDAO implements IToDoListDAO {

	
	private static SessionFactory factory;
	@Override
	public void addUser(String username,String password) throws IToDoListDAOException {
		SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		User newUser = new User(username,password);
	
		session.save(newUser);
		session.getTransaction().commit();
		session.close();
		
	
	}
	@Override
	public void deleteUser(String username) throws IToDoListDAOException {
		SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		User userToRemove = (User)session.get(User.class, username );
		session.getTransaction().commit();
		session.close();
	
	}
	@Override
	public void updateUser(String username) throws IToDoListDAOException {
		
		
	}
	@Override
	public User[] getUsers() throws IToDoListDAOException {
		return null;
	
	}




	
	
}
