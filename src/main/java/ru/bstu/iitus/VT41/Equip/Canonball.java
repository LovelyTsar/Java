package ru.bstu.iitus.VT41.Equip;

import lombok.Data;
import ru.bstu.iitus.VT41.SportsEquipment;

@Data
public class Canonball extends SportsEquipment
{
    String material;

    public Canonball()
    {
        name="Ядро";
        material="Сталь";
        sporttype="Метание";
        mass=30;
    }
    public void init()
    {
        Systemlog.info("Материал: " + material + " Масса: " + mass);
    }
}
