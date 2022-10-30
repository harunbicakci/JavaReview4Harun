package com.neotech.review01;

public class Deneme {
	public static void main(String[] args) {
		
		int inputSeconds, hours, minutes, seconds; 

		inputSeconds = 20394;
	

	    seconds = inputSeconds % 60;

	    hours = inputSeconds / 3600;
	    if (hours > 3600) {
	      hours = (inputSeconds - (3600));
	    } else {
	      hours = inputSeconds / 3600;
	    }

	    minutes = inputSeconds / 60;
	    if (minutes > 60) {
	      minutes = (minutes - (60 * hours));
	    } else {
	      minutes = inputSeconds / 60;
	    }
	    
	    
	    System.out.println(hours + " hours, \"" + minutes + "\" minutes, and " + seconds + " seconds");
	    
	}
}
