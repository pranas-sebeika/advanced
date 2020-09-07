package task4;

import java.util.Arrays;

public class Helper {

    public static ListOfNumbers findWithMaxAverage(ListOfNumbers... listOfNumbers) {
        return Arrays.stream(listOfNumbers)
                .max(ListOfNumbers::compareTo)
                .orElse(new ListOfNumbers());
    }

}
