package org.streams.InterviewQ011;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class InterviewQ011Solution {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 25, 5, -10, 15, -10, 30, 5);

        Optional<Integer> first = list.stream().distinct()
                                      .sorted().skip(1)
                                      .findFirst();

        System.out.println("2nd Lowest Number using distinct() + sorted() + skip() + findfirst() method : "+first.get());
    }
}
