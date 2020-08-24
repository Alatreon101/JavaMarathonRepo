package src.day1;

import java.util.Scanner;

/*
 *
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число на которое хотите умножать!");
        int k = scan.nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + " * " + k + " = " + (i * k));
        }
    }
}
