package com.neotech.review03;

import java.util.Scanner;

public class Deneme {
	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    String[] str = {scan.next(), scan.next(), scan.next(), 
	                    scan.next(), scan.next(), scan.next()};

	  // Do not touch above
	  // Write your code below
	    
	   int[] strInt = new int[6];
	   int indexNo = 0;
	   
	   for (int i = 0; i < str.length; i++ ) {
		    	strInt[i] = str[i].length();
		    }
		    
	   int shortestWordInt = strInt[0];
		    
	   for ( int i = 1; i < strInt.length; i++) {
		   if ( shortestWordInt > strInt[i]) {
			   shortestWordInt = strInt[i];
//			   System.out.println(str[i]); 	
//		    } else {	
//	          System.out.println(str[0]);	
	        }
	    }

	   for ( int i = 0; i < 6; i++) {
		   if ( strInt[i] == shortestWordInt ) {
			   indexNo = i;
		   }
	   }
	   System.out.println(str[indexNo]);
	}
}
