import java.util.Random;
import java.util.Scanner;
public class Lottery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();
        int a = rd.nextInt(9);
        int b = rd.nextInt(9);
        System.out.printf("%d%d", a, b);
        System.out.println("\nNhap vao so thu 1:");
        int sothunhat=scanner.nextInt();
        System.out.println("Nhap vao so thu 2:");
        int sothuhai=scanner.nextInt();
        if((sothunhat ==a && 0<=a && a<10) && (sothuhai==b && 0<=b && b<10)){
            System.out.println("Ban da trung doc dac");
        }
        else if (sothunhat == b && sothuhai == a) {
            System.out.println("Ban da trung thuong 3000");
        }
        else if ((sothunhat == a || sothunhat == b || sothuhai == a || sothuhai == b)) {
            System.out.println("Ban da trung thuong 1000");
        }
        else {
            System.out.println("Ban da khong trung thuong");
        }




        }

    }
