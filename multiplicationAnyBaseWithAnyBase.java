/*
    Problem:
    1. You are given two numbers in base b
    2. print the multiplication of these two numbers in the same given base
    
    Solution: Video 90, level 1 dsa, pepcoding
    We can do one digit at a time and then add the numbers (just like normal multiplication)
    
*/

import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int b = scn.nextInt();
       int n1 = scn.nextInt();
       int n2 = scn.nextInt();
       
       int d = 0;
       int multiplier = 1;
       while(n2 > 0) {
           int m = getMultiplicationSingleDigit(b, n1, n2%10);
        //   System.out.println(m);
           d = getSum(b, m*multiplier, d);
           n2 /= 10;
           multiplier*=10;
       }
       System.out.println(d);
    }
    
    public static int getMultiplicationSingleDigit(int b, int n, int d) {
        
        int rv = 0;
        int c = 0;
        int multiplier = 1;
        while(n>0 || c>0) {
            int a = n%10;
            n /= 10;
            a = a*d + c;
            
            c = a/b;
            a = a%b;
            rv += a*multiplier;
            multiplier *= 10;
        }
        
        return rv;
    }
    
    public static int getSum(int b, int n1, int n2) {
        int rv = 0;
        int c = 0;
        int multiplier = 1;
        while(n1>0 || n2>0 || c>0) {
            int d1 = n1%10;
            int d2 = n2%10;
            n1 /= 10;
            n2 /= 10;
            
            int d = d1 + d2 + c;
            c = d/b;
            d = d%b;
            rv += d*multiplier;
            multiplier *= 10;
        }
        
        return rv;
    }
    
    
}
        