package org.streams.InterviewQ006;


import java.util.List;
import java.util.stream.Collectors;

public class InterviewQ006Solution {
    public static void main(String[] args) {
        List<String> names = List.of("john", "Alice", "bob", "JOHN", "pRiYa");

        List<String> namesInCaptialList1 = names.stream().map(str->str.toUpperCase()).collect(Collectors.toList());
        System.out.println(namesInCaptialList1);

        List<String> namesInCapitalList2 = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(namesInCapitalList2);
    }
}
