package org.streams.InterviewQ002;

import java.util.List;

public class InterviewQ002Solution {
    public static void main(String[] args) {
        int threshold = 20;
        List<Integer> integerList = List.of(10, 25, 5, 40, 15, 30, 8);

        List<Integer> list = integerList.stream()
                .filter(x -> x > threshold)
                .toList();

        System.out.println(list);
    }
}
