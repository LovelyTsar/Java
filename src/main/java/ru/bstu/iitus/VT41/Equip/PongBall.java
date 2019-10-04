package ru.bstu.iitus.VT41.Equip;

public class PongBall extends Ball
{
    public PongBall()
    {
        name="PongBall";
        sporttype="PingPong";
        mass=1;
        radius=1;
        color="white";
    }
    public  void init()
    {
        System.out.printf("Mass: %d Radius: %d  Color: %s  \n", mass, radius, color);
    }
}
