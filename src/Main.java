import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static boolean jearVis(int jear) {
        if ((jear % 4 == 0) && (jear % 100 != 0)) {
            return true;
        } else if ((jear % 4 == 0) && (jear % 100 == 0) && (jear % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void task1() {
        System.out.println("Задача 1");
        int jear = LocalDate.now().getYear();
        if (jearVis(jear)) {
            System.out.println(jear + " год является високосным.");
        } else {
            System.out.println(jear + " год  не является високосным.");
        }
    }

    public static boolean jearSystema(int jear) {
        return jear < 2015;
    }

    public static boolean systema(int systema) {
        return systema == 1;
    }

    public static void task2() {
        System.out.println("Задача 2");
        int jear = 2013;
        int oS = 0;
        if (jearSystema(jear)) {
            System.out.print("Установи облегченную версию приложения");
        } else {
            System.out.print("Установи обычную версию приложения");
        }
        if (systema(oS)) {
            System.out.println(" Андроида");
        } else {
            System.out.println(" iOS");
        }
    }

    public static String distance(int distance) {
        if (distance < 100) {
            return "Потребуется дней: ";
        } else {
            return "Доставки нет";
        }

    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        int deliveryTime = 1;
        if (deliveryDistance <= 20) {
            System.out.println(distance(deliveryDistance) + deliveryTime);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println(distance(deliveryDistance) + (deliveryTime + 1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println(distance(deliveryDistance) + (deliveryTime + 2));
        } else {
            System.out.println(distance(deliveryDistance));
        }
    }
}