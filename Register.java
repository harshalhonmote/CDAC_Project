package com.project;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Register {
    public static ArrayList<User> u = new ArrayList<User>();
    public static Scanner sc;
   // public User current;
    
	public static void registerUser() throws IOException{
	    User newUser = new User(); 
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("----DETAILS----");
		
		System.out.print("ENTER FIRST NAME :");
		newUser.setFirst_name(sc.next());
		
		
		System.out.print("ENTER LAST NAME :");
		newUser.setLast_name(sc.next());
	
		
		System.out.print("ENTER EMAIL NAME :");
		newUser.setEmail(sc.next());
		

		System.out.print("ENTER PASSWORD :");
		newUser.setPassword(sc.next());
		
		
		System.out.print("ENTER MOBILE NO:");
		newUser.setMobile(sc.next());
		System.out.println("-----------------------");
		
		//System.out.print(newUser.id);
		newUser.id= u.size()+1;
		u.add(newUser);// USER ADDED
		
		//--------------------------------
		
//		File fileout = new File("/home/harsh09/eclipse-workspace/project/project/src/com/project/user.tex");
//		BufferedWriter bw = new BufferedWriter(new FileWriter(fileout,true));
//		
//		String ch=(u.id+","+u.getFirst_name()+","+u.getLast_name()+","+u.getEmail()+","+u.getPassword()+","+u.getMobile());
//		bw.write(ch);
//		bw.newLine();
//		System.out.println("File is copied");
//		
//		bw.close();
		//sc.close();
		
	}
	
	public static void login() {
		Register r = new Register();
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER EMAIL:");
		String email = sc.next();
		
		System.out.print("ENTER PASSWORD:");
		String password = sc.next();
		
		//CHECK USER AUTHENTICATION
		//if(u.size()==0)System.out.println("USER DOESN'T EXIST !!");
		int flag=0;
		for(User x:u) {
			if((x.email).equals(email) && (x.password).equals(password)) {
				System.out.println("------SUB MENU------");
		        flag=1;
				Submenu.submenu(x);
				
			}
		}
		if(flag==0)System.out.println(" AUTHENTICATION FAILED!!! ");
			
		
//		File filein = new File("/home/harsh09/eclipse-workspace/project/project/src/com/project/user.tex");
//		BufferedReader br = new BufferedReader(new FileReader(filein));
		
	}
	public static void changePassword(User current) {
		sc=new Scanner(System.in);
		System.out.print("ENTER NEW PASSWORD:");
		String password = sc.next();
		for(User x:u) {
			if( x.id == current.id) {
				x.password=password;
				System.out.println(" PASSWORD UPDATED SUCCESSFULLY ");
				
			}
		}
	}
	
	public static void editProfile(User current) {
		sc=new Scanner(System.in);
		System.out.print("ENTER FIRST NAME :");
		String fname = sc.next();
		
		System.out.print("ENTER LAST NAME :");
		String lname = sc.next();
		
		System.out.print("ENTER MOBILE NO :");
		String mobile = sc.next();
		for(User x:u) {
			if( x.id == current.id) {
				x.first_name=fname;
				x.last_name=lname;
				x.mobile=mobile;
				System.out.println(" PROFILE UPDATED SUCCESSFULLY ");
				
			}
		}
	}
	
	public static void main(String[] args) {
		 sc = new Scanner(System.in);

//		int i=1;
//		while(i<=3) {
//			Register.registerUser();
//			i++;
//		}
//		for(User x:u) {
//			System.out.println(x.id+" "+x.first_name);
//		}
//		
//		Register.login();
		
		
	}

}
