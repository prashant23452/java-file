import java.util.*;
public class Prime2 {
    public static void main(String [] args){
	try{
	if(args.length != 2){
		throw new IllegalArgumentException("Please provide exactly one number as argument.");
	}
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);
	if(x > y){
		System.out.println("Please enter the range in valid format x should be smaller than y");
		return;
	}
	System.out.println("The prime numbers in range are: ");
	for(int i=x;i<=y;i++){
		if(checkprime(i)){
			System.out.print(i+" ");
		}
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