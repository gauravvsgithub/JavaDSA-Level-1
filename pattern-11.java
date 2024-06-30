/*
    Problem: Pattern 11 
            1
            2   3
            4   5   6
            7   8   9   10
    
    Solution: Video 56, 
*/

import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int val = 1;
        for(int i=1;i<=n;i++) {
            
            for(int j=1;j<=i;j++) {
                System.out.print(val+"\t");
                val++;
            }
            System.out.println();
        }
        
    }
}