
package common;


public class Algorithsm {
//    public void convertBase2(String number) {
//        int n = Integer.parseInt(number);
//        int binary[] = new int[32];
//        int i = 0;
//        while (n !=0) {            
//            binary[i] = n%2;
//            n /= 2;
//            i++;
//        }
//        for (int j = i-1; j >= 0; j--) {
//            System.out.print(binary[j]);
//        }
//    }
    
    public String convertBinaryToOctal(String binary){
        int decimal = Integer.parseInt(binary, 2);
        return Integer.toOctalString(decimal);
    }
    
    public int convertBinaryToDecimal(String binary) {
        int decimal = Integer.parseInt(binary, 2);
        return decimal;
    }
    
    public  String convertBinaryToHexa(String binary) {
        int decimal = Integer.parseInt(binary, 2);
        return Integer.toHexString(decimal).toUpperCase();
    }
    
    public String convertOctalToBinary(String octal){
        int decimal = Integer.parseInt(octal, 8);
        return Integer.toBinaryString(decimal);
    }
    
    public int convertOctalToDecimal(String octal){
        int decimal = Integer.parseInt(octal, 8);
        return decimal;
    }
    
    public String convertOctalToHexa(String octal){
        int decimal = Integer.parseInt(octal, 8);
        return Integer.toHexString(decimal);
    }
    
    public String convertHexaToBinary(String hexa){
        int decimal = Integer.parseInt(hexa, 16);
        return Integer.toBinaryString(decimal);
    }
    
    public int convertHexaToDecimal(String hexa){
        int decimal = Integer.parseInt(hexa, 16);
        return decimal;
    }
    
    public String convertHexaToOctal(String hexa){
        int decimal = Integer.parseInt(hexa, 16);
        return Integer.toOctalString(decimal);
    }
    
    public String convertDecimalToBinary(String decimal){
        int d = Integer.parseInt(decimal, 10);
        return Integer.toBinaryString(d);
    }
    
    public String convertDecimalToOctal(String decimal){
        int d = Integer.parseInt(decimal, 10);
        return Integer.toOctalString(d);
    }
    
    public String convertDecimalToHexa(String decimal){
        int d = Integer.parseInt(decimal, 10);
        return Integer.toHexString(d);
    }
    
    

    

    
}
