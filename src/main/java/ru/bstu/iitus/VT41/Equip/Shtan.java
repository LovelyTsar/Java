package ru.bstu.iitus.VT41.Equip;

import lombok.Data;

@Data
public class Shtan extends Training
{

    public Shtan()
    {
        name="Штанга";
        sporttype="Поднимание тяжестей";
        mass=50;
    }
    public void init()
    {
        Systemlog.info("Масса: " + mass);
    }
}
