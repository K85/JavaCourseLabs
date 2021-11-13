package lab9_10;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountLetters {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String word = SCANNER.next();
        Stream.of(word.split(""))
                .collect(Collectors.groupingBy(String::toUpperCase, Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
