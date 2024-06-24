package interfaces.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MainPredicate {
    public static void main (String[] args) {
        List<String> words = Arrays.asList("Java", "Python", "PHP", "JavaScript");

        Predicate<String> moreFiveCaracters = word -> word.length() > 5;

        words.stream()
                .filter(moreFiveCaracters)
                .forEach(System.out::println);
    }
}
