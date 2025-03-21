package session4;

import java.util.Scanner;

public class Stringmethods {
	
   public static void main(String[] args) {
			//String s1 = "Java Program";
			//1.length
			//System.out.println(s1.length());
			
			//2.equals()
			//3.equalIgnoreCase()
			/*Scanner = new Scanner(System.in);
			
			System.out.println("Enetr username: ");
			String Username = sc.nextLine() ;
			
			System.out.println("Enter password: ");
			String password = sc.next();
			
			//if(Username.equals("admin") && password.equals("admin@123")) {
				if(Username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin@123")) {
				System.out.println("Success");
			}else {
				System.out.println("Error 404 found ");
			}*/
			
			// String s2 = "Aashudas";
			 //String S3 = "Aashudas";
			  
			  //System.out.println(s2.equals(S3));
			
			  //==
			 /* String s4 = "Aashudas";
			  String s5 = "Aashudas";
			  
			  System.out.println(s4==s5);*/
			  /*String name = new String("Aashu");
			  String name1 = new String("Aashu");
			  System.out.println(name==name1);
			  
			  //compare to
			  //s1>s2-->positive number
			  //s1<s2-->negative number
			  //s1==s2-->0
			
			  String s6 = "hellos";
			  String s7 = "hellos";
			  
			  System.out.println(s6.compareTo(s7));
			  
			  //concat
			  String str1 = "static";
			  String str2 = new String("program");
			  System.out.println(str1.concat(str2));*/
			  
			  //toCharArray()
	   
			  String str3 = "Welcome to java";
			  System.out.println("Value of method: ");
			  char[] ch = str3.toCharArray();
			  for(char st: ch) {
				  System.out.println(st);
			  }
			 /* System.out.println(str3.toCharArray());
			  
			  //SubString
			  System.out.println(str3.substring(5));
			  System.out.println(str3.substring(0, 9));*/
			  
			  //intern
			  String clg = "Kgisl";
			  String clg1 = new String("Kgisl");
			  String str4 = clg1.intern();
			  
			  System.out.println(clg==str4);

		}

	}



