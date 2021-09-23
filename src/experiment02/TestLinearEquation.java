package experiment02;

import java.util.Scanner;

public class TestLinearEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();

        LinearEquation linearEquation = new LinearEquation();

        linearEquation.isSolvable();
        int x = linearEquation.getX(a, b, c, d, e, f);
        System.out.println("x= " + x);

        int y = linearEquation.getY(a, b, c, d, e, f);
        System.out.println("y= " + y);

    }
}
