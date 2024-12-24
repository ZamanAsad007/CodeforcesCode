import java.util.Scanner;

public class GameWithIntegers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int[] n = new int[t];

        for(int i=0; i<t; i++){
            n[i] = sc.nextInt(); 
        }

        for(int i=0; i<t; i++){
            if((n[i]+1)%3==0 || (n[i]-1)%3==0){
                System.out.println("First");
            }
            else{
                System.out.println("Second");
            }
            
        }
        sc.close();

    }
}