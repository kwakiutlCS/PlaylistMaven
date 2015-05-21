package pt.uc.dei.aor.paj.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pt.uc.dei.aor.paj.data.User;

/**
 * Session Bean implementation class UsersEJB
 */
@Stateless
public class UsersEJB implements UserEJBRemote {
	@PersistenceContext(name="Users")
	EntityManager em;


	public UsersEJB() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void populate() {
		// TODO Auto-generated method stub
		User u = new User("palerma", "123");
		em.persist(u);
	}

}
