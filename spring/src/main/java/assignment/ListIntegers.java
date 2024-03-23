package assignment;

import java.util.*;
import java.util.stream.Collectors;

public class ListIntegers {
    public static void main(String[] args) {
        listIntegerHelper help = new listIntegerHelper();
        List<Integer> totalIntegers = new ArrayList<>();
        for(int i = 1; i <= 100; i++) {
            totalIntegers.add(i);
        }

        Set<Double> finalSet = totalIntegers.stream()
                .filter(help :: divide3).mapToDouble(Integer::intValue)
                .boxed()
                .sorted(Comparator.reverseOrder()) // Sort in descending order
                .collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(finalSet);
    }
}
