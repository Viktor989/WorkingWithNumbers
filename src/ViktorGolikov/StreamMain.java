package ViktorGolikov;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamMain {
    public void start(){
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        intList.stream()
                .filter(list -> list > 0)
                .filter(list -> list % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);

    }

}
