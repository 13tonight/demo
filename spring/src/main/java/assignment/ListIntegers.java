package assignment;

import java.util.*;
import java.util.stream.Collectors;

public class ListIntegers {
    public static void main(String[] args) {
        List<Integer> totalIntegers = new ArrayList<>();
        for(int i = 1; i <= 100; i++) {
            totalIntegers.add(i);
        }

        Set<Double> finalSet = totalIntegers.stream()
                .filter(numbers -> numbers % 3 == 0)
                .mapToDouble(Integer::doubleValue)
                .boxed()
                .sorted(Comparator.reverseOrder()) // Sort in descending order
                .collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(finalSet);
    }
}
