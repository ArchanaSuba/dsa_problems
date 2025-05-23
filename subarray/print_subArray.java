package subarray;

import java.util.Scanner;

public class print_subArray {

public static void printsubarray(int arr[]){
    int n = arr.length;
    System.out.println();
    for(int s =0;s<n;s++){
        for(int e = s;e<n;e++){
            for(int k = s;k<=e;k++){
                System.out.print(arr[k]);
            }
            System.out.println();
        }
    }
}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Entered array is ....");
        for(int j=0;j<size;j++){
            System.out.print(arr[j]);
        }
        printsubarray(arr);
    }
}
