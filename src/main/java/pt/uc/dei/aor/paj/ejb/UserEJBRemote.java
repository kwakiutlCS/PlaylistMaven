package pt.uc.dei.aor.paj.ejb;

import java.util.List;


public interface UserEJBRemote {
	public void populate();

	public List<String> getUsers();
}
