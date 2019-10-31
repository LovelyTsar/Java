package ru.bstu.iitus.VT41;
import ru.bstu.iitus.VT41.Equip.*;

import java.util.ArrayList;
import java.util.Scanner;
public class Main
{
    //enum Equip {BaskBall,PongBall,Pong,Canonball,Shtan,Gir};



    public static void main(String[] args) throws Enteringex {
        java.util.logging.Logger  Systemlog = java.util.logging.Logger.getLogger("Systemlog");


        Systemlog.info("Запуск программы");

        Systemlog.info("Введите количество спортивных принадлежностей");

        //System.out.println("\nEnter the number of equipment: ");
        Scanner in = new Scanner(System.in);
        ErrorSol sol=new ErrorSol();
        int num=0;
        num=sol.tryenternumber(in,1,100);
        ArrayList<Sport> se=new ArrayList();
        //SportsEquipment[] se=new SportsEquipment[num];
        int i=0;
        int type;
        Systemlog.info("\nВведите тип: \n" +
                "1. Баскетбольный мяч\n" +
                "2. Теннисный мяч\n" +
                "3. Теннисная ракетка\n" +
                "4. Ядро\n" +
                "5. Штанга\n" +
                "6. Гиря");
        for(i = 0 ; i < num ; i++)
        {
            type=sol.tryenternumber(in,1,6);
            switch (type)
            {
                case 1:
                    se.add(new BaskBall());
                    break;
                case 2:
                    se.add(new PongBall());
                    break;
                case 3:
                    se.add(new Pong());
                    break;
                case 4:
                    se.add(new Canonball());
                    break;
                case 5:
                    se.add(new Shtan());
                    break;
                case 6:
                    se.add(new Gir());
                    break;
            }
            Systemlog.info(se.get(i).toString());
            se.get(i).getsporttype();
            se.get(i).init();
        }

        Systemlog.info("Введите вес");
        int mass=sol.tryenternumber(in,0,300);
        for(i=0;i<num;i++)
            if(se.get(i).mass==mass)
                Systemlog.info(se.get(i).name);

    }
}

