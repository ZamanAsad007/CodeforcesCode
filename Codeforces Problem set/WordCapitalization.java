import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();

        if(s[0]>= 97 && s[0]<=122){
            s[0] = (char) (s[0] -32);
            System.out.println(s);
        }
        else{
            System.out.println(s);
        }
        sc.close();
        
    }
}
