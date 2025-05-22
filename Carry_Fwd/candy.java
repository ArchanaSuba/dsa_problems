package Carry_Fwd;

import java.util.List;

public class candy {
    public static void main(String[]args){
        int[] candies={2,3,5,1,3};
        int extra_candy = 3;
      List<Boolean> candy_list=candy_list(candies,extra_candy);
    }

    private static List<Boolean> candy_list(int[] candies, int extraCandy) {
        int n = candies.length;
        List<Boolean> greatest_candy = null;
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(candies[i]+extraCandy>=candies[j]){
                  //  greatest_candy.add(  )

                }else{
                  //  greatest_candy[i]=0;
                }
            }
        }

System.out.println("Array List");
      /*  for(int k=0;k<greatest_candy.length;k++){
            System.out.println("List::::"+greatest_candy[k]);
        }*/
        return null;
    }


}
