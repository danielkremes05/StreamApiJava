package interfaces.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainFunction {
    public static void main (String[] args) {

//        List<People> peopleList = new ArrayList<>();
//
//        boolean condition = true;
//
//        while (condition) {
//
//            String namePeople = JOptionPane.showInputDialog("Insert the name ?");
//            String agePeople = JOptionPane.showInputDialog("Insert the age ?");
//            int agePeopleSystem = Integer.parseInt(agePeople);
//
//            People people = new PeopleBuilder().setName(namePeople).setAge(agePeopleSystem).creationPeople();
//
//            peopleList.add(people);
//
//            List<String> result = peopleList.stream().filter(person -> person.getAge() > 25).map(person -> person.getName().toUpperCase()).sorted().toList();
//
//            result.stream().limit(10).forEach(System.out::println);
//
//            String quit = JOptionPane.showInputDialog("Would you like to continue ?  (Y: yes) (N: not)");
//
//            if (quit == null || quit.equalsIgnoreCase("N")) {
//                condition = false;
//            }
//
//        }

        // Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Use Function with lambda expression to fold all numbers
        Function<Integer, Integer> fold = number -> number * 2;

        // Use the function to fold all the numbers in the Stream and store them in another list
        List<Integer> foldedNumbers = numbers.stream()
                .map(fold)
                .toList();

        // Print the list of folded numbers
        foldedNumbers.forEach(System.out::println);

    }
}
