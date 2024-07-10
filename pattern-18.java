/*
    Problem: Pattern 18, given n, n needs to be odd, print an hour glass like pattern
    
        *   *   *   *   *   *   *
            *               *
                *       *
                    *
                *   *   *
            *   *   *   *   *
        *   *   *   *   *   *   *
       
    
    Solution: Video 70, level 1 dsa, pepcoding 
*/

import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int startSp = 1;
        int midSp = n-4;
        
        int stars = 1; // will be required on and after half row
        for(int i=0;i<n;i++) {
            
            if(i>0 && i<n/2) {
                for(int j=0;j<startSp;j++) System.out.print("\t");
                System.out.print("*\t");
                for(int j=0;j<midSp;j++) System.out.print("\t");
                System.out.print("*\t");
                startSp++;
                midSp-=2;
            }
            else if(i==0){
                for(int j=0;j<n;j++) System.out.print("*\t");
            }
            else {
                for(int j=0;j<startSp;j++) System.out.print("\t");
                
                for(int j=0;j<stars;j++) System.out.print("*\t");
                
                startSp--;
                stars+=2;
            }
            
            System.out.println();
        }
        
        
    }
}