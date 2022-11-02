import java.util.*;
public class Bai3_Buoi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n; i++){
            a[i] = sc.nextInt();
        }
        int maxStringLength = 0;
        int length = 0;
        for(int i = 0; i < n-1 ; i++) {
                length++;
                if (a[i] > a[i+1]) {

                    if(length > maxStringLength){
                        maxStringLength = length;
                    }
                    length = 0;
                }
        }
        if ( maxStringLength > length ) {
            System.out.println(maxStringLength);
        }else if ( length > maxStringLength){
            System.out.println(length + 1);
        }
    }
}
