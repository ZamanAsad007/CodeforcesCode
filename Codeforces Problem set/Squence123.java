import java.util.Scanner;

public class Squence123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int count1=0, count2=0, count3=0;

        for(int i=0 ; i<n; i++){
            arr[i] = sc.nextInt();

            if(arr[i] == 1){
                count1++;
            }
            else if(arr[i] == 2){
                count2++;
            }
            else if(arr[i] == 3){
                count3++;
            }

        }

        int maxcount = Math.max(count1, Math.max(count2, count3)); //new term   
        System.out.println(n- maxcount); 

        sc.close();
    }
}
