package com.project;

import java.io.IOException;
import java.util.*;

public class MainMenu {

	public static void main(String[] args) throws IOException {
		if(!((Register.u).isEmpty()) && !((Register.u).isEmpty())) {
			ReadW.readIntoUser(Register.u);
		    ReadW.readIntoQuotes(UserQ.q);
		    ReadW.writeIntoUser(Register.u);
		  //  System.out.println(Register.u[1]);
		}
		
		Scanner sc = new Scanner(System.in);
		int choice;
		Submenu s1 = Submenu.getInstance();
        do {
        	choice = 0;
        	System.out.println("-----------------------");
        	System.out.printf("0.Exit\n1.Sign In\n2.Sign Up\n");
        	System.out.println("----------------------- ");
        	System.out.print("Enter choice : ");
        	choice = sc.nextInt();
        	switch(choice) {
        	case 0:
        		   System.out.println(" Thank you for the visit ");
        		   break;
        	case 1://
//        		 For signing up --> Entering new user details. returns to main menu again.
        		 s1.authenticate();
                   break;
        	case 2:
//       		 For signing in --> to validate user entered password and email.
        		  
        		   s1.register();
        		   break;
        	default :
        		  System.out.println("Enter valid choice.");
        	}
        }while(choice != 0);
        ReadW.writeIntoUser(Register.u);
        ReadW.writeIntoQuotes(UserQ.q);
        sc.close();
	}

}