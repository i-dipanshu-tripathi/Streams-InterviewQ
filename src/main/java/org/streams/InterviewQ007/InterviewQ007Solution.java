package org.streams.InterviewQ007;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterviewQ007Solution {
    public static void main(String[] args) {
        List<Integer> numberList = List.of(10, 25, 10, -5, 40, 25, 15, -5, 30, 25);

        List<Integer> duplicateElementsList1 = numberList.stream()
                        .collect(
                                Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())
                        )
                        .entrySet()
                        .stream()
                        .filter(e -> e.getValue() > 1)
                        .map(Map.Entry::getKey)
                        .toList();

        System.out.println("duplicateElementsList1: "+duplicateElementsList1);

        List<Integer> duplicateElementsList2 = numberList.stream()
                .filter(e -> numberList.indexOf(e) != numberList.lastIndexOf(e))
                .distinct()
                .toList();

        System.out.println("duplicateElementsList2: "+duplicateElementsList2);
    }
}
