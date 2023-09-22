import java.util.Scanner;

public class Uocboihaiso {
    public static int timUCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Hàm tìm BCNN sử dụng UCLN
    public static int timBCNN(int a, int b) {
        int ucln = timUCLN(a, b);
        return (a * b) / ucln;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhap a: ");
            int a = sc.nextInt();
            
            System.out.print("Nhap b: ");
            int b = sc.nextInt();
            
            if (a <= 0 || b <= 0) {
                System.out.println("Nhap lai hai so");
            } else {
                int ucln = timUCLN(a, b);
                int bcnn = timBCNN(a, b);
                
                System.out.println("USCLN cua " + a + " va " + b + " la: " + ucln);
                System.out.println("BSCNN cua " + a + " va " + b + " la: " + bcnn);
            }
        }
    }
}
