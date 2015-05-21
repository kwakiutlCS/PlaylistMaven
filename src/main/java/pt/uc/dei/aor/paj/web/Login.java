package pt.uc.dei.aor.paj.web;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import pt.uc.dei.aor.paj.ejb.UserEJBRemote;

@Named
@RequestScoped
public class Login {
	@EJB
	private UserEJBRemote userEJB;
	
	private String username;
	private String password;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public void submit() {
		userEJB.populate();
	}
}
