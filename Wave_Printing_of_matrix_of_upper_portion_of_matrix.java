import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();//taking input of  row
        int columns = scn.nextInt();//taking input of columns
        int[][] arr = new int[row][columns];//initialized 2d array
        //taking input through user
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        //logic to printing the 2d matric in wave
        for(int g=0;g<row;g++){
            for(int i=0,j=g;j<row;i++,j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}


INPUT:---
5 (ROW)
5(COLUMNS)
1 2 3 4 5 
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20 
21 22 23 24 25

OUTPUT:-----
1
7
13
19
25
2
8
14
20
3
9
15
4
10
5
