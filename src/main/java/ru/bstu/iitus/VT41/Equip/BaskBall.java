package ru.bstu.iitus.VT41.Equip;

public class BaskBall extends Ball
{

    public BaskBall()
    {
        name="BaskBall";
        sporttype="Besketball";
        mass=1;
        radius=5;
        color="orange";
    }


    public  void init()
    {
        System.out.printf("Mass: %d Radius: %d  Color: %s  \n",mass, radius, color);
    }
}
