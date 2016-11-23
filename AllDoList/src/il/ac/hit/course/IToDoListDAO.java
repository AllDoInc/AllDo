package il.ac.hit.course;



// Lists the methods through which the web application uses the database.
public interface IToDoListDAO  {
	
	
	public void addUser(String username,String password) throws IToDoListDAOException;
	public void deleteUser(String username) throws IToDoListDAOException;
	public void updateUser(String username) throws IToDoListDAOException;
	
	public User[] getUsers() throws IToDoListDAOException;

	
	
}
