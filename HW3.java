// 3. Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
// Вывести название каждой планеты и количество его повторений в списке.

import java.util.ArrayList;
import java.util.HashMap;

public class HW3 {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();
        planets.add("Меркурий");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
        planets.add("Земля");
        planets.add("Сатурн");
        planets.add("Юпитер");
        planets.add("Марс");
        planets.add("Меркурий");

        HashMap<String, Integer> planetMap = new HashMap<>();
        for (String planet : planets) {
            if (planetMap.containsKey(planet)) {
                planetMap.put(planet, planetMap.get(planet) + 1);
            } else {
                planetMap.put(planet, 1);
            }
        }

        for (String planet : planetMap.keySet()) {
            System.out.println("Планета " + planet + " встречается " + planetMap.get(planet) + " раз(а)");
        }
    }
}
