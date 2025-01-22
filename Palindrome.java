import java.util.*;
public class Palindrome {
    public static void main(String [] args){
	try{
	if(args.length != 1){
		throw new IllegalArgumentException("Please provide exactly one number as argument.");
	}
        	String input=args[0];
		if(isPalindrome(input)){
			System.out.println("The given string  "+ input +" is Palindrome");
		}
		else{
			System.out.println("The given string  "+ input +" is not Palindrome");
		}
		return ;

	}
	catch(IllegalArgumentException e){
		System.err.println(e.getMessage());
	}
	catch(Exception e){
		System.err.println("An unexpected error occurred:"+e.getMessage());
	}

    }
	public static boolean isPalindrome(String input){
		String sb= new StringBuilder(input).reverse().toString();
		if(input.equals(sb)){
			return true;
		}
		else{
			return false;
		}
	}
}