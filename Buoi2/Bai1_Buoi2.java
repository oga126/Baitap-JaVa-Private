
import java.util.Scanner;

public class Bai1_Buoi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        int[] b  = new int [100];
        for (int i = 0 ; i < n ; i++){
            b[arr[i]]++;
        }
        for(int i = 0; i < 100; i++){
            if(b[i] != 0){
                System.out.println(i + " : " + b[i]);
            }
        }
    }
}
