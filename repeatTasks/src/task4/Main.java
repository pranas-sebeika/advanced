package task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first word:");
        String word1 = scanner.next();
        System.out.println("Please enter second word:");
        String word2 = scanner.next();

        System.out.println(mixStrings(word1, word2));
    }

    public static List<String> mixStrings(String s1, String s2) {
        String[] array1 = s1.split("");
        String[] array2 = s2.split("");

        int stringLength = s1.length() + s2.length();
        List<String> both = new ArrayList<>();

        for (int i = 0; i < stringLength; i++) {
            if(i + 1 <= array1.length){
                both.add(array1[i]);
            }
            if(i + 1 <= array2.length){
                both.add(array2[i]);
            }
        }
        return both;
    }
}



