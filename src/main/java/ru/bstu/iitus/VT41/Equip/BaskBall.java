package ru.bstu.iitus.VT41.Equip;

import lombok.Data;

@Data
public class BaskBall extends Ball
{

    public BaskBall()
    {
        name="Баскетбольный мяч";
        sporttype="Баскетбол";
        mass=1;
        radius=5;
        color="Оранжевый";
    }


    public  void init()
    {
        Systemlog.info("Масса: " + mass + " Радиус: " + radius + " Цвет: " + color);
    }
}
