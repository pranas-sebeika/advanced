package task1;

public class Main {
    public static void main(String[] args) {

        String randomText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor\n" +
                "incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis\n" +
                "nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.\n" +
                "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu\n" +
                "fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in\n" +
                "culpa qui officia deserunt mollit anim id est laborum.";

        String replacelL = randomText.replaceAll("\\b(?i)[l]\\w+", "******");

        System.out.println(replacelL + "\n");

        String eachWordInNewLine = randomText.replaceAll(" ", "\n");

        System.out.println(eachWordInNewLine + "\n");

        String comaAndDotAreLastSymbols = randomText
                .replaceAll("\n", " ")
                .replaceAll(", ", ",\n")
                .replaceAll("\\. ", ".\n");

        System.out.println(comaAndDotAreLastSymbols + "\n");

    }
}
