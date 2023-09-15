
package controller;

import common.Algorithsm;
import common.Library;
import model.Number;
import view.Menu;

public class ConvertBaseNumber extends Menu<String>{
    static String[] mc = {"Enter binary: ", "Enter octal: ", "Enter hexadecimal: ", "Enter decimal: " ,"Exit"};
    
    protected Library library;
    protected Algorithsm algorithsm;
    protected Number number;
    protected String numbers;

    public ConvertBaseNumber(Number number) {
        super("CONVERT NUMBER", mc);
        library = new Library();
        algorithsm = new Algorithsm();
        numbers = number.getNumber();
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                numbers = library.checkInputBinary();
                menuConvertFromBinary();
                break;
            case 2:
                numbers = library.checkInputOctal();
                menuConvertFromOctal();
                break;
            case 3:
                numbers = library.checkInputHexaDecimal();
                menuConvertFromHexa();
                break;
            case 4:
                numbers = library.checkInputDecimal();
                menuConvertFromDecimal();
                break;
            case 5:
                System.out.println("Exit the program successfully!");
                System.exit(0);
                break;
        }
    }
    
    public void menuConvertFromBinary(){
        final String[] mcConvertFromBinary = {"Convert base 8", "Convert base 10", "Convert base 16", "Exit!"};
        class MenuConvertFromBinary extends Menu<String>{
            
            public MenuConvertFromBinary() {
            super("Convert Opition", mcConvertFromBinary);
        }

            @Override
            public synchronized void execute(int n) {
                switch (n) {
            case 1:
                System.out.println("Covert "+ numbers + " to Octal: "+ algorithsm.convertBinaryToOctal(numbers));
                break;
            case 2:
                System.out.println("Covert "+ numbers + " to Decimal: " + algorithsm.convertBinaryToDecimal(numbers)); 
                break;
            case 3:
                System.out.println( "Covert "+ numbers + " to Hexa: " + algorithsm.convertBinaryToHexa(numbers));
                break;
            case 4:
                System.out.println("Exit!");
                break;
                }
        }
    }
        MenuConvertFromBinary mc = new MenuConvertFromBinary();
        mc.run1();
}
    
    public void menuConvertFromOctal(){
        final String[] mcConvertFromOctal = {"Convert base 2", "Convert base 10", "Convert base 16", "Exit!"};
        class MenuConvertFromOctal extends Menu<String>{
            
            public MenuConvertFromOctal() {
            super("Convert Opition", mcConvertFromOctal);
        }

            @Override
            public synchronized void execute(int n) {
                switch (n) {
            case 1:
                System.out.println("Covert "+ numbers + " to Binary: " + algorithsm.convertOctalToBinary(numbers));
                break;
            case 2:
                System.out.println("Covert "+ numbers + " to Decimal: " + algorithsm.convertOctalToDecimal(numbers));
                break;
            case 3:
                System.out.println("Covert "+ numbers + " to Hexa: " + algorithsm.convertOctalToHexa(numbers));
                break;
            case 4:
                System.out.println("Exit!");
                break;
                }
        }
    }
        MenuConvertFromOctal mc = new MenuConvertFromOctal();
        mc.run1();
}
    
    public void menuConvertFromHexa(){
        final String[] mcConvertFromHexa = {"Convert base 2", "Convert base 8", "Convert base 10", "Exit!"};
        class MenuConvertFromHexa extends Menu<String>{
            
            public MenuConvertFromHexa() {
            super("Convert Opition", mcConvertFromHexa);
        }

            @Override
            public synchronized void execute(int n) {
                switch (n) {
            case 1:
                System.out.println("Covert "+ numbers + " to Binary: "+ algorithsm.convertHexaToBinary(numbers));
                break;
            case 2:
                System.out.println( "Covert "+ numbers + " to Decimal: "+ algorithsm.convertHexaToDecimal(numbers));
                break;
            case 3:
                System.out.println( "Covert "+ numbers + " to Octal: " + algorithsm.convertHexaToOctal(numbers));
                break;
            case 4:
                System.out.println("Exit!");
                break;
                }
        }
    }
        MenuConvertFromHexa mc = new MenuConvertFromHexa();
        mc.run1();
}
    
    public void menuConvertFromDecimal(){
        final String[] mcConvertFromDecimal = {"Convert base 2", "Convert base 8", "Convert base 16", "Exit!"};
        class MenuConvertFromDecimal extends Menu<String>{
            
            public MenuConvertFromDecimal() {
            super("Convert Opition", mcConvertFromDecimal);
        }

            @Override
            public synchronized void execute(int n) {
                switch (n) {
            case 1:
                System.out.println("Covert "+ numbers + " to Binary: " + algorithsm.convertDecimalToBinary(numbers));
                break;
            case 2:
                System.out.println( "Covert "+ numbers + " to Octal: " + algorithsm.convertDecimalToOctal(numbers)); 
                break;
            case 3:
                System.out.println("Covert "+ numbers + " to Hexa: " + algorithsm.convertDecimalToHexa(numbers));
                break;
            case 4:
                System.out.println("Exit!");
                break;
                }
        }
    }
        MenuConvertFromDecimal mc = new MenuConvertFromDecimal();
        mc.run1();
}
}
