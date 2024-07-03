/*
    Problem: Pattern 13, given n, print the following triangle, looks like pascals triangle
            0
            1   1
            1   2   1
            1   3   3   1
            1   4   6   4   1
    
    Solution: Video 60, level 1 dsa, pepcoding 
*/

import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int iCj = 1; // nC0 = 1, nCn = 1
        for(int i=0;i<n;i++) {
            iCj = 1;
            for(int j=0;j<=i;j++) {
                System.out.print(iCj+"\t");
                int iCjP1 = iCj* (i-j) / (j+1); // iC(j+1)
                iCj = iCjP1;
            }
            System.out.println();
        }   
    }
}