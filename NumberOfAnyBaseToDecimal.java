/*
    Problem: Number of given base to decimal
    (1172) base 8 == (634) base 10
    
    Solution: Video 82, level 1 dsa, pepcoding 
*/

import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int b = scn.nextInt();
       int d = getValueInDecimal(n, b);
       System.out.println(d);
    }
    
    public static int getValueInDecimal(int n, int b) {
        int rv = 0;
        int multiplier = 1;
        while(n > 0) {
            rv += (n%10)*multiplier;
            n = n/10;
            multiplier*=b;
        }
        return rv;
    }
}
        