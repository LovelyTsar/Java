package ru.bstu.iitus.VT41;

import ru.bstu.iitus.VT41.Enteringex;

import java.util.Scanner;

public class ErrorSol {
    public int tryenternumber(Scanner in,int min, int max)
    {
        java.util.logging.Logger Systemlog = java.util.logging.Logger.getLogger("Systemlog");
        int num=1;
        String val="";
        boolean f=false;
        while (!f)
            try {
                val = in.next();
                if (!val.matches("[-+]?\\d+") || val.matches("0"))
                    throw new Enteringex("Wrong value");
                else {
                    num = Integer.parseInt(val);
                    if(num>max||num<min)
                        throw new Enteringex("Wrong value");
                    else
                        f=true;
                }
            }
            catch (Exception e) {
                Systemlog.info("Неверное значение. Введите снова");
            }
        return num;
    }
}
