import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        displayArrReverse(arr,n-1);
    }

    public static void displayArrReverse(int[] arr, int idx) {
        if(idx==-1){
            return;
        }
        System.out.println(arr[idx]);
        displayArrReverse(arr,idx-1);

    }

}


INPUT:-
5
1
2
3
4
5

OUTPUT:--
5
4
3
2
1
