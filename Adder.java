// This Java program performs the same task as the Python script, but in Java.

import java.util.Scanner;

public class Adder {
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        scanner.close();

        int sum = add(num1, num2);
        int ans = sum * 5;
        System.out.println(ans);
    }
}
