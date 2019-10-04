package ru.bstu.iitus.VT41.Equip;

public class Shtan extends Training
{

    public Shtan()
    {
        name="Shtan";
        sporttype="Powerlifting";
        mass=50;
    }
    public void init()
    {
        System.out.printf("Mass: %s  \n", mass);
    }
}
