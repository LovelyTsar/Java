package ru.bstu.iitus.VT41.Equip;

import lombok.Data;

@Data
public class PongBall extends Ball
{
    public PongBall()
    {
        name="Теннисный мяч";
        sporttype="Теннис";
        mass=1;
        radius=1;
        color="Белый";
    }
    public  void init()
    {
        Systemlog.info("Масса: "+ mass+" Радиус: "+ radius+" Цвет: " +color);
    }
}
