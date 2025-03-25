package streamApi;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);
//        listOfNumbers.parallelStream().forEach(number ->
//                System.out.println(number + " " + Thread.currentThread().getName())
//        );
        
        listOfNumbers.parallelStream().forEach(n -> System.out.println(n + " " + Thread.currentThread().getName()));
    }
}
