/*
    Problem:
    1. Given two arrays as two numbers, print difference of two numbers as an array
    2. given arr2 is greater than arr1 as a number
    3 we have to find arr2 - arr1
    
    Solution: Video 102, level 1 dsa, pepcoding
    
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
        
        int[] diff = new int[n2];
        int c = 0;
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k = diff.length-1;
        int multiplier = 10;
        while(k>=0) {
            int d = 0;
            int arr1val = i < 0 ? 0 : arr1[i];
            arr2[j] -= c;
            
            if(arr2[j] >= arr1val) {
                d = arr2[j] - arr1val;
                c=0;
            }
            else {
                c = 1;
                d = arr2[j] + c*multiplier - arr1val;
            }
            
            diff[k] = d;
            i--; j--; k--;
        }
        
        int idx = 0;
        while(idx < diff.length) {
            if(diff[idx] == 0) idx++;
            else break;
        }
        
        while(idx < diff.length) {
            System.out.print(diff[idx]); idx++;
        }
        
    }
}