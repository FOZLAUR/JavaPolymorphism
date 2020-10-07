package model;

public class Printer {
    public String printerBrand;

    public Printer() {
        printerBrand = "HP";
    }

    public String getPrinterBrand() {
        return printerBrand;
    }

    public void setPrinterBrand(String printerBrand) {
        this.printerBrand = printerBrand;
    }

    public void print(){
        System.out.println("I am currently printing.");
    }

    public void printStatus(String paperType){
        System.out.println("Printing on paper sized "+paperType);
    }

    public void printStatus(double width, double length){
        System.out.println("Printing on paper with dimensions: "+width+" X "+length);
    }
}
