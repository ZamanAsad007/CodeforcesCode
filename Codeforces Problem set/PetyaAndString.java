import java.util.Scanner;

public class PetyaAndString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String gift1 = sc.next();
        String gift2 = sc.next();

        if((gift1.toLowerCase().compareTo(gift2.toLowerCase()))>0){
            System.out.println("1");
        }
        else if((gift1.toLowerCase().compareTo(gift2.toLowerCase()))==0){
            System.out.println("0");
        }
        else{
            System.out.println("-1");
        }
    
        sc.close();
    }

}
