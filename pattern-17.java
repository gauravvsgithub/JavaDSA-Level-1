/*
    Problem: Pattern 17, given n, n needs to be odd, print a arrow like pattern
    
            *
            *   *
    *   *   *   *   * 
            *   *
            *
       
    
    Solution: Video 68, level 1 dsa, pepcoding 
*/

import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int stars = 1;
        for(int i=0;i<n;i++) {
            if(i != n/2) {
                for(int j=0;j< n/2;j++) {
                    System.out.print("\t");
                }
                
                for(int j=0;j<stars;j++) {
                    System.out.print("*\t");
                }
                if( i < n/2 - 1) {
                    stars++;
                }
                else {
                    stars--;
                }
                
            }
            else {
                stars++;
                for(int j=0;j<n;j++) {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
}