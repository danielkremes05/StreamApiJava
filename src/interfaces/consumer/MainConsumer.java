package interfaces.consumer;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MainConsumer {
    public static void main (String[] args) {
        List<Person> people = new ArrayList<>();
        boolean loopCondition = true;

        while (loopCondition) {
            String name = promptForName();
            if (name == null) {
                continue;
            }

            int age = promptForAge();
            if (age == -1) {
                continue;
            }

            people.add(new Person(name, age));
            printNamesOlderThan25(people);

            if (shouldQuit()) {
                loopCondition = false;
            }
        }

        printSortedByName(people);
        printSortedByAge(people);
    }

    private static String promptForName () {
        String name = JOptionPane.showInputDialog("Enter the name ");
        if (name == null || name.isEmpty() || name.matches(".*\\d.*")) {
            JOptionPane.showMessageDialog(null, "Names cannot be empty or contain numbers. Please enter a valid name.");
            return null;
        }
        return name;
    }

    private static int promptForAge () {
        String ageInput = JOptionPane.showInputDialog("Your age ");
        try {
            return Integer.parseInt(ageInput);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid age.");
            return -1;
        }
    }

    private static void printNamesOlderThan25 (List<Person> people) {
        List<String> names = people.stream()
                .filter(person -> person.getAge() > 25)
                .map(person -> person.getName().toUpperCase())
                .toList(); // put name in the list name

        names.forEach(System.out::println);
    }

    private static boolean shouldQuit () {
        String quit = JOptionPane.showInputDialog("Would you like to quit (Y) yes N (no)?");
        return quit != null && quit.equalsIgnoreCase("Y");
    }

    private static void printSortedByName (List<Person> people) {
        System.out.println("Sorted by name:");
        people.stream()
                .sorted()
                .forEach(System.out::println);
    }

    private static void printSortedByAge (List<Person> people) {
        System.out.println("Sorted by age:");
        people.stream()
                .sorted(Person::compareToAge)
                .forEach(System.out::println);
    }
}
