package org.streams.InterviewQ001;

import java.util.List;
import java.util.stream.Collectors;

public class InterviewQ001Solution {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 15, 20, 25, 30, 33, 40);
        List<Integer> evenNumberList = list.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toList());
        System.out.println(evenNumberList);
    }
}
