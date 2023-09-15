
package common;

import java.util.Scanner;

public class Library {
   
    private final static Scanner sc = new Scanner(System.in);
    private static final String BINARY_VALID = "[0-1]*";
    private static final String OCTAL_VALID = "[0-7]*";
    private static final String DECIMAL_VALID = "[0-9]*";
    private static final String HEXADECIMAL_VALID = "[0-9A-F]*";
    
     public int getInt(String promt, int m, int n) {
        int a = -1;
        while (true) {
            System.out.print(promt + ": ");
            try {
                String s = sc.nextLine();
                a = Integer.parseInt(s);
                if (a >= m && a <= n) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Please enter a number between " + m + " and " + n);
            }
        }
        return a;
    }
    
    public static String checkInputBinary() {
        System.out.print("Enter number binary: ");
        String result;
        while (true) {
            result = sc.nextLine().trim();
            if (result.matches(BINARY_VALID)) {
                return result;
            }
            System.err.println("Must be enter 0 or 1");
            System.out.print("Enter again: ");
        }
    }
    
    public static String checkInputDecimal() {
        System.out.print("Enter number decimal: ");
        String result;
        while (true) {
            result = sc.nextLine().trim();
            if (result.matches(DECIMAL_VALID)) {
                return result;
            }
            System.err.println("Must be enter 0-9");
            System.out.print("Enter again: ");
        }
    }
    
    public static String checkInputOctal() {
        System.out.print("Enter number octal: ");
        String result;
        while (true) {
            result = sc.nextLine().trim();
            if (result.matches(OCTAL_VALID)) {
                return result;
            }
            System.err.println("Must be enter 0 - 7");
            System.out.print("Enter again: ");
        }
    }
    
    public static String checkInputHexaDecimal() {
        System.out.print("Enter number hexadecimal: ");
        String result;
        while (true) {
            result = sc.nextLine().trim();
            if (result.matches(HEXADECIMAL_VALID)) {
                return result;
            }
            System.err.println("Must be enter 0-9 A-F");
            System.out.print("Enter again: ");
        }
    }


}
