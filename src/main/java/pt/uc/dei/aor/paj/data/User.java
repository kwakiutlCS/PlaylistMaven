package pt.uc.dei.aor.paj.data;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String username;
	private String password;

	public User() {
		super();
	}

	public User(String username, String password) {
		super();
		this.username = username;
		this.setPassword(password);
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return this.username + " id = " + this.id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


}