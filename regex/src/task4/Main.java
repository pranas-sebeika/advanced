package task4;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        String passwords =
                "7YeSYKrPMLd4rSAW\n" +
                "ah4uDJAWxBkX\n" +
                "720477471992\n" +
                "FJU8Phr7KAcd\n" +
                "en8wdFtunqDkmpAL\n" +
                "kkcnf95pyt99sjyz\n" +
                "2tvy5t6qj5z6htt7\n" +
                "ldxorybgheyx\n" +
                "0021673575111166\n" +
                "48esda7dd9wn9rg9\n" +
                "3QmgwjfKPMEL\n" +
                "kQe366B6X5KcXM9G\n" +
                "NsBRaeX2vDRmjfU2\n" +
                "JCWNY54NJLVA\n" +
                "5ggqS2uQgZ59Tqct\n" +
                "xibrjbktsbew";

        List<String> passwordsList = Arrays.asList(passwords.split("\n"));

        Predicate<String> isHighLvl = e -> e.matches(".*?[a-z].*?[a-z].*?")
                && e.matches(".*\\d.*\\d.*")
                && e.matches(".*[A-Z].*[A-Z].*")
                && e.length() >= 16;

        Predicate<String> isMediumLvl = e -> e.matches(".*?[a-z].*?[a-z].*?")
                && e.matches(".*\\d.*\\d.*")
                && e.matches(".*[A-Z].*[A-Z].*")
                && e.length() < 16;

        List<String> highList = passwordsList.stream()
                .filter(isHighLvl)
                .collect(Collectors.toList());

        List<String> mediumList = passwordsList.stream()
                .filter(isMediumLvl)
                .collect(Collectors.toList());

        List<String> lowList = passwordsList.stream()
                .filter(isHighLvl.negate())
                .filter(isMediumLvl.negate())
                .collect(Collectors.toList());

        System.out.println(highList);
        System.out.println(mediumList);
        System.out.println(lowList);

        Map<SecurityLvl, List<String> > sortedPass = new HashMap<>();
        sortedPass.put(SecurityLvl.HIGH, highList);
        sortedPass.put(SecurityLvl.MEDIUM, mediumList);
        sortedPass.put(SecurityLvl.LOW, lowList);

        System.out.println();
        System.out.println(sortedPass);

    }

}
