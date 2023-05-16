
/* ////////////////////////////////////////////////////////////////////
//
//   Assignment: Credit Card Validation 
//   Program: CreditCardDriver.java 
//    
//   Author: Shania B
//   Date:   07/26/2022
//
//   Input: User provides credit card number 
//   Output: Credit card number the user entered, whether or not it is valid and what company the card is from. 
//   
//
// ////////////////////////////////////////////////////////////////// */




import java.util.Scanner;

public class CreditCardDriver {

	
	public static void main(String[] args) {
		
    long cNumber;
    
    Scanner keyboard = new Scanner (System.in);
    System.out.print("Please enter your credit card Number: "); //ask user to enter a credit card number 
    cNumber = keyboard.nextLong();
    keyboard.close();
    
    
    System.out.println(cNumber + " is "+ (CreditCard.isValid(cNumber) ? "valid": "invalid"));	//tell the user if the card is invalid or valid 
    
    
    
    if(CreditCard.prefixMatched(cNumber,4)) {													//depending what the card starts with is what company its from 
    	System.out.print("Your card is from Visa");
    	
    }else if (CreditCard.prefixMatched(cNumber,5)) {
    	System.out.print("Your card is from Master Card");
    	
    }else if(CreditCard.prefixMatched(cNumber,6)) {
    	System.out.print("Your card is from Discover");
    	
    }else if(CreditCard.prefixMatched(cNumber,36)) {
    	System.out.print("Your card is from American Express");
    }else {
    	System.out.print(" The credit card number is not correct");
    }
    
    
    
    
    
    
    
    
	}
	

}
