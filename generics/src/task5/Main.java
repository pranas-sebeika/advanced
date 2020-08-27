package task5;

public class Main {
    public static void main(String[] args) {

        SuperPair<String, String, Integer> superPair1 = new SuperPair<>("string", "string", 123);
        SuperPair<Object, String, Float> superPair3 = new SuperPair<>(new Object(), "string", 0.123f);
//        SuperPair<Double, Object, String> superPair2 = new SuperPair<>(123d, new Object(), "a");
    }
}
