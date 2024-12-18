package com.sandeep.java21.newfeature;

public class PatternMatchSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String response = "yeah";
		switch(response) {
		case "yes":
	    case "yeah":
	        System.out.println("You said yes!");
	        break;
	    case "no":
	    case "nope":
	        System.out.println("You said no!");
	        break;
	    default:
	        System.out.println("Please choose.");
				
		}
		
		switch(response) {
		case  "yes","yesy"->System.out.println("You said yes!");
		case "no", "nope" -> System.out.println("You said no!");
	    default -> System.out.println("Please choose.");
		}
		
		String userInput = "User Input"; 
		 
		try { 
		    int number = Integer.parseInt(userInput);
		    // Use 'number'
		} catch (NumberFormatException un_) {
		    System.out.println("Invalid input: " + userInput);
		}
	}

}
