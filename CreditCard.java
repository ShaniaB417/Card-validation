/* ////////////////////////////////////////////////////////////////////
//
//   Assignment: Credit Card Validation 
//   Program: CreditCard.java
//    
//   Author: Shania B
//   Date:   07/26/2022
//
//   Input: User provides credit card number 
//   Output: Credit card number the user entered, whether or not it is valid and what company the card is from. 
//   
//
// ////////////////////////////////////////////////////////////////// */
public class CreditCard {

public static boolean isValid(long num) {										//returns if card number is valid 
	return (getSize (num) >= 13 && getSize(num) <= 16) && 
		   (prefixMatched(num, 4)||
		    prefixMatched(num, 5)||
		    prefixMatched(num, 36)||
		    prefixMatched(num, 6)) &&
           ((sumOfEven(num) + sumOfOdd(num)) % 10 == 0);
}

public static int sumOfEven(long num) {											 // Get the result from Step 2
	{
        int sum = 0;
        String number = num + "";
        for (int i = getSize(num) - 2; i >= 0; i -= 2)
            sum += getDigit(Integer.parseInt(number.charAt(i) + "") * 2);
         
        return sum;
    }
 
}

public static boolean prefixMatched(long num, int d) {								// Return true if the digit d is a prefix for number
	return getPrefix (num, getSize(d)) ==d;
}


public static int sumOfOdd (long num) {
	int sum = 0;
	String number = num + "";
	
	for(int i = getSize(num) - 1; i>=0; i -=2 ) sum += getDigit(Integer.parseInt(number.charAt(i) + "") * 2);
	
	return sum;
}

public static int getDigit(int num) {										// Return this number if it is a single digit, otherwise,
																			//return the digital root 
    if(num<9)
      return num;
    return num/10 + num%10;
  }

public static int getSize(long d) {											// Return the number of digits in d
	String num = d + "";
	return num.length();
	
}

public static long getPrefix(long num, int c) {								//// Return the first c number of digits from
    																		// number. If the number of digits in number. if the number is less than c, return number.
	if (getSize(num) > c) {
		String number = num + "";
		return Long.parseLong(number.substring(0, c));
	}
	return num;
}
	

}
