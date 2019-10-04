package ru.bstu.iitus.VT41.Equip;

import ru.bstu.iitus.VT41.SportsEquipment;

public class Pong extends SportsEquipment
{
    String color;
    String material;

    public Pong()
    {
        name="Pong";
        sporttype="PingPong";
        mass=1;
        color="blue";
        material="wood";
    }
    public  void init()
    {
        System.out.printf("Mass: %d Color: %s  Material: %s  \n",mass, color, material);
    }
}
