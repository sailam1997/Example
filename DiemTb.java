import java.util.Scanner;
public class DiemTb {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float diemly;
        float diemtoan;
        float diemhoa;
        diemly=scanner.nextFloat();
        diemtoan=scanner.nextFloat();
        diemhoa=scanner.nextFloat();
        System.out.println("Diem ly"+ diemly);
        System.out.println("Diem toan"+ diemtoan);
        System.out.println("Diem hoa"+ diemhoa);
        float tongdiem= diemly+diemtoan+diemhoa;
        float diemtb=(diemly+diemtoan+diemhoa)/3;
        System.out.println("Tong diem 3 mon"+tongdiem);
        System.out.println("Diem Trung Binh 3 Mon"+diemtb);

    }
}
