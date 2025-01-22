import java.util.*;
public class Fibonacci {
    public static void main(String [] args){
	try{
	if(args.length != 1){
		throw new IllegalArgumentException("Please provide exactly one number as argument.");
	}
        int x=Integer.parseInt(args[0]);
        int i=0;
	int j=1;
	int k=0;
	System.out.println("The fibonacci number in the sequence :");
	while(k < x){
		System.out.print(i+" ");
		int temp=i+j;
		i=j;
		j=temp;
		k++;
	}
	return ;
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
}