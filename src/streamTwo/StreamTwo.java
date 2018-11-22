package streamTwo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamTwo {
	
	public static void main (String args[]) {
		
		List<Integer> primeList = Arrays.asList(10,7,3,9,11);
		
		List<Integer> arePrimes = primeList
				.stream()
				.filter(num -> isPrime(num))
				.collect((Collectors.toList()));
		
		arePrimes.forEach(System.out::println); 
		
	}

	
public static boolean isPrime(int x) {
	
	      
	       
	        if(x == 0 | x == 1) {
	    	   return false;
	        }
	        
	        else {
	        	        
	          for(int i = 2; i <x/2; i ++ ) {
	        	if((x % i == 0)) { 
	        		return false;
				}
	        }
	        return true;
	        }
	       	      	        
}
		
	
}
