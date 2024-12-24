import java.util.Scanner;

public class I_love_Username {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, max=0, min=10000, a=0 ,b = 0, c=0;
        n=sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            if(max<arr[i]){
                max=arr[i];
                a = a+1;
            }
            if(min>arr[i]){
                min=arr[i];
                b = b+1;
            }
            
        }
        c= a+b-2;
        if(a+b==n && max!=min){
            System.out.println((n-1));
        }
        else if(c>0){
            System.out.println(c);
        }
        else{
            System.out.println(0);
        }

        sc.close();
    }
}
