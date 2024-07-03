/*
    Problem: Pattern 14, given x, print the multiplication table of that number upto 10
            
            x * 1 = x
            x * 2 = 2x
            .
            .
            x * 10 = 10x
    
    Solution: Video 62, level 1 dsa, pepcoding 
*/

import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        
        for(int i=1;i<=10;i++) {
            System.out.println(x + " * " + i + " = " + x*i);
        }
        
    }
}