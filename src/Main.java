import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void determinationLeapYear(int a) {
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            System.out.println(a + " год - высокосный год");
        } else {
            System.out.println(a + " год - невысокосный год");
        }
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2021;
        determinationLeapYear(year);
    }

    public static void determinationOfOS(int a, int b) {
        if (a == 0) {
            if (b >= 2015) {
                System.out.println("Установите обычную версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            }
        }
        if (a == 1) {
            if (b >= 2015) {
                System.out.println("Установите обычную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int operationSystem = 0;
        int currentYear = LocalDate.now().getYear();
        determinationOfOS(operationSystem, currentYear);
    }

    public static int determinationOfTheTerm (int deliveryDays, int deliveryDistance) {
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней " + deliveryDays);
        }
        return deliveryDays;
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        determinationOfTheTerm(deliveryDays, deliveryDistance);
    }
}