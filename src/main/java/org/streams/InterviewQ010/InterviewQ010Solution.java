package org.streams.InterviewQ010;

import java.util.Collections;
import java.util.List;

public class InterviewQ010Solution {
    public static void main(String[] args) {
        List<Integer> numberList = List.of(10, 25, 5, 40, 15, 40, 30, 25);
        Integer number = numberList.stream()
                                    .distinct()
                                    .sorted(Collections.reverseOrder())
                                    .skip(1)
                                    .findFirst()
                                    .orElse(null);
        System.out.println(number);


    }
}
