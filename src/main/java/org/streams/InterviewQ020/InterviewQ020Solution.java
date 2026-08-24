package org.streams.InterviewQ020;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterviewQ020Solution {
    public static void main(String[] args) {
        String str = "swiss";

        Map<Character, Long> frequencyMap1 = str.chars()
                                                .mapToObj(c -> (char) c)
                                                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        System.out.println("Created frequencyMap1 using groupingBy + chars method : " + frequencyMap1);

        LinkedHashMap<String, Integer> frequencyMap2 = Arrays.stream(str.split(""))
                .collect(Collectors.toMap(Function.identity(), v -> 1, Integer::sum, LinkedHashMap::new));

        System.out.println("Created frequencyMap2 using toMap + split method : " + frequencyMap2);

        Optional<String> result1 = Arrays.stream(str.split(""))
                                         .filter(demostr->str.indexOf(demostr)==str.lastIndexOf(demostr))
                                         .findFirst();

        System.out.println("Result1 using Arrays.stream()+first index and last index equal approach: "+result1);

        Optional<Character> result2 = str.chars()
                                         .mapToObj(ch->(char)ch)
                                         .filter(demostr->str.indexOf(demostr)==str.lastIndexOf(demostr))
                                         .findFirst();

        System.out.println("Result2 using chars()+mapToObj() method + first index and last index equal approach : "+result2);

        Optional<Character> result3 = frequencyMap1.entrySet().stream()
                                                              .filter(entry->entry.getValue()==1)
                                                              .map(Map.Entry::getKey).findFirst();

        System.out.println("Result3 using freqMap1/freqMap2 +frequency==1 approach "+result3);

    }
}
