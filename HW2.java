// 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()

import java.util.ArrayList;
import java.util.Collections;

public class HW2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);

        int sum = 0;
        for (Integer number : list) {
            sum += number;
        }

        double average = (double) sum / list.size();
        int min = Collections.min(list);
        int max = Collections.max(list);

        System.out.println("Среднее арифметическое: " + average);
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
    }
}