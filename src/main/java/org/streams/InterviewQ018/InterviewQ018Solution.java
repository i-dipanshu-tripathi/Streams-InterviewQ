package org.streams.InterviewQ018;

import java.util.Arrays;
import java.util.List;

public class InterviewQ018Solution {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(10, 25, -5, 40, 15, 30, 8, 25, 0);
        List<Integer> list2 = Arrays.asList(5, 25, 40, -5, 50, 8, 25, 0, 100);

        List<Integer> list3 = list1.stream()
                                   .distinct()
                                   .filter(val -> list2.indexOf(val) != -1)
                                   .toList();

        System.out.println("list3 using indexOf approach :"+list3);

        List<Integer> list4 = list1.stream()
                                    .distinct()
                                    .filter(val -> list2.contains(val))
                                    .toList();

        System.out.println("list4 using contains approach :"+list4);
    }
}
