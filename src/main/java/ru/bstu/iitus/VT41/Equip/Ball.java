package ru.bstu.iitus.VT41.Equip;

import lombok.Data;
import ru.bstu.iitus.VT41.SportsEquipment;
@Data
public class Ball extends SportsEquipment
{
    int radius;
    String color;
    public void init()
    {
    }
}
