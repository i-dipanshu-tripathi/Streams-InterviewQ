package org.streams.InterviewQ016;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterviewQ016Solution {
    public static void main(String[] args) {

        List<String> numberList = List.of("Java", "Spring","Microservices", "API", "Docker", "Kubernetes", "AWS");
        Map<String, Integer> stringLengthMap = numberList.stream()
                                                    .collect(Collectors.toMap(Function.identity(), String::length));

        String longestString1 = stringLengthMap.entrySet().stream()
                                                     .max(Map.Entry.comparingByValue())
                                                     .map(Map.Entry::getKey)
                                                     .orElse(null);

        System.out.println("longestString1 using stringLengthMap and max() :"+longestString1);
        String longestString2 = numberList.stream()
                                         .max(Comparator.comparingInt(String::length))
                                         .orElse(null);

        System.out.println("longestString2 using  max() method only :"+longestString2);

        String longestString3 = numberList.stream()
                                          .reduce((s1,s2)-> s1.length()>s2.length() ? s1 : s2)
                                          .orElse(null);

        System.out.println("longestString3 using  reduce() method only :"+longestString3);
    }
}
