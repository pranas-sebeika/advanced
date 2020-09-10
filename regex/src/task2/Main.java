package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        String emailValid = "vardas@codeacademy.lt";
//        String emailNonValid = "vardas@codea@cademy.lt";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a valid email: ");

        if(isEmailValid(scanner.next())){
            System.out.println("Email is valid");
        } else {
            System.out.println("Email is invalid");
        }
    }

    public static boolean isEmailValid(String email) {
        String emailRegex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w]{2,3}$";
        return email.matches(emailRegex);
    }
}
