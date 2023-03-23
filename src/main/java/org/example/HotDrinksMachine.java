package org.example;

import java.util.ArrayList;
import java.util.List;

public class HotDrinksMachine implements VendingMachine {

    List<TemperatureHotDrink> products = new ArrayList<>();

    public void setProduct(List<TemperatureHotDrink> products) {
        this.products = products;
    }

    @Override
    public TemperatureHotDrink getProduct(String name, int volume, int temperature) {
        for (TemperatureHotDrink product : products) {
            if ((product.getName().equals(name)) && (product.getVolume() == volume) && (product.getTemperature() == temperature)) {
                return product;
            }
        }
        return null;
    }

}

//System.out.println("Продукт: " + name + ", " + volume + " мл, " + temperature + "°С")
