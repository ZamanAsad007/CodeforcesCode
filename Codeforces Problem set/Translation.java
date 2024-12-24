import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String rev = "";
        String t = sc.next();
        char ch;

        for(int i=0; i<s.length(); i++){
            ch = s.charAt(i);
            rev=ch+rev;
        }

        if(rev.equals(t)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}
