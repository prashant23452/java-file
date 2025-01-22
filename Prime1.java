import java.util.*;
public class Prime1 {
    public static void main(String [] args){
	try{
	if(args.length != 1){
		throw new IllegalArgumentException("Please provide exactly one number as argument.");
	}
        int x=Integer.parseInt(args[0]);
        if(checkprime(x)){
            System.out.println(x+" is a prime number");
        }
        else{
            System.out.println(x+" is not a prime number");
        }
	}
	catch(NumberFormatException e){
		System.err.println("Invalid input please enter a valid integer");
	}
	catch(IllegalArgumentException e){
		System.err.println(e.getMessage());
	}
	catch(Exception e){
		System.err.println("An unexpected error occurred:"+e.getMessage());
	}

    }
    public static boolean checkprime(int x){
        if(x < 2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(x);i++){
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }
}