package Carry_Fwd;

public class AG_Pblm {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        //char[] arr = {'a','g','i','g','a','m','n','g'};
        String A= "ABCGAG";
      //  String A="CCB";
        AG_pblm(A);
    }

    private static void AG_pblm(String A) {
       /* int n =A.length();
        int count=0;
        int ans= 0;
        for(int i=n-1;i>=0;i--){
            if(A.charAt(i)=='G'){
                count++;
            }
            else if(A.charAt(i)=='A'){
                ans= ans+count;
            }
        }
       System.out.println("AG count is-->"+ans);*/

        int n = A.length();

        int count = 0;
        for(int i=0;i<n;i++) {
            if(A.charAt(i)=='A') {
                for (int j = i + 1; j < n; j++) {
                 if(A.charAt(j)=='G'){
                    count++;
                    }
                 }
            }
        }
        System.out.println("AG count"+count);
    }
}

