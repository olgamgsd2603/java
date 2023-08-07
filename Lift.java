package HA1;

import java.util.Scanner;
public class Lift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите общее количество этажей (h): ");
        int h = sc.nextInt();

        System.out.print("Введите количество этажей подъема (n): ");
        int n = sc.nextInt();

        System.out.print("Введите количество этажей спуска (m): ");
        int m = sc.nextInt();

        sc.close();

        int number = h / (n - m) + 1;

        System.out.println("Количество циклов: "+ number);
    }
}
