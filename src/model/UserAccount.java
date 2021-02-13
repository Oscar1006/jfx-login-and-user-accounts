package model;

public class UserAccount {
	
	private String username;
	private String password;
	private String photo;
	private String gender;
	private String career;
	private String birthday;
	private String browser;
	
	public UserAccount(String username, String password, String photo, String gender, String career, String birthday, String browser) {
		
		this.username = username;
		this.password = password;
		this.photo = photo;
		this.gender = gender;
		this.career = career;
		this.birthday = birthday;
		this.browser = browser;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getPhoto() {
		return photo;
	}

	public String getGender() {
		return gender;
	}

	public String getCareer() {
		return career;
	}

	public String getBirthday() {
		return birthday;
	}

	public String getBrowser() {
		return browser;
	}
	
	
	
	
}
