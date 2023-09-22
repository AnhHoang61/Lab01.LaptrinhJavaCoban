import java.util.Scanner;

public class nhaptenSV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap ma sinh vien: ");
        String maSinhVien = sc.nextLine();
        
        System.out.println("Nhap ho va ten: ");
        String hoVaTen = sc.nextLine();
        
        System.out.println("Nhap tuoi: ");
        byte tuoi = sc.nextByte();
        
        System.out.println("Nhap nam sinh: ");
        int namSinh = sc.nextInt();
        
        System.out.println("Nhap diem trung binh: ");
        float diemTrungBinh = sc.nextFloat();
        
        System.out.println("-------------------------------------------");
  
        System.out.println("Ma Sinh Vien: " + maSinhVien);
        System.out.println("HO va ten: " + hoVaTen);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Nam sinh: " + namSinh);
        System.out.println("Diem trung binh: " + diemTrungBinh);
    }

}

