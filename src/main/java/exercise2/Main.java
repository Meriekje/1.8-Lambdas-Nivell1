package exercise2;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "orange", "banana", "pear", "melon");
        List<String> filteredWords = words.stream()
                .filter(word -> word.contains("o") && word.length() > 5)
                .collect(Collectors.toList());

        System.out.println(filteredWords);
    }
}
