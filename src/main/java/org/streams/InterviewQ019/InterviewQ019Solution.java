package org.streams.InterviewQ019;


import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class InterviewQ019Solution {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(10, 25, -5, 40, 15, 30, 8, 25, 0, 15);
        List<Integer> list2 = Arrays.asList(5, 25, 40, -5, 50, 8, 100);

        List<Integer> list3 = list1.stream().filter(val -> list2.indexOf(val) == -1).distinct().toList();
        System.out.println("List 3 using first and last index approach : "+list3);

        List<Integer> list4 = list1.stream()
                                    .distinct()
                                    .filter(val -> !list2.contains(val))
                                    .toList();

        System.out.println("List 4 using linear search of each element from list1 into list2 : "+list4);

    }
}
