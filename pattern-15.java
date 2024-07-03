/*
    Problem: Pattern 15, given n, n needs to be odd, print pattern like this-
            
            1
        2   3   2
    3   4   5   4   3
        2   3   2
            1
    
    Solution: Video 64, level 1 dsa, pepcoding 
*/

import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int startVal = 1;
        int cols = 1;
        int startSpace = n/2;
        for(int i=0;i<n;i++) {
            for(int j=0;j<startSpace;j++) {
                System.out.print("\t");
            }
            
            int val = startVal;
            for(int j=0;j<cols;j++){
                System.out.print(val+"\t");
                if(j<(cols/2)) {
                    val++;
                }
                else {
                    val--;
                }
            }
            if(i<(n/2)) {
                startVal++;
                cols+=2;
                startSpace--;
            }
            else {
                startVal--;
                cols-=2;
                startSpace++;
            }
            
            System.out.println();
        }
        
        
    }
}