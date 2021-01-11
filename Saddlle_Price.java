import java.util.*;
public class Main
{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<arr.length;j++){
                  arr[i][j] = scn.nextInt();
            }
        }
        
        for(int i=0;i<n;i++){
            int svj = 0;
            for(int j=1;j<arr.length;j++){
                if(arr[i][j]<arr[i][svj]){
                      svj = j;
                }
               }
               
               boolean flag = true;
               for(int k=1;k<arr.length;k++){
                      if(arr[k][svj]>arr[i][svj]){
                            flag = false;
                            break;
                      }
               }
               if(flag == true){
               System.out.println(arr[i][svj]);
               return;
               }
        }
        
        System.out.println("Invalid input");
    }
    
}




Saddle:-A saddle point of a matrix is an element which is both the largest element in its column and the smallest element in its row.




INPUT:---
4
11 12 13 14
21 22 23 24
31 32 33 34
41 42 43 44

OUTPUT:-
41
