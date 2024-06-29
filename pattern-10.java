/*
    Problem: Pattern 10 [Assumption: given n is odd]
                    *
                *       *
            *               *
                *       *
                    *
                    
                    *
                *       *
            *               *
        *                       *
            *               *
                *       *
                    *
    
    Solution: Video 54, calculate spaces at starting and in mid section
*/

import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int sp = n/2;
        int midSp = 0;
        
        for(int i=1;i<=n;i++) {
            if(i==1 || i==n) {
                for(int j=0;j<sp;j++) {
                    System.out.print("\t");
                }
                System.out.print("*");
            }
            else {
                for(int j=0;j<sp;j++) {
                    System.out.print("\t");
                }
                System.out.print("*");
                for(int j=0;j<midSp;j++) {
                    System.out.print("\t");
                }
                System.out.print("*");
            }
            
            
            // System.out.println(sp+" "+midSp);
            if(i<=(n/2)) {
                midSp += 2;
                sp -= 1;
            }
            else {
                midSp -= 2;
                sp += 1;
            }
            System.out.println();
        }
    }
}