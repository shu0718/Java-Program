METHOD:------1

import java.util.*;
public class Main 
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();//taking input of numbers of row and columns(same)
        int[][] arr = new int[n][n];//initializing 2d array
        //taking input of 2d Array elements
        for(int i=0;i<n;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        //taking searched item
        int search = scn.nextInt();
        
        boolean flag = true;
        //Linear approach to find an elements in sorted data 
        for(int i=0;i<n;i++){
            for(int j=0;j<arr[0].length;j++){
               if(search==arr[i][j]){
                   flag = false;
                   System.out.println(i);
                   System.out.println(j);
                   break;
               }
            }
            
        }
        if(flag == true){
            System.out.println("Not Found");
        }
}
}









METHOD:-------2


import java.util.*;
public class Main 
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();//taking input of numbers of row and columns(same)
        int[][] arr = new int[n][n];//initializing 2d array
        //taking input of 2d Array elements
        for(int i=0;i<n;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        //taking searched item
        int search = scn.nextInt();

        int[] a = linearSearch(arr,search);
        for(int i=0;i<a.length;i++){
        System.out.println(a[i]);
        }
    }
    public static int[] linearSearch(int[][] arr, int value) {
    int i = 0, j = arr[0].length - 1; // start from top right corner

    while (i < arr.length && j >= 0) {
        if (arr[i][j] == value) {
            return new int[]{i, j};
        } else if (arr[i][j] > value) {
            j--; // move left
        } else {
            i++; // move down
        }
    }
    // element not found
    return new int[]{-1, -1};
    }
 }   
