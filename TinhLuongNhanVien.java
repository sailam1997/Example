import java.sql.SQLOutput;
import java.util.Scanner;
public class TinhLuongNhanVien {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        float hesoluong;
        double sonam;
        System.out.println("he so luong:");
         hesoluong = scanner .nextFloat();
         if(hesoluong>5) {
             System.out.println("Nhap lai he so luong:");
         } else {
             System.out.println("so nam:");
             sonam=scanner.nextDouble();
             double luongthang;
             luongthang=(hesoluong*4000000)+(sonam*500000);
             System.out.println("luong thang cua ban la:"+ luongthang);
         }

    }
}
