package org.example;

/**
 * @param name -- строковый параметр, содержащий имя напитка
 * @param volume -- целочисленный параметр, содержащий объем напитка (мл)
 */
public abstract class HotDrink {
    protected String name;
    protected int volume;

    protected String getName() {
        return name;
    }

    protected int getVolume() {
        return volume;
    }
}



