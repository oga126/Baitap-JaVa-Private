import java.util.*;

public class Bai4_Buoi2 {
    public static int stn(int n){
        if(n < 2) return 0;
        //cho chay tu 2 den sqrt(n)
        for(int i = 2 ; i*i <= n; i++) {
            if (n % i == 0) {
                return 0;
            } else { return 1; }
        }
        return 1;
    }

    public static int ktra(int n) {
        int tmp = n;
        while(tmp > 0){
            int sodu = n % 10;
            if(sodu != 2 && sodu != 3 && sodu !=5 && sodu != 7){
                return 0;
            }
            tmp /= 10;
        }
        return 1;
    }
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n; i++){
            a[i] = sc.nextInt();
        }
        int dem = 0;
        for(int i = 0; i < n; i++){
            if(stn(a[i]) == 1 && ktra(a[i]) == 1){
                System.out.print(a[i] + " ");
                dem++;
            }
        }
        if(dem == 0) System.out.println("NO");
    }
}































