package org.streams.InterviewQ008;

import java.util.List;
import java.util.stream.Collectors;

public class InterviewQ008Solution {
    public static void main(String []args){
        List<Integer> numberList = List.of(10, 20, 30, 40, 50);

        double average1 = numberList.stream()
                                    .mapToInt(Integer::intValue)
                                    .average()
                                    .orElse(0);

        System.out.println("The average of the numbers is: " + average1);


        double average2 = numberList.stream()
                                    .collect(Collectors.summarizingInt(Integer::intValue))
                                    .getAverage();

        System.out.println("The average of the numbers is: " + average2);
    }
}
