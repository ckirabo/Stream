package streamThree;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> stringL = Arrays.asList("Hello","It's","Dale");
		Optional<String> sentence = stringL
				.stream()
				.map(map -> map)
				.reduce((a,b) -> a + " " + b);
		
		sentence.ifPresent(System.out::print);
		
	}
	

}
