package task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        List<Integer> ints = IntStream.range(100, 1000)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(amstrongNumbers(ints));
    }

    private static int sumOfDigitsInPowOf3(int number) {
        List<String> digitsInString = Arrays.asList(String.valueOf(number).split(""));
        return digitsInString.stream()
                .mapToInt(x -> (int) Math.pow(Double.parseDouble(x), 3))
                .sum();
    }

    public static List<Integer> amstrongNumbers(List<Integer> integers) {
        return integers.stream()
                .filter(i -> i == sumOfDigitsInPowOf3(i))
                .collect(Collectors.toList());
    }
}
