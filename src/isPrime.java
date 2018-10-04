import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        boolean result = false;
        System.out.print("Nhập vào số cần kiểm tra số nguyên tố: ");
        n = sc.nextInt();
        if (n < 2) {
            result = false;
        } else if (n == 2 || n == 3) {
            result = true;
        } else {
            for (i = 3; i < (n / 2); i++) {
                if (n % i == 0) {
                    result = false;
                    break;
                } else {
                    result = true;
                }
            }
        }
        if( result == true){
            System.out.println("Số " + n + " là số nguyên tố");

        }
        else{
            System.out.println("Số " + n + " KHÔNG phải là số nguyên tố");
        }
    }
}
