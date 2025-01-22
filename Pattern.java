import java.util.*;
public class Pattern {
    public static void main(String [] args){
	try{
		if(args.length != 1){
			throw new IllegalArgumentException("Please provide exactly one number as argument.");
		}
        	int x=Integer.parseInt(args[0]);
		char [][] arr = new char[x][x];
		for(int i=0;i<x;i++){
			Arrays.fill(arr[i], '*');
		}
		for(int i=0;i<x;i++){
			for(int j=0;j<=i;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
        
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.err.println(e.getMessage());
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