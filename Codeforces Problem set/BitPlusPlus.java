import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x=0;
        int sum=0;

        for(int i=0; i<n; i++){

            String s =sc.next();

            if(s.equals("++X") || s.equals("X++")){
                ++x;
            }
            else if(s.equals("--X") || s.equals("X--")){
                --x;
            }
        
            sum =sum + (x);
            x=0;
            
        }
        System.out.println(sum);

        sc.close();
    }    
}
