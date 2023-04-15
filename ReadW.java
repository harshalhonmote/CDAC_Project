package com.project;

import java.io.*;
import java.util.*;

import javax.swing.plaf.synth.SynthToggleButtonUI;


public class ReadW{
//     take user list into a filename
       private static String filename = "/home/harsh09/eclipse-workspace/project/project/src/com/project/UserList.txt"; 
	
//     take quote list into a filename
       private static String quotefile = "/home/harsh09/eclipse-workspace/project/project/src/com/project/quotelist.txt";
	 
     public static void writeIntoUser(ArrayList<User> user){
    	 try {
    		 BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
             for(User u : user) {
            	 writer.write((""+Integer.toString(u.getId())+","+(u).getFirst_name()+","+u.getLast_name()+","+u.getEmail()+","+u.getPassword()+","+u.getMobile()+"\n"));
             }
             writer.close();
    	 }
    	 catch(IOException ex)
         {
             ex.printStackTrace();
         }
     }
     
     public static void readIntoUser(ArrayList<User> newu) {
    	 //ArrayList<User> user = new ArrayList<User>();
    	 try
         {  
    		
    		 BufferedReader reader= new BufferedReader(new FileReader(filename));     
        	 String line;
                 String [] words;
       	         while((line = reader.readLine()) != null) {
       	        	 User u = new User();
   				  words = line.split(",");
   				  System.out.println(words[0]);
   				  
   				  u.setId(Integer.parseInt(words[0]));
   			      for(int i = 1; i< words.length;i++) {
   			    	switch (i) {
   			    	case 1:
   			    		u.setFirst_name(words[1]);
   			    		break;
   			    	
   			        case 2:
			    		u.setLast_name(words[2]);
			    		break;
			    	
       	            case 3:
			    		u.setEmail(words[3]);
			    		break;
		    	    
			        case 4:
				    	u.setFirst_name(words[4]);
				    	break;
				    	
			        case 5:
			    		u.setPassword(words[5]);
			    		break;
		    	    
			        case 6:
				    	u.setMobile(words[6]);
				    	break;  	   
   			      }
       	    }
   		  newu.add(u);
       	 
          }
       	      reader.close();
         }
          
         catch(IOException ex)
         {
             ex.printStackTrace();
         }
    	 
     }
 
     
     
     public static void writeIntoQuotes(ArrayList<Quotes> q){
    	 try {
             BufferedWriter writer = new BufferedWriter(new FileWriter(quotefile));
             for(Quotes u : q) {
            	 writer.write((""+Integer.toString(u.getId())+","+(u).getAuthor()+","+u.getText()+","+Integer.toString(u.getUser_id())+"\n"));
             }
             writer.close();
    	 }
    	 catch(IOException ex)
         {
             ex.printStackTrace();
         }
     }
     
     public static void readIntoQuotes(ArrayList<Quotes> q) {
    	 try
         {  
    	    // ArrayList<Quotes> q = new ArrayList<Quotes>();
             BufferedReader reader= new BufferedReader(new FileReader(quotefile));     
             String line;
             String [] words;
       	     while((line = reader.readLine()) != null) {
       	    	Quotes u = new Quotes();
       	    	
   				  words = line.split(",");
   				  
   				  u.setId(Integer.parseInt(words[0]));
   			      for(int i = 1; i< words.length;i++) {
   			    	switch (i) {
   			    	case 1:
   			    		u.setText(words[1]);
   			    		break;
   			    	
   			        case 2:
			    		u.setAuthor(words[2]);
			    		break;	   
   			      }
   			     u.setUser_id(Integer.parseInt(words[3]));
       	  }
   		   q.add(u);
       	 
          }
       	  reader.close();
         }
          
         catch(IOException ex)
         {
             ex.printStackTrace();
         }
     }
     

//    	 User u = new User();
//    	 ArrayList<User> user = new ArrayList<User>();
//    	 user.add(u);
//    	 writeIntoUser(user);
//    	 readIntoUser();
//    	 writeIntoQuotes(quotes);
//    	 readIntoQuotes();
    	 
    	 

}
