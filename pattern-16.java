/*
    Problem: Pattern 16, given n, n needs to be odd, print pattern like this-
            
        1                       1
        1   2               2   1
        1   2   3       3   2   1
        1   2   3   4   3   2   1
    
    Solution: Video 66, level 1 dsa, pepcoding 
*/

import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int spaces = 2*n - 3;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(j + "\t");
            }
            for(int j=0;j<spaces;j++) {
                System.out.print("\t");
            }
            int start = (i==n) ? i-1 : i;
            for(int j=start;j>=1;j--) {
                System.out.print(j + "\t");
            }
            spaces -= 2;
            System.out.println();
        }
    }
}