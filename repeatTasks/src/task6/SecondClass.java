package task6;

public class SecondClass extends Counter {

    @Override
    public void increment() {
        super.increment();
        System.out.println(super.getI());
    }
}
