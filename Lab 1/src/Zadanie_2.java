import java.util.Scanner;

public class Zadanie_2 {
    public static void main(String[] args) {
        int day, month ;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите месяц");
        if(in.hasNextInt()) {
            month = in.nextInt();
            if (month > 12 || month < 1) {
                System.out.println("Ошибка. Перезапустите программу, введя корректные значения");
            } else {
                System.out.println("Введите день");
                if (in.hasNextInt()) {
                    day = in.nextInt();
                    if (month == 2) {
                        if (day > 28 || day < 1) {
                            System.out.println("Ошибка. Перезапустите программу, введя корректные значения");
                        }
                    } else {
                        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                            if (day > 31 || day < 1) {
                                System.out.println("Ошибка. Перезапустите программу, введя корректные значения");
                            }
                        } else {
                            if (day > 30 || day < 1) {
                                System.out.println("Ошибка. Перезапустите программу, введя корректные значения");
                            }
                        }
                    }
                    if (month == 12 || month == 1 || month == 2) {
                        System.out.println("Зима");
                    }
                    if (2 < month && month < 6) {
                        System.out.println("Весна");
                    }
                    if (5 < month && month < 9) {
                        System.out.println("Лето");
                    }
                    if (8 < month && month < 12) {
                        System.out.println("Осень");
                    }
                } else{
                    System.out.println("Некорректный тип данных. Перезапустите программу, используя тип Int");
                    in.close();
                }
            }
        } else {
            System.out.println("Некорректный тип данных. Перезапустите программу, используя тип Int");
            in.close();
        }

    }
}
