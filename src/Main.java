import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        int clientOS = 1;
        System.out.println("Задание 1:");
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }else{
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

        System.out.println(" ");

        int clientDeviceYear = 2045;
        System.out.println("Задание 2:");
        if (clientDeviceYear >= 2015){
            if (clientOS == 0){
                System.out.println("Установите версию приложения для iOS по ссылке.");
            }else{
                System.out.println("Установите версию приложения для Android по ссылке.");
            }
        } else{
            if (clientOS == 0){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            }else{
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            }
        }

        System.out.println(" ");

        int year = 2045;
        System.out.println("Задание 3:");
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(year + " год является високосным.");
        } else{
            System.out.println(year + " год не является високосным.");
        }

        System.out.println(" ");

        int deliveryDistance = 95;
        int Days = 1;
        System.out.println("Задание 4:");
        if (deliveryDistance > 20){
            Days += (int)ceil((deliveryDistance-20)/40f);
        }
        System.out.println("Время доставки (сут.): " + Days);

        System.out.println(" ");

        int monthNumber = 12;
        System.out.println("Задание 5:");
        switch (monthNumber){
            case 1:
                System.out.println("Зима.");
                break;
            case 2:
                System.out.println("Зима.");
                break;
            case 12:
                System.out.println("Зима.");
                break;
            case 3:
                System.out.println("Весна.");
                break;
            case 4:
                System.out.println("Весна.");
                break;
            case 5:
                System.out.println("Весна.");
                break;
            case 6:
                System.out.println("Лето.");
                break;
            case 7:
                System.out.println("Лето.");
                break;
            case 8:
                System.out.println("Лето.");
                break;
            case 9:
                System.out.println("Осень.");
                break;
            case 10:
                System.out.println("Осень.");
                break;
            case 11:
                System.out.println("Осень.");
                break;
            default:
                System.out.println("Такого месяца нет.");
                break;
        }
    }
}