package exercise7;

import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Object> mixedList = List.of(10, "apple", 5, "banana", "pear", 15);
        List<String> stringList = mixedList.stream()
                .filter(obj -> obj instanceof String)
                .map(obj -> (String) obj)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .collect(Collectors.toList());

        System.out.println(stringList);
    }
}