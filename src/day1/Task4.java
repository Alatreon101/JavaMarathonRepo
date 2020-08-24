package src.day1;

import java.util.Scanner;

/*
 *
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите свой возраст: ");
        int age = scan.nextInt();
        while (age < 100) {
            System.out.println("Ваш возраст - " + age);
            age += 5;
        }
    }
}
