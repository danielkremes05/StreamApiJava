package interfaces.consumer;

import java.util.Arrays;
import java.util.List;

public class MainConsumerTwo {
    public static void main (String[] args) {
        List<Integer> numbers = Arrays.asList(
                1, 2, 4, 6, 10, 11, 12, 18, 20, 24
        );

//        numbers.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept (Integer integer) {
//                if (integer % 2 == 0) {
//                    System.out.println(integer);
//                }
//            }
//        });

        numbers.forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });

    }
}
