package Hashing;


import java.util.HashMap;
import java.util.Scanner;

/*
Given arr[N] elements & Q queries, for each query find frequency of element in array

        arr[10] = 2 6 3 8 2 7 2 3 8 10
        Q = 4 queries // 2, 8, 3, 5.*/
public class findFrequency {
    public static void main(String[] args){

        int [] arr = {2 ,6, 3, 8, 2, 7, 2, 3, 8, 10};
            findfrequency(arr);
    }

    private static void findfrequency(int[] arr) {
        System.out.print("Enter no.of queries");
        Scanner sc = new Scanner(System.in);
        int query = sc.nextInt();
        HashMap <Integer,Integer> hs = new HashMap<>();
        int length = arr.length;
        int val =0;
        for(int i=0;i<length;i++){
            if(hs.containsKey(arr[i])){
                val = hs.get(arr[i]);
                hs.put(arr[i],val+1);
            }
            else{
                hs.put(arr[i],val+1);
            }
        }


        for(int i =0;i<query;i++){
            System.out.print("Find the frequecy number");
            int findNum = sc.nextInt();
            if(hs.containsKey(findNum)){
                System.out.println(hs.get(findNum));
            }else{
                System.out.println("Invalid number");
            }

        }

    }


}
