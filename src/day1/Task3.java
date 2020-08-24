package src.day1;

import java.util.Scanner;

/*
 *
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 'for' или 'while' для выбора цикла:");
        String forOrWhile = sc.nextLine();
        switch (forOrWhile) {
            case ("for"):
                for (int i = 0; i < 10; i++) {
                    System.out.println("JAVA");
                }
                break;
            case ("while"):
                int java = 1;
                while (java < 11) {
                    System.out.print("JAVA ");
                    java++;
                }
                break;
            default:
                System.out.println("Вы ввели неверную команду!");
        }
    }
}
