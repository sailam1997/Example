import java.util.Scanner;
public class PtBachai {
    public static void main(String[] args) {
        System.out.println("Phuong trinh bac hai");
        System.out.println("given a equation as 'a*x*x+b*x+c=0' please enter constant:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a:");
        double a = scanner.nextDouble();
        System.out.println("b:");
        double b = scanner.nextDouble();
        System.out.println("c:");
        double c = scanner.nextDouble();
        if (a == 0 && b != 0) {
            double solution = -c / b;
            System.out.printf(" The solution is : %f", solution);
        }
        if (a == 0 && b == 0 && c == 0) {
            System.out.print("The solution is all x!");
        }
        if (a == 0 && b == 0 && c != 0) {
            System.out.print("No solution");
        }
        if (a != 0) {
            double solution1 = -b + Math.sqrt(b * b - 4* a * c) / (2 * a);
            double solution2 = -b - Math.sqrt(b * b - 4* a * c) / (2 * a);
            System.out.printf("The solution is : %f", solution1);
            System.out.printf("The solution is : %f", solution2);
        }

    }
}