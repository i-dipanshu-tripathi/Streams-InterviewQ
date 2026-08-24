package org.streams.InterviewQ003;

import java.util.List;
import java.util.stream.Collectors;

public class InterviewQ003Solution {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(10, 20, 30, 40, 50);

        Integer sum1 = integerList.stream()
                                  .reduce(0, (x, y) -> x + y);

        System.out.println("Sum using reduce() method and lambda expression : "+sum1);

        Integer sum2 = integerList.stream()
                                  .reduce(0, Integer::sum);

        System.out.println("Sum using reduce() method and method reference "+ sum2);


        int sum3 = integerList.stream()
                               .mapToInt(x -> x)
                               .sum();

        System.out.println("Sum using primitive streams and sum method : "+sum3);

        long sum4 = integerList.stream()
                               .collect(Collectors.summarizingInt(x -> x))
                               .getSum();

        System.out.println("Sum using summaringzingInt and getSum method : "+sum4);
    }
}
