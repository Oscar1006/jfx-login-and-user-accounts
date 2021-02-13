package model;

import java.util.ArrayList;
import java.util.List;

public class Classroom {

	private List <UserAccount> accounts;

	public Classroom() {
		this.accounts = new ArrayList<>();
	}
	
	public void addAccount(String name, String password, String photo, String gender, String career, String birthday,String browser) {
		accounts.add(new UserAccount(name, password, photo, gender, career, birthday, browser));
	}
	
	
	public List<UserAccount> getAccounts() {
		return accounts;
	}
	
	
}
