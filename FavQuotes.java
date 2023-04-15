package com.project;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FavQuotes {
//	public int user_id;
	
	public static HashMap<Integer,Set<Integer>> m = new HashMap<>();
	public static Scanner sc;
	

    public static void 	like(User u) {
    	sc=new Scanner(System.in);
    	System.out.println("ENTER Quote ID LIKE/UNLIKE:");
    	int id=sc.nextInt();
    	int flag=0;
    	for(Map.Entry<Integer,Set<Integer>> x:m.entrySet()) {
    		if(x.getKey() == u.id) {
    			if(x.getValue().contains(u.id)) {
    				x.getValue().remove(u.id);
    			}else {
    				x.getValue().add(id);
    			}
    			flag=1;
        	}
    	}
    	if(flag==0) {
    		Set<Integer> s = new HashSet<Integer>();
    		s.add(id);
    		m.put(u.id, s);
    	}
    	
    }
    
    public static void myFav(User u) {
    	System.out.println();
    	System.out.println("MY FAVORITE QUOTES:");
    	System.out.println(u.first_name+" >");
    	//for(Map.Entry<Integer,Set<Integer>> x:m.entrySet()) {
    		for(int i: m.get(u.id)) {
    			for(Quotes x:UserQ.q) {
    				if(i == x.id && u.id== x.user_id) {
    					System.out.println("[ id:"+ x.id+" "+x.author+" "+x.text+" "+x.user_id+" ]"); 
    				}
    	    		   			
    	    	}
    		}
    }
    


	public static void main(String[] args) {
		sc=new Scanner(System.in);

	}

}
