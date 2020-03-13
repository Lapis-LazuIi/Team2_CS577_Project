package edu.drexel.TrainDemo.models;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long id;
	private String firstName;
	private String lastName;
	private String password;
	private String reEnteredpassword;
	private String emailAddress;

	protected User() {
	}

	public User(String firstName, String lastName, String emailAddress, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getreEnteredPassword() {
		return reEnteredpassword;
	}

	public void setreEnteredPassword(String reEnteredpassword) {
		this.reEnteredpassword = reEnteredpassword;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {

		this.emailAddress = emailAddress;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, firstName, lastName, emailAddress, password, reEnteredpassword);
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("User{");
		sb.append("id=").append(id);
		sb.append(", firstName='").append(firstName).append('\'');
		sb.append(", lastName='").append(lastName).append('\'');
		sb.append(", email='").append(emailAddress).append('\'');
		sb.append('}');
		return sb.toString();
	}

}
