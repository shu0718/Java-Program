import java.util.*;
public class Main 
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        //taking 2d array elements
        for(int i=0;i<n;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        int serh = scn.nextInt();//search item
        for(int i=0;i<n;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        boolean flag = true;
        int i = 0;
        int j = n-1;
        while(i<n && j>=0){
            if(arr[i][j]==serh){
                System.out.println(i);
                System.out.println(j);
                flag = false;
                break;
            }
            else if(arr[i][j]<serh){
                i++;
            }
            else{
                j--;
            }
            
        }
        if(flag == true){
            System.out.println("Invalid input");
        }
    }
}




INPUT:---
1 2 3 4 
5 6 7 8
9 10 11 12
13 14 15 16
10

OUTPUT:----
1 2 3 4 
5 6 7 8
9 10 11 12
13 14 15 16
2
1
