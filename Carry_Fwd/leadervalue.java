package Carry_Fwd;

import java.util.Scanner;

public class leadervalue {

    public static void find_leader(int arr[]){
        int n = arr.length;
        int ans = 1;
        int max_value = arr[n-1];        //9 5 7 6
        for (int i = n-1;i>=0;i--){
           for(int j = i-1;j>=0;j--){
               if(arr[j]<max_value){
                   max_value =arr[j] ;
                   ans = ans+1;
               }
           }
        }
        System.out.println("Leader count is "+ans);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int arr_size = sc.nextInt();
        int arr[] = new int[arr_size];
        for(int i =0;i<arr.length;i++){   // Run time array input
            arr[i]= sc.nextInt();
        }
        for(int j=0;j<arr.length;j++){    // print the array
            System.out.print(" "+arr[j]);
        }
        find_leader(arr);
    }
}
