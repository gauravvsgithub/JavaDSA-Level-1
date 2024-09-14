/*
    Problem: Decimal Number to any Base 
    (634) base 10 == (1172) base 8
    
    Solution: Video 80, level 1 dsa, pepcoding 
*/

import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int b = scn.nextInt();
       int dn = getValueInBase(n, b);
       System.out.println(dn);
    }
    
    public static int getValueInBase(int n, int b) {
        int rv = 0;
        int multiplier = 1;
        while(n > 0) {
            rv += (n%b)*multiplier;
            n = n/b;
            multiplier*=10;
        }
        return rv;
    }
}
        