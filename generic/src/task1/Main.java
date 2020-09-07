package task1;

public class Main {

    public static String[] strings = { "a", "b", "c" };
    public static Integer[] integers = { 1, 2, 3, 4 };

    public static void main(String[] args) {

        printArray(integers);
        printArray(strings);
    }

    public static <T> void printArray(T[] array) {
        for (T t : array) {
            System.out.println(t);
        }
    }

}
