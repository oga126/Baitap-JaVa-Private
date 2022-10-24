import java.util.Scanner;

public class Bai2_Buoi1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int[] a = new int[4];
        for (int i = 0; i <= 3; i++) {
            a[i] = sc.nextInt();
        }
        if (a[0] == a[1] && a[0] == a[3] && a[0] == a[2]) {
            System.out.println("Khong co so lon thu 2");
            return;
        }
        int tg  ;
        for (int i = 0; i <= 2; i++) {
            for (int j = i + 1; j <= 3; j++) {
                if (a[i] < a[j]) {
                    tg = a[i];
                    a[i] = a[j];
                    a[j] = tg;
                }
            }
        }
        for (int i = 0; i <= 2; i++){
            for (int j = i + 1; j <= 3; j++){
                if(a[j] < a[i]){
                    System.out.println(a[j]);
                    return;
                }
            }
        }

    }
}
