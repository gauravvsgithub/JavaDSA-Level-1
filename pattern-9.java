/*
    Problem: Pattern 9 [Assumption: given n is odd]
    *               *
        *       *
            *   
        *       *   
    *               *
    
    Solution: Video 52, consider it as a rectangle and print only the diagonal stars
*/

import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if((i == j) || (j == n-i-1)) {
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}