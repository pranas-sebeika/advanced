package task3;

public class Main {
    public static void main(String[] args) {
        String givenText =
                "tN6WgkPg\n" +
                "eX9qZRwr\n" +
                "nQfMQjJz\n" +
                "eAEwVSfh\n" +
                "vLCnbwXK\n" +
                "HUTCjjfs\n" +
                "bRATtkPw\n" +
                "VxGSzR8y\n" +
                "qYhWYquL\n" +
                "Kk3GajkG\n" +
                "VZ3s2U9v\n" +
                "QGJXQxHc\n" +
                "AA6WZVpA\n" +
                "Cws4xyXz\n" +
                "QeY8p4aX";

        String newString = "[" + givenText.replaceAll("\n", ",") + "]";
        System.out.println(newString);

    }
}
