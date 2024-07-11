/*
    Problem: Pattern 19, given n, n needs to be odd, print this pattern
    
        
        *   *   *       *   type 1 row
                *       *   type 2 row
        *   *   *   *   *   type 3 row
        *       *           type 4 row
        *       *   *   *   type 5 row
                
        type 2, 4 rows will increase as n increases rest of them will remain constant.
       
    
    Solution: Video 72, level 1 dsa, pepcoding 
*/

import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int i=0;i<n;i++) {
            if(i==0) {
                for(int j=0;j<=n/2;j++) {
                    System.out.print("*\t");
                }
                int sp = n - n/2 - 2;
                for(int j=0;j<sp;j++) System.out.print("\t");
                
                System.out.print("*\t");
            }
            else if(i==n/2) {
               for(int j=0;j<n;j++) System.out.print("*\t");
            }
            else if(i==(n-1)) {
               System.out.print("*\t");
               int sp = n - n/2 - 2;
               for(int j=0;j<sp;j++) System.out.print("\t");
               for(int j=0;j<=n/2;j++) System.out.print("*\t");
            }
            else if(i<n/2){
               for(int j=0;j<n/2;j++) System.out.print("\t");
               System.out.print("*\t");
               int sp = n - n/2 - 2;
               for(int j=0;j<sp;j++) System.out.print("\t");
               System.out.print("*\t");
            }
            else {
                System.out.print("*\t");
                int sp = n - n/2 - 2;
                for(int j=0;j<sp;j++) System.out.print("\t");
                System.out.print("*\t");
                for(int j=0;j<n/2;j++) System.out.print("\t");
            }
            
            System.out.println();
        }
        
        
    }
}
        