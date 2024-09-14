/*
    Problem:
    1. You are given a number n
    2. You are given a base b1. n is a number on base b1
    3. You are given another base b2
    4. You are required to convert the number n of base b1 to a number in base b2
    
    (172) base 8 == (1111010) base 2
    
    Solution: Video 84, level 1 dsa, pepcoding 
                1. first convert the number of given base to decimal
                2. then convert the decimal number to asked base 
*/

import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int b1 = scn.nextInt();
       int b2 = scn.nextInt();
       int decimal = getValueInDecimal(n, b1);
       int d = getValueInBase(decimal, b2);
       System.out.println(d);
    }
    
    public static int getValueInDecimal(int n, int b1) {
        int rv = 0;
        int multiplier = 1;
        while(n > 0) {
            rv += (n%10)*multiplier;
            n = n/10;
            multiplier*=b1;
        }
        return rv;
    }
    
    public static int getValueInBase(int n, int b2) {
        int rv = 0;
        int multiplier = 1;
        while(n > 0) {
            rv += (n%b2)*multiplier;
            n = n/b2;
            multiplier*=10;
        }
        return rv;
    }
    
    
}
        