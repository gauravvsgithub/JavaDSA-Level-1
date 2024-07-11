/*
    Problem: Pattern 20, given n, n needs to be odd, print this pattern (W)
    
        *               *
        *               *
        *       *       *
        *   *       *   *
        *               *
        
        *                       *
        *                       *
        *                       *
        *           *           *
        *       *       *       *
        *   *               *   *
        *                       *

       
        
       
    
    Solution: Video 74, level 1 dsa, pepcoding 
*/

import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int halfSp = (n-3)/2;
       for(int i=0;i<n;i++) {
           int sp = n-2;
           if(i<n/2 || i == n-1) {
               System.out.print("*\t");
               for(int j=0;j<sp;j++) System.out.print("\t");
               System.out.print("*\t");
           }
           else if(i==n/2) {
               System.out.print("*\t");
               for(int j=0;j<halfSp;j++) System.out.print("\t");
               System.out.print("*\t");
               for(int j=0;j<halfSp;j++) System.out.print("\t");
               System.out.print("*\t");
               halfSp--;
           }
           else {
               System.out.print("*\t");
               for(int j=0;j<halfSp;j++) System.out.print("\t");
               System.out.print("*\t");
               for(int j=0;j<(n-4-(halfSp*2));j++) System.out.print("\t");
               System.out.print("*\t");
               for(int j=0;j<halfSp;j++) System.out.print("\t");
               System.out.print("*\t");
               halfSp--;
           }
           
           System.out.println();
       }
        
        
    }
}
        