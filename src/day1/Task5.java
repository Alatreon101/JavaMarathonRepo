package src.day1;

import java.util.Scanner;

/*
 *
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите свой возраст: ");
        int age = scan.nextInt();
        for (int i = age; i <= 100; i += 5) {
            System.out.println("Ваш возраст - " + i);
        }
    }
}
