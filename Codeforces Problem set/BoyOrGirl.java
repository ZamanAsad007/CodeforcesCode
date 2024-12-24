import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int idx = s.indexOf(ch, i+1);
            if(idx ==-1){
                sb.append(ch);
            }
        }
        int size = sb.length(); 
        if(size%2==0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }

        sc.close();
    }
}
