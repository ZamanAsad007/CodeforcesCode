import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int count = 0;

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){

            if(a[i]>0  &&  a[i]>=a[k-1]){
                count++;
            }    
        }
        System.out.println(count);

        sc.close();
    }
}
