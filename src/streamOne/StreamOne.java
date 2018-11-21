package streamOne;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> myList = Arrays.asList("Hello","It's","Dale");
		List<String> capsList = myList.stream().map(word -> word.toUpperCase()).collect((Collectors.toList()));
		capsList.forEach(System.out::print);
		
	}
	
	
	}


