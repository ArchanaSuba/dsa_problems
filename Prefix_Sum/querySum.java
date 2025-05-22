package Prefix_Sum;
/*
You are given an integer array A of length N.
You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.

Input Format
************
The first argument is the integer array A.
The second argument is the 2D integer array B.
*/
import java.util.Scanner;

public class querySum {
    public static int[] createPS(int arr[]){
        int ps[] = new int[arr.length];
        ps[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            ps[i] = ps[i-1]+arr[i];
        }
        System.out.println();
        System.out.println("Prefix sum array is ");
        System.out.println();
        for(int i =0;i< arr.length;i++){
            System.out.print(" "+ps[i]);
        }
        return ps;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size");
        int n = sc.nextInt();
        int arr[]  = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Queries are ");
        System.out.print("Enter the row ");
        int row = sc.nextInt();
        System.out.print("Enter the column ");
        int column = sc.nextInt();
        System.out.println("Enter your 2D Array values ");
        int Q[][] = new int[row][column];
        for(int i = 0;i<row;i++){
            for(int j=0;j<column;j++){
                Q[i][j] = sc.nextInt();
            }
        }
        System.out.println("Print the Query");
        for(int i =0;i<row;i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(Q[i][j] + " ");
            }
            System.out.println();
        }
        int ps[] = createPS(arr);
        int sum =0;
        for(int i =0;i<Q.length;i++){
            int left_index = Q[i][0];
            int right_index = Q[i][1];
            if(left_index==0){
              sum = ps[right_index];
            }else{
              sum = ps[right_index]-ps[left_index-1];
            }
          System.out.println("Sum of the query"+sum);
        }
    }
}
