package task4;

import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers implements Comparable<ListOfNumbers>{
    private List<Double> doubleList = new ArrayList<>();

    public void addNumber(Double number) {
        doubleList.add(number);
    }

    public double getAverage() {
        return doubleList.stream()
                .mapToDouble(x -> x)
                .average()
                .orElse(0.0);
    }

    @Override
    public int compareTo(ListOfNumbers otherListOfNumbers) {
        return Double.compare(this.getAverage(), otherListOfNumbers.getAverage());
    }

    @Override
    public String toString() {
        return "ListOfNumbers{" +
                "doubleList=" + doubleList +
                '}';
    }
}
