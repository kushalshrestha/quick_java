/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * LinkedIn : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package design_patterns.solid_design_principles;


import java.io.File;

public class ISPDemo {
    public static void main(String[] args) {
        System.out.println("See code for how or why machine interface is seperated");
    }

}

interface Machine {
    void printDocument(File f);

    void scanDocument(File f);

    void faxDocument(File f);
}

// let's create a old printer
class OldFashionedPrinter implements Machine {
    @Override
    public void printDocument(File f) {

    }

    @Override
    public void scanDocument(File f) {
        //scan is not supported in old printers so the better approach would be to follow Interface Segregation Principle
        // i.e create 3 different interfaces printer, scanner, faxMachine
    }

    @Override
    public void faxDocument(File f) {

    }
}

interface Printer {
    void printDocument(File f);
}

interface Scanner {
    void scanDocument(File f);
}

// so new printers can be like:
class NewPrinters implements Printer, Scanner {

    @Override
    public void printDocument(File f) {

    }

    @Override
    public void scanDocument(File f) {

    }
}