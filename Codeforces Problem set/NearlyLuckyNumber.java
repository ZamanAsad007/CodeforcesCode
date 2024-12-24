import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c[] = sc.next().toCharArray();

        int count = 0;

        for(int i =0 ; i<c.length; i++){
            if(c[i] == '4' || c[i] == '7'){
                count++;
            }
        }

        if(count==4 || count == 7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        sc.close();

    }
}
