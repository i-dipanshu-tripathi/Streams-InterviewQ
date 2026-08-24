package org.streams.InterviewQ014;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterviewQ014Solution {
    public static void main(String[] args) {

        List<Integer> numberList = List.of(10, 25, 10, -5, 40, 25, 15, -5, 30, 25);

        Integer duplicate1 = numberList.stream()
                                       .filter(no -> numberList.indexOf(no) != numberList.lastIndexOf(no))
                                       .findFirst()
                                       .orElse(null);

        System.out.println("Duplicate 1 using first and last index approach : " + duplicate1);

        Map<Integer, Long> freqMap = numberList.stream()
                                                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));

        Integer duplicate2 = freqMap.entrySet().stream()
                                               .filter(e -> e.getValue() > 1)
                                               .map(e -> e.getKey())
                                               .findFirst()
                                               .orElse(null);

        System.out.println("Duplicate 2 using freqMap: " + duplicate2);
    }
}
