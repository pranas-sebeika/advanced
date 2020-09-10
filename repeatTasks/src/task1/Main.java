package task1;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER OPEN POINT:");
        int start = scanner.nextInt();

        System.out.println("ENTER CLOSE POINT:");
        int end = scanner.nextInt();

        while (start > end){
            System.out.println("CLOSE POINT SHOULD BE LARGER NUMBER THAT OPEN POINT");
            end = scanner.nextInt();
        }
        scanner.close();

        List<Integer> x = printOutPrimeNumbersIn(start, end);
        System.out.println(x.toString());

    }

    public static List<Integer> printOutPrimeNumbersIn(int start, int end) {
        return IntStream.rangeClosed(Math.max(start, 2), end)
                .filter(x -> !isPrime(x))
                .boxed()
                .collect(Collectors.toList());
    }

    private static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number)
                .filter(n -> number % n == 0)
                .count() > 1;
    }

}
