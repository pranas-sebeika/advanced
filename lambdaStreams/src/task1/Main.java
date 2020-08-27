package task1;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("a", "c", "f", "b","q");
        List<String> list2 = Arrays.asList("f", "a", "r", "h","s");

//        I don't fully understand how BiFunction works
        BiFunction<List<String>, List<String>, List<String>> f;
        f = (a, b) -> Stream.concat(a.stream(), b.stream())
                .sorted()
                .collect(Collectors.toList());

        List<String> newList = f.apply(list1, list2);
        System.out.println(newList.toString());

    }
}
