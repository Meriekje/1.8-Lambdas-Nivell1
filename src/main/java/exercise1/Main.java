package exercise1;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "orange", "banana", "pear", "melon");
        List<String> wordsWithO = words.stream()
                .filter(word -> word.contains("o"))
                .collect(Collectors.toList());

        System.out.println(wordsWithO);
    }
}