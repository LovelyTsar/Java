package ru.bstu.iitus.VT41.Equip;

import lombok.Data;

@Data
public class Gir extends Training {

    public Gir() {
        name = "Гиря";
        sporttype = "Поднимание тяжестей";
        mass = 50;
    }

    public void init() {
        Systemlog.info("Масса: " + mass);
    }
}
