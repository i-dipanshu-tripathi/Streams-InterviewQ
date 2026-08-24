package org.streams.InterviewQ013;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterviewQ013Solution {
    public static void main(String[] args) {

        List<Integer> numberList = List.of(10, 25, 10, -5, 40, 25, 15, -5, 30, 25);
        Integer firstNoAppearedOnce = numberList.stream()
                                                .filter(no -> numberList.indexOf(no) == numberList.lastIndexOf(no))
                                                .findFirst()
                                                .orElse(null);

        System.out.println("firstNoAppearedOnce1 using first and last index approach : " + firstNoAppearedOnce);

        Map<Integer, Long> freqMap = numberList.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));

        Integer firstNoAppearedOnce2 = freqMap.entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(e -> e.getKey())
                .findFirst()
                .orElse(null);

        System.out.println("firstNoAppearedOnce2 using feqMap approach : " + firstNoAppearedOnce2);
    }
}
