package org.example;

/**
 * @param temperature -- целочисленный параметр, содержащий температуру напитка в градусах Цельсия.
 */
public class TemperatureHotDrink extends HotDrink{
    int temperature;

    public int getTemperature() {
        return temperature;
    }

    public TemperatureHotDrink(String name, int volume, int temperature) {
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name ='" + name + '\'' +
                ", volume = " + volume  +
                ", tempetarure = " + temperature +
                '}';
    }
}


