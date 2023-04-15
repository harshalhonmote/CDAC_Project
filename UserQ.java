package com.project;

import java.util.ArrayList;
import java.util.Scanner;

public class UserQ {
    public static ArrayList<Quotes>q=new ArrayList<Quotes>();
    
	
    public void addQuote(User u) {
    	Quotes newQuotes = new Quotes();
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("ENTER NEW QUOTE:");
    	String text=sc.nextLine();
    	newQuotes.setText(text);
    	
    	System.out.print(" ENTER AUTHOR: ");
    	String author=sc.nextLine();
    	newQuotes.setAuthor(author);
    	System.out.println("--QUOTE ADDED-- ");
    	System.out.println();
    	Register r= new Register();
    	newQuotes.id=q.size()+1;
    	newQuotes.user_id= u.id;
    	q.add(newQuotes);
    }
    public  void myQuotes(User u) {
    	//Register r= new Register();
    	System.out.println("--------------------");
    	System.out.println("Id  AUTOHR  TEXT");
    	for(Quotes x:q) {
    		if(x.user_id == u.id) {
    			System.out.println( x.id+"   "+x.author+"    "+x.text);  
    			
    		}
    	}
    	System.out.println("------------------------");
    }
    
    public void allQuotes() {
    	System.out.println("-----------------");
    	System.out.println("Id AUTOHR TEXT USERID");
    	for(Quotes x:q) {
    		System.out.println( x.id+"   "+x.author+"  "+x.text+"  "+x.user_id);
    	}
    	System.out.println("--------------------");
    }
    
    public void editQuotes(User u) {
    	 Scanner sc=new Scanner(System.in);
    	 
    	System.out.print("ENTER QUOTE ID:");
    	int i = sc.nextInt();
    	System.out.print("ENTER NEW QUOTE:");
    	String newQ = sc.next();
    	for(Quotes x:q) {
    		if(x.user_id == u.id && i == x.id) {
    			x.text=newQ;
    			System.out.println("--QUOTE UPDATED SUCCESSFULLY-- ");    			
    		}
    	}
    }
    public void deleteQuotes(User u) {
    	 Scanner sc=new Scanner(System.in);
    	System.out.print("ENTER QUOTE ID:");
    	int i = sc.nextInt();
    	for(Quotes x:q) {
    		if(x.user_id == u.id && i == x.id) {
    			q.remove(x);
    			int j=1;
    			for(Quotes xx:q) {
    				xx.id=j;
    				j++;
    			}
    			System.out.println(" --QUOTE DELETED SUCCESSFULLY--");    			
    		}
    	}
    }
    
	public static void main(String[] args) {
		

	}

}
