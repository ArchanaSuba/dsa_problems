package basic_java;

import java.util.Scanner;

public class arr_check {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of inputs required");
        int k = sc.nextInt();
        int arr[] = new int[k];
        for(int i=0;i<k;i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Input received ");
        for(int j=0;j<arr.length;j++){
          System.out.print(arr[j]+", ");
        }
    }
}
