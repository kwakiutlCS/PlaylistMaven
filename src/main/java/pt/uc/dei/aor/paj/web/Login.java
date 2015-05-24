package pt.uc.dei.aor.paj.web;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import pt.uc.dei.aor.paj.ejb.UserEJBRemote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Named
@RequestScoped
public class Login {
	@EJB
	private UserEJBRemote userEJB;
	static final Logger logger = LoggerFactory.getLogger(Login.class);
	
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
		logger.info("submitting");
		logger.error("error");
		logger.debug("debugging");
		userEJB.populate();
	}
	
	public List<String> getUsers() {
		return userEJB.getUsers();
	}
}
