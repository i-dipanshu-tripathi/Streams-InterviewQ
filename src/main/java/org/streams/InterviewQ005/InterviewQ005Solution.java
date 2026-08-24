package org.streams.InterviewQ005;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class InterviewQ005Solution {
    public static void main(String[] args) {

        List<Integer> integerList = List.of(10, 20, 30, 40, 50);

        double average1 = integerList.stream()
                                    .collect(Collectors.summarizingInt(Integer::intValue))
                                    .getAverage();

        System.out.println("average1 = " + average1);

        double average2 = integerList.stream()
                                     .mapToInt(Integer::intValue)
                                     .average()
                                     .orElse(0.0);

        System.out.println("average2 = " + average2);
    }
}
