package ru.bstu.iitus.VT41;

import lombok.Data;

interface Sport{
    String name="";
    int mass = 0;
    void getsporttype();
    void init();
}

@Data
public abstract class SportsEquipment implements Sport{
    public java.util.logging.Logger Systemlog = java.util.logging.Logger.getLogger("Systemlog");
    public  int mass;
    public String name;
    public String sporttype;
    public void getsporttype()
    {
        Systemlog.info("Вид спорта: "+sporttype);
    }
    public abstract void init();

    public String toString(){
        return "Name: "+ name;
    }
}

