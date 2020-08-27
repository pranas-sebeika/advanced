package task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String peoplePath = "/Users/sebpra/Documents/study/advanced/lambdaStreams/src/task2/people.txt";
        List<String> nameList = null;

        try {
            nameList = Files.lines(Paths.get(peoplePath))
                    .skip(1)
                    .map(line -> line.split(",")[1])
                    .distinct()
                    .sorted()
                    .collect(Collectors.toList());

        } catch (IOException ignore) { }

        assert nameList != null;
        nameList.forEach(System.out::println);
    }
}
