package org.streams.InterviewQ012;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterviewQ012Solution {
    public static void main(String[] args) {
        List<Integer> numberList = List.of(10, 25, 10, -5, 40, 25, 15, -5, 30, 25);

        Map<Integer, Long> freqMap = numberList.stream()
                                               .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));

        List<Integer> uniqueValues1 = freqMap.entrySet().stream()
                                                        .filter(e->e.getValue()==1)
                                                        .map(Map.Entry::getKey)
                                                        .toList();

        System.out.println("uniqueValues1 using freqMap approach  " + uniqueValues1);

        List<Integer> uniqueValues2 = numberList.stream()
                                                .filter(no->numberList.lastIndexOf(no)==numberList.indexOf(no))
                                                .toList();

        System.out.println("uniqueValues2 using first and last index approach " + uniqueValues2);
    }
}
