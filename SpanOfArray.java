/*
    Problem: Span of Array
    1. You are given an array
    2. find the span of an array
    3. Span = difference of maximum and mininum element inside the array
    
    Solution: Video 94, level 1 dsa, pepcoding
    We can do one digit at a time and then add the numbers (just like normal multiplication)
    
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
       int min = arr[0];
       for(int i=1;i<arr.length;i++) {
           max = arr[i] > max ? arr[i] : max;
           min = arr[i] < min ? arr[i] : min;
       }
       int span = max - min;
       System.out.println(span);
    }
}