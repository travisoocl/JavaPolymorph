package Controller;

import Model.*;


public class test {

    public static void main(String[] args)
    {
        colorPrinter color = new colorPrinter();
        bnwPrinter bnw = new bnwPrinter();
        color.Print("yellow");
        bnw.Print();
    }
}
