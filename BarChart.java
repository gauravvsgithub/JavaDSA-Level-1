/*
    Problem: Span of Array
    1. You are given an array
    2. print the bar chart considering each number in the array as the height of the bar
    
    Solution: Video 98, level 1 dsa, pepcoding
    
*/

import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int[] arr = new int[n];
       
       for(int i=0;i<n;i++) {
            arr[i] = scn.nextInt();
       }
       
       int max = arr[0];
       for(int i=1;i<arr.length;i++) {
           max = arr[i] > max ? arr[i] : max;
       }
       
       int maxFloor = max;
       for(int floor = maxFloor; floor>=1; floor--) {
           for(int i=0;i<arr.length;i++) {
               if(floor <= arr[i]) {
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