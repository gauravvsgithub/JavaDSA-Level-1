/*
    Problem: Pattern 12, given n, print the following triangle, the numbers are in fibonacci sequence.
            0
            1   1
            2   3   5
            8   13  21  34
    
    Solution: Video 58, level 1 dsa, pepcoding 
*/

import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int one = 0, two = 1;
        
        for(int i=1;i<=n;i++) {
            
            for(int j=1;j<=i;j++) {
                System.out.print(one+"\t");
                int temp = two;
                two += one;
                one = temp;
            }
            System.out.println();
        }
        
        
    }
}