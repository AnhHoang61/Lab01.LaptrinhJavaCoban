
import java.util.Scanner;

public class Nhaphaiso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap X: ");
        long x = sc.nextInt();
        
        System.out.println("Nhap Y: ");
        long y = sc.nextInt();
        
        long tong = x + y;
        long hieu = x - y;
        long tich = x * y;
        long thuong = x % y;
        long soDu = x / y;
        
        System.out.println("-------------------------");
        System.out.println("x + y = " + tong);
        System.out.println("x - y = " + hieu);
        System.out.println("x * y = " + tich);
        System.out.println("x : y = " + thuong);
        System.out.println("x / y = " + soDu);
        
    }
}
