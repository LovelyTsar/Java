package ru.bstu.iitus.VT41;

import java.util.Scanner;

public class Enteringex extends Exception {
    public Enteringex(String text)
    {
        super(text);
    }
    public Enteringex(String text,Exception innerEx)
    {
        super(text,innerEx);
    }
}

