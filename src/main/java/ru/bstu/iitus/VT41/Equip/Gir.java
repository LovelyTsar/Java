package ru.bstu.iitus.VT41.Equip;

public class Gir extends Training {

    public Gir() {
        name = "Gir";
        sporttype = "Powerlifting";
        mass = 50;
    }

    public void init() {
        System.out.printf("Mass: %s  \n", mass);
    }
}
