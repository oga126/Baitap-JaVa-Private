import java.util.*;
public class Bai2_Buoi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int b, dem = 0;
        for(int i = 0 ; i < n-1 ; i++){
                b = a[i+1] - a[i];
                if (b == 2){
                    System.out.print(a[i] + 1 + " ");
                    dem++;
                }else if( b > 2){
                    for( int k = 1; k < b; k++){
                        System.out.print( a[i] + k + " ");
                        dem++;
                    }
                }

        }
        if( dem == 0){
            System.out.println("YES");
        }
    }
}
