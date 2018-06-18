import java.util.Scanner;
public class TienTe {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int USD;
        USD=scanner.nextInt();
        System.out.println("Nhap so USD can doi"+USD);
        int VND = USD*23000;
        System.out.println("So tien VND tuong tung:"+VND);

    }
}

