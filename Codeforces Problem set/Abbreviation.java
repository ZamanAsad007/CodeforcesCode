import java.util.Scanner;

public class Abbreviation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] hehe = new String[n]; 

        for(int i=0; i<n; i++){

            hehe[i]  = sc.next();


        }

        for(String p : hehe){
            int m = p.length();
            if(m>10){
                System.out.println(p.charAt(0) + "" + (m-2) + "" + p.charAt(m-1));
            }
            else {
                System.out.println(p);
            }
        }



        sc.close();
    }
}