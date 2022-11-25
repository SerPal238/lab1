import java.util.Scanner;

public class Zadanie_1 {
    public static void main(String[] args) {
        int day = -1, month = -1, age = -1 , nowday = 25, nowmonth = 11, nowage = 2022, diffday,diffmonth,diffage;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год рождения");
        while( age < 0 || age > 2022) {
            if (in.hasNextInt()){
                int i = in.nextInt();
                if (i > nowage || i < 0) {
                    System.out.println("Ошибка. Введите корректное значение");
                    } else {
                    age = i;
                }
            } else {
                System.out.println("Ошибка. Введите корректное значение");
                in.next();
            }
        }
        System.out.println("Введите месяц рождения");
        while (month > 12 || month < 1 || (month > nowmonth) && (age == nowage)) {
            if(in.hasNextInt()) {
                int i = in.nextInt();
                if (i > 12 || i < 1 || (i > nowmonth) && (age == nowage)) {
                    System.out.println("Ошибка. Введите корректное значение");
                } else {
                    month = i;
                }
            } else {
                System.out.println("Ошибка. Введите корректное значение");
                in.next();
            }
        }
        System.out.println("Введите день рождения");
        while (day > nowday && month == nowmonth && age == nowage || day < 1) {
            if (in.hasNextInt()) {
                int i = in.nextInt();
                if (i < 1 || ((month == 2) && (i > 29) || ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && (i > 31)) || ((month == 4 || month == 6 || month == 9 || month == 11) && (i > 30)))) {
                    System.out.println("Ошибка. Введите корректное значение");
                } else {
                    day = i;
                }
            } else {
                System.out.println("Ошибка. Введите корректное значение");
                in.next();
            }
        }
            diffday = nowday - day;
            diffmonth = nowmonth - month;
            diffage = nowage - age;

            if (diffday < 0) {
                --diffmonth;
                if (month == 2) {
                    diffday += 28;
                } else {
                    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                        diffday += 31;
                    } else {
                        diffday += 30;
                    }
                }
            }
        if (diffmonth < 0) {
            --diffage;
            diffmonth += 12;
        }
            System.out.println(diffage + " Лет " + diffmonth + " месяцев " + diffday + " дней ");
        }
    }
