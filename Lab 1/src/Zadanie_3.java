import java.util.Scanner;

public class Zadanie_3 {
    public static void main(String[] args) {
    int x,n;
    Scanner in = new Scanner(System.in);
    System.out.println("Введите число");
    x = in.nextInt();
    System.out.println("Введите степень");
    n = in.nextInt();
    while (!(n > -15 && n < 15) ){
        System.out.println("Ошибка. Введите корректное значение");
        n = in.nextInt();
    }
    if ( n == 0){
        System.out.println("Число " + 1);
    } else {
        if (n > 0) {
            int number = x;
            for (int i = 1; i < n; i++) {
                number *= x;
            }
            System.out.println("Число " + number);
        } else {
            float number = (float) 1 / x;
            for (int i = -1; i > n; i--) {
                number /= x;
            }
            System.out.println("Число " + number);
        }
    }
    }
}