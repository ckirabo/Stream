package streamTwo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamTwo {
	
	public static void main (String args[]) {
		
		List<Integer> primeList = Arrays.asList(10,7,3,9,11);
		List<Integer> arePrimes = primeList.stream().filter(num -> isPrime(num)).collect((Collectors.toList()));
		arePrimes.forEach(System.out::println);
		
	}

	
public static boolean isPrime(int x) {
	
	       boolean prime = false;
	       
	        if(x == 0) {
	    	   return prime = false;
	       }
	        
	        else if(x == 2) {  // if it is 2
				return prime = true;	
			}
	       
	        
	        else if(!(x % 2 == 0)) { //is odd
				return prime = true;
			}
	        
	        
			
	   
	    	          
	       
				return prime = false;
}
		
	
}
