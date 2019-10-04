package ru.bstu.iitus.VT41.Equip;

import ru.bstu.iitus.VT41.SportsEquipment;

public class Canonball extends SportsEquipment
{
    String material;

    public Canonball()
    {
        name="Canonball";
        material="Steel";
        sporttype="Throwing";
        mass=30;
    }
    public void init()
    {
        System.out.printf("Material: %s  Mass: %s  \n", material, mass);
    }
}
