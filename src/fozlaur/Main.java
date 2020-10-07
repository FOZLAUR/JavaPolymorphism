package fozlaur;

import model.BWPrinter;
import model.ColorPrinter;

public class Main {
    public static void main(String[] args) {
        //Instantiate both printers
        ColorPrinter cp = new ColorPrinter();
        BWPrinter bw = new BWPrinter();

        //Print out Printer Brands
        System.out.println(cp.getPrinterBrand());
        System.out.println(bw.getPrinterBrand());

        //Overriding Methods in Subclasses
        cp.print();
        bw.print();

        //Overriding Methods in Parent Class
        cp.printStatus("A4");
        bw.printStatus(8.5,11);

        bw.printStatus("Legal");
        cp.printStatus(8.5,14);
    }
}
