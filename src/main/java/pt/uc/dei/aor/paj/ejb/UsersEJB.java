package pt.uc.dei.aor.paj.ejb;

import java.util.LinkedList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pt.uc.dei.aor.paj.data.User;

/**
 * Session Bean implementation class UsersEJB
 */
@Stateless
public class UsersEJB implements UserEJBRemote {
	@PersistenceContext(name="Users")
	EntityManager em;
	
	public UsersEJB() {
       
    }

	@Override
	public void populate() {
		em.persist(new User("palerma", "123"));
		em.persist(new User("tonto", "123"));
		
	}

	@Override
	public List<String> getUsers() {
		 Query q = em.createQuery("from User u");
		 List<User> users = q.getResultList();
		 
		 List<String> usernames = new LinkedList<String>();
		 for (User u : users) {
			 usernames.add(u.getUsername());
		 }
		 
		 return usernames;
	}

	
	
}
