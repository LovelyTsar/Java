package ru.bstu.iitus.VT41;
import ru.bstu.iitus.VT41.Equip.*;

import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {

        System.out.println("\nEnter the number of equipment: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        SportsEquipment[] se=new SportsEquipment[num];
        int i=0;
        int type;
        System.out.println("\nEnter the type of equipment: \n" +
                "1. Ball of Basketball\n" +
                "2. Ball of Pong\n" +
                "3. Pong racket\n" +
                "4. Canonball\n" +
                "5. Barbell\n" +
                "6. Weight");
        for(i=0;i<num;i++)
        {
            type=in.nextInt();
            switch (type)
            {
                case 1:
                    se[i]=new BaskBall();
                    break;
                case 2:
                    se[i]=new PongBall();
                    break;
                case 3:
                    se[i]=new Pong();
                    break;
                case 4:
                    se[i]=new Canonball();
                    break;
                case 5:
                    se[i]=new Shtan();
                    break;
                case 6:
                    se[i]=new Gir();
                    break;
            }
            System.out.printf("%s\n",se[i].toString());
            se[i].getsporttype();
            se[i].init();
        }

        System.out.println("\nEnter weight: ");
        int mass = in.nextInt();
        for(i=0;i<num;i++)
            if(se[i].mass==mass)
                System.out.printf("%s, \n", se[i].toString());

    }
}

