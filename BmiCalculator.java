
import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight;
        double height;
        double bmi;
        System.out.println("Your weight(in kilogram):");
        weight = scanner.nextDouble();

        System.out.println("Your height(in meter):");
        height = scanner.nextDouble();

        bmi = weight/Math.pow(height,2);

        System.out.printf("%-20s%s","bmi","interpretation");

        if(bmi<18)
            System.out.printf("%-20.2f%s",bmi,"underweight");
            else if(bmi<25.0)
            System.out.printf("%-20.2f%s",bmi,"normal");
            else if(bmi<30.0)
            System.out.printf("%-20.2f%s",bmi,"overweight");
             else
            System.out.printf("%-20.2f%s",bmi,"obese");

    }
}
