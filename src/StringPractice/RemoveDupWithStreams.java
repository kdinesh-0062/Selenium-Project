package StringPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDupWithStreams {
	public static void main(String[] args) {
        String[] words = {"api", "rest", "api", "bdd"};

        
       List<String> list = Arrays.stream(words).distinct().collect(Collectors.toList());
       System.out.println(list);
        
        
	}

}
