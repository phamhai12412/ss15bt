import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập vào a:");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("Nhập vào b:");
        double b = new Scanner(System.in).nextDouble();
        System.out.println("Nhập vào c:");
        double c =new Scanner(System.in).nextDouble();
        QuadraticEquation.solve(a,b,c);
    }
}