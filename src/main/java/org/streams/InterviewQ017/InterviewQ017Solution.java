package org.streams.InterviewQ017;

import java.util.*;
import java.util.stream.Collectors;

public class InterviewQ017Solution {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Spring","Microservice","Docker", "Kubernetes","Architecture","API");

        OptionalInt maxLength = words.stream()
                                     .mapToInt(String::length)
                                     .max();

        List<String> result1 = maxLength.isPresent()  ? words.stream().filter(str -> str.length() == maxLength.getAsInt()).toList()
                                                     : Collections.emptyList();

        System.out.println("result1 using maxLength and then compairing the length "+result1);

        String string = words.stream()
                             .max(Comparator.comparingInt(String::length))
                             .orElse(null);

        List<String> result2 = words.stream()
                                    .filter(str->str.length()==string.length())
                                    .collect(Collectors.toList());

        System.out.println("result2 finding length in different way and then using filter and collect "+result2);
    }
}
