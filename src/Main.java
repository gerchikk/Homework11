import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void determinationLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год - высокосный год");
        } else {
            System.out.println(year + " год - невысокосный год");
        }
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2021;
        determinationLeapYear(year);
    }

    public static void determinationOfOS(int operationSystem, int currentYear) {
        if (operationSystem == 0) {
            if (currentYear >= 2015) {
                System.out.println("Установите обычную версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            }
        }
        if (operationSystem == 1) {
            if (currentYear >= 2015) {
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

    public static int determinationOfTheTerm (int deliveryDistance) {
        if (deliveryDistance <= 0 || deliveryDistance > 100) {
            return -1;
        }
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else {
            return 3;
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        int deliveryDays = determinationOfTheTerm(deliveryDistance);
        if (deliveryDays == -1) {
            System.out.println("Доставка невозможна");
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
    }
}