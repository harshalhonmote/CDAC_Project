package com.project;

import java.io.IOException;
import java.util.*;
public class Submenu {
	private static Submenu ref = null;
	//private int check=0;
    
    private Submenu() { }
	static Submenu getInstance() {	
		if (ref == null)
			ref = new Submenu();

		return ref;
	}
        
        public void register() throws IOException{
            // call register method here using classname
        	Register.registerUser();
        }        

	public void authenticate()
	{   
	    // call sign in authentication code here using classname
		Register.login();
	}
   
    public static void submenu(User u) {
    	Scanner sc = new Scanner(System.in);
    	UserQ q = new UserQ();
    	int check = 0;
    	do {
    		//System.out.println("-----------------------------");
    	    System.out.printf("0.Sign Out\n1.All Quotes\n2.My Quotes\n3.My Favourite Quotes\n4.Like/Unlike Quotes\n5.New Quote\n6.Edit Quote\n7.Delete Quote\n8.Change Password\n9.Edit Profile\n");
    	    System.out.println("-----------------------------");
    	    System.out.print("Enter choice :");
            check = sc.nextInt();
            switch (check) {
            case 0:
//            	sign_out();
            	break;
            case 1:
//            	all_quotes();
            	q.allQuotes();
            	break;
            case 2:
//            	my_quotes();
            	q.myQuotes(u);
            	break;
            case 3:
   //             my_favourite_quotes();
            	FavQuotes.myFav(u);
            	break;
            case 4:
//            	like/unlike_quotes();
            	FavQuotes.like(u);
            	break;
            case 5:
//            	new_quote();
            	q.addQuote(u);
            	break;
            case 6:
//            	edit_Quotes();
            	q.editQuotes(u);
            	break;
            case 7:
//            	delete_Quotes();
            	q.deleteQuotes(u);
            	break;
            case 8:
//            	Change_Password();
            	Register.changePassword(u);
            	break;
            case 9:
//            	Edit_Profile();
            	Register.editProfile(u);
            	break;
            default :
            	System.out.println("Enter valid choice.");
            	break;
            }
        }while(check != 0);
 }		
}