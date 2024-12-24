import java.util.Scanner;

public class Word{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int count1=0, count2=0;

        for(int i=0; i<s.length; i++){
            if(s[i]>=65 && s[i]<=90){
                count1++;
            }
            else{
                count2++;
            }
        }
        String cs = new String(s);
        if(count1==count2 || count1<count2){
            System.out.println(cs.toLowerCase());
        }
        else{
            System.out.println(cs.toUpperCase());
        }
        sc.close();

    }
}