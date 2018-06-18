import java.util.Scanner;
public class NamSinh {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao nam sinh");
        int namsinh;
        namsinh=scanner.nextInt();
        int tuoi =(2018 - namsinh);
        System.out.println("tuoi cua ban la:"+tuoi);


    }

}
