package ru.bstu.iitus.VT41;
public abstract class SportsEquipment {
    public  int mass;
    public String name;
    public String sporttype;
    public void getsporttype()
    {
        System.out.printf("Sporttype: %s\n", sporttype);
    }
    public abstract void init();

    public String toString(){
        return "Name: "+ name;
    }
}

