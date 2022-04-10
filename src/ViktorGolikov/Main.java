package ViktorGolikov;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> positiveList = new ArrayList<>();
        for (int list : intList) {       //отбор всех положительных значений
            if (list > 0) {
                positiveList.add(list);
            }
        }
        List<Integer> evenNumbersList = new ArrayList<>();
        for (int list : positiveList) {  //Отбор всех четных чисел
            if (list % 2 == 0) {
                evenNumbersList.add(list);
            }
        }
        evenNumbersList.sort(Comparator.naturalOrder()); //Сортировка

        System.out.println("работа с коллекцией");
        System.out.println(evenNumbersList);

        System.out.println("работа со стримами");
        StreamMain streamMain = new StreamMain();
        streamMain.start();
    }
}
