package com.project;

public class User {
    public  int id;
    public String first_name;
    public String last_name;
    public String email;
    public String password;
    public String mobile;
    //static int idd;
    
//    static {
//    	idd=0;
//    }
    public User() {
    	//this.id=++idd;
    	this.id=0;
    }
   
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

//	public static void main(String[] args) {
//		
//
//	}

}
