package org.example;

/*
 * Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
 * Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод getProduct(int name, int volume, int temperature)
 *      выдающий продукт соответствующий имени, объему и температуре
 * В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику заложенную в программе
 * Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HotDrinksMachine machine = new HotDrinksMachine();
        List<TemperatureHotDrink> products = new ArrayList<>(Arrays.asList(new TemperatureHotDrink("Coffee", 120, 70),
                new TemperatureHotDrink("Tea", 200, 70)));
        machine.setProduct(products);
        System.out.println(machine.getProduct("Tea", 200, 70).toString());
    }
}