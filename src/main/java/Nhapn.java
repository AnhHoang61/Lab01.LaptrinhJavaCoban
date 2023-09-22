import java.util.Scanner;

public class Nhapn {
    public static boolean soNguyenTo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Nhap lai n");
        } else {
            System.out.println("Cac so nguyen to nho hon " + n + " la:");
            for (int i = 2; i < n; i++) {
                if (soNguyenTo(i)) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
         sc.close();
    }
}







