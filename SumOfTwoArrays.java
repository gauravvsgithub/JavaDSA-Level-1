/*
    Problem: Bar Chart
    1. Given two arrays as two numbers, print sum of two numbers as an array
    
    Solution: Video 100, level 1 dsa, pepcoding
    
*/

import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        for(int i=0;i<n1;i++) {
            arr1[i] = scn.nextInt();
        }
        for(int i=0;i<n2;i++) {
            arr2[i] = scn.nextInt();
        }
        
        int[] sum = new int[n1>=n2 ? n1 : n2];
        int c = 0;
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k = sum.length-1;
        while(k>=0) {
            int s = c;
            if(i>=0) s+= arr1[i];
            if(j>=0) s+= arr2[j];
            
            sum[k] = s%10;
            c = s/10;
            i--; j--; k--;
        }
        if(c>0) {
            System.out.print(c);
        }
        for(int v=0;v<sum.length;v++) {
            System.out.print(sum[v]);
        }
        
    }
}