import java.util.*;
public class Main 
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        //initializing the 2D matrix
        int[][] arr = new int[n][n];
        //Taking input of 2D matrix 
        for(int i=0;i<n;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        //Simply change the indexes to rotate the matrix
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
        
        
         }
}




INPUT:-
1 2 3 4 
5 6 7 8
9 0 1 2 
3 4 5 6


OUTPUT:- 
3 9 5 1 
4 0 6 2 
5 1 7 3 
6 2 8 4
