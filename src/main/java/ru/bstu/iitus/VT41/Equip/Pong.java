package ru.bstu.iitus.VT41.Equip;

import lombok.Data;
import ru.bstu.iitus.VT41.SportsEquipment;

@Data
public class Pong extends SportsEquipment
{
    String color;
    String material;

    public Pong()
    {
        name="Теннисная ракетка";
        sporttype="Теннис";
        mass=1;
        color="blue";
        material="wood";
    }
    public  void init()
    {
        System.out.printf("Масса: "+mass+" Цвет: " +color+ " Материал: "+material);
    }
}
