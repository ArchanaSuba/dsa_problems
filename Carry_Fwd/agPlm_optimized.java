package Carry_Fwd;

import java.util.Scanner;

public class agPlm_optimized {
    public static void findagPair(String str){
        int n = str.length();
        int count =0;
        int ans = 0;
        for(int i=n-1;i>=0;i--){
            if(str.charAt(i)=='g')
            {
                count++;
            }
            else if(str.charAt(i)=='a')
            {
                ans+=count;
            }
        }
        System.out.println("Total no of AG pairs "+ans);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Characters");
        String str = sc.nextLine();
        System.out.println(str);
        findagPair(str);
    }
}
