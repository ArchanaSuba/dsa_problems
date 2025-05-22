package Prefix_Sum;

import java.util.Scanner;

public class createPrefixsum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr_count = sc.nextInt();
        int[] arr = new int[arr_count] ;
        for(int i=0;i<arr_count;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Length is "+arr.length);
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]);
        }
        System.out.println();
        createPrefix(arr);

    }

    private static void createPrefix(int[] arr) {
        int[] ps = new int[arr.length];                 // Array Length and Prefix sum array value are same
        ps[0]=arr[0];                                   // 0 th element should be same
        for(int i =1;i<arr.length;i++){
            ps[i] = ps[i-1]+arr[i];
        }
        for(int j=0;j<ps.length;j++){
            System.out.print(ps[j]);

        }
    }
}
