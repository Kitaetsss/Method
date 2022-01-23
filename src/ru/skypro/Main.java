package ru.skypro;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// задание 1
        Main.years(2021);
        Main.versionOs(2022, 1);
        Main.days(100);
        Main.doubles("aabccddefgghiijjkk");
        Main.reverse(new int[]{3,2,1,6, 5});
    }
    public static void years(int year) {
        if ((year % 4 == 0 || year % 400 == 0) && year % 100 != 0) {
            System.out.println(year + " — високосный год");
        } else {
            System.out.println(year + " — не високосный год");
        }
    }
    //задание 2
    public static void versionOs(int version, int os) {
        int currentYear = LocalDate.now().getYear();
        if (os == 1 && version >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (os == 1 && version <= currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");}
        if (os == 0 && version >= currentYear) {
            System.out.println("Установите версию приложения для android по ссылке");
        }
        else if (os == 0 && version <= currentYear){
            System.out.println("Установите облегченную версию приложения для android по ссылке");
        }
    }
    //задание 3
    public static void days(int distance) {
        int days = 0;
        if (distance <= 20) {
            days = 1;
        } else if (distance <= 60 && distance >= 20) {
            days = 2;
        } else if (distance >= 60 && distance <= 100) {
            days = 3;
        }
        System.out.println("Длительность доставки " + days + " дней");
    }
    //задание 4
    public static void doubles (String doubless) {
        for (int i = 0; i < doubless.length(); i++) {
            if (doubless.charAt(i) == doubless.charAt(i + 1)) {
                System.out.println("Присутствует дубль " + doubless.charAt(i));
                break;
            }
        }
    }
    //задание 5
    public static void reverse (int [] reverses) {
        for (int i = 0; i < reverses.length/2; i++)
        {
            int a = reverses[i];
            reverses[i] = reverses[reverses.length - i - 1];
            reverses[reverses.length - i - 1] = a;
        }
        System.out.println(Arrays.toString(reverses));
    }

}
