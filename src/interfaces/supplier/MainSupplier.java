package interfaces.supplier;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class MainSupplier {
    public static void main (String[] args) {
        // Random random = new Random();

        // creation of supplier
        //Supplier<Integer> supplier = () -> random.nextInt(100);

        // creation stream to use supplier
        //Stream<Integer> randomStream = Stream.generate(supplier);

        // define limit and loop for stream randomStream
        //randomStream.limit(10).forEach(System.out::println);

        List<String> names = Arrays.asList("Daniel", "Renato", "Jose", "Aunt Eva", "Aunt Eva");

        AtomicInteger index = new AtomicInteger(0);

        Supplier<String> stringSupplier = () -> {
            int currentIndex = index.getAndUpdate(i -> (i + 1) % names.size());
            return names.get(currentIndex).toUpperCase(Locale.ROOT);
        };

        String nameSearch = JOptionPane.showInputDialog("What is the name you search?");

        Stream<String> stream = Stream.generate(stringSupplier)
                .filter(person -> person.equalsIgnoreCase(nameSearch.toUpperCase(Locale.ROOT)))
                .limit(1);

        stream.forEach(System.out::println);

    }
}
