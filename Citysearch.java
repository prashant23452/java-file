import java.util.*;
class NotMatchFoundException extends Exception{
	public NotMatchFoundException(String message){
		super(message);
	}
}
public class Citysearch{
	public static void searchCity(Set<String> cities) throws NotMatchFoundException{
		if(!cities.contains("Kolkata")){
			throw new NotMatchFoundException("Kolakata not found in the list");
		}
		System.out.println("Kolata found in the list ");
	}
	public static void main(String [] args){
		HashSet<String> city= new HashSet<>();
		city.add("Chennai");
		try{
			searchCity(city);
		}
		catch(NotMatchFoundException e){
			System.out.println(e.getMessage());
		}
			
	}
}