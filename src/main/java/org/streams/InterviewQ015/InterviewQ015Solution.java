package org.streams.InterviewQ015;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InterviewQ015Solution {
    public static void main(String[] args) {

        List<Integer> numberList = List.of(10, 25, 10, -5, 40, 25, 15, -5, 30, 25);

        Map<Boolean, List<Integer>> evenOddMap1 = numberList.stream()
                .collect(Collectors.partitioningBy(no -> no % 2==0));

        System.out.println("Getting even-odd list using partioningBy() method");
        System.out.println("EvenList : "+ evenOddMap1.get(true));
        System.out.println("OddList : "+ evenOddMap1.get(false));


        Map<Boolean, List<Integer>> evenOddMap2 = numberList.stream().collect(Collectors.groupingBy(no -> no % 2 == 0));
        System.out.println("Getting even-odd list using groupingBy() method");
        System.out.println("OddList : "+ evenOddMap2.get(false));
        System.out.println("EvenList : "+ evenOddMap2.get(true));

    }
}
