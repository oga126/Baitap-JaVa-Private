import java.util.Scanner;

public class Bai4_Buoi1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n;
        do{
            System.out.println("Nhap n :");
            n = scanner.nextLong();
        } while ( n  <= 0 );
        int dem = 0;
        long aomaqua;
        do {
            aomaqua = n % 10;
            if (aomaqua == 1 || aomaqua == 4 || aomaqua == 9){
                System.out.println(aomaqua);
                dem++;
            }
            n /= 10;

        }while ( n > 0);
        if (dem == 0){
            System.out.println("No");
        }
    }
}