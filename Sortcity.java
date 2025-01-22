import java.util.*;
public class Sortcity {
    public static void main(String [] args){
	try{
	if(args.length == 0){
		throw new IllegalArgumentException("Please provide exactly one number as argument.");
	}
        	ArrayList<String> al= new ArrayList<>();
		for(int i=0;i<args.length;i++){
			if(!args[i].matches("[a-zA-Z]+")){
				System.out.println("Please Enter valid names of the city");
				return;
			}
			al.add(args[i]);
			
		}
		Collections.sort(al);
		System.out.println("City's name in ascending order :");
		for(String str : al){
			System.out.print(str+" ");
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
	
}