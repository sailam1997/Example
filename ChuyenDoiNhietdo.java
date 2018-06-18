import java.util.Scanner;
public class ChuyenDoiNhietdo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float C;
        C= scanner.nextFloat();
        System.out.println("Nhap nhiet do C"+C);
        float F = (9*C+125)/5;
        System.out.println("Do F la:"+F);



    }
}
