import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int hehe = x/5;

        if(x%5!=0){
            System.out.println(hehe+1);
        }else{
            System.out.println(hehe);
        }
        
        sc.close();
    }
}
