package org.streams.InterviewQ004;

import java.util.List;
import java.util.stream.Collectors;

public class InterviewQ004Solution {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(10, 25, -5, 40, 15, 30, 8);

        Integer max1 = integerList.stream()
                                  .reduce(Integer.MIN_VALUE,Integer::max);

        Integer min1 = integerList.stream()
                                  .reduce(Integer.MAX_VALUE,Integer::min);

        System.out.println("Min and Max using reduce : "+min1+" "+max1);

        int max2 = integerList.stream()
                                .mapToInt(Integer::intValue)
                                .max()
                                .orElse(Integer.MIN_VALUE);

        int min2 = integerList.stream()
                              .mapToInt(Integer::intValue)
                              .min()
                              .orElse(Integer.MAX_VALUE);

        System.out.println("Min and Max using reduce : "+min2+" "+max2);

        int max3 = integerList.stream()
                              .collect(Collectors.summarizingInt(Integer::intValue))
                              .getMax();

        int min3 = integerList.stream()
                              .collect(Collectors.summarizingInt(Integer::intValue))
                              .getMin();

        System.out.println("Min and Max using summaringInt method : "+min3+" "+max3);
    }
}
