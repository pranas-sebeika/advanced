package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ar tai darbo diena? (true arba false)");
        boolean isLaborDay = scanner.nextBoolean();

        System.out.println("Ar Jūs atostogaujate? (true arba false)");
        boolean isVacation = scanner.nextBoolean();

        System.out.println( (isVacation || !isLaborDay) ? "Galima miegoti" : "Negalima miegoti");

    }
}