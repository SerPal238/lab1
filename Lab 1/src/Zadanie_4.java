import java.util.Scanner;

public class Zadanie_4 {
    public static void main(String[] args) {
        int n,r,kolvo = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите радиус");
        r = in.nextInt();
        System.out.println("Введите количество точек");
        n = in.nextInt();
        for(int i = 0; i < n; i++){
            double x,y;
            System.out.println("Введите координату X точки");
            x = in.nextDouble();
            System.out.println("Введите координату Y точки");
            y = in.nextDouble();
            if(x * x + y * y <= r * r){
                kolvo++;
            }
        }
        System.out.println(kolvo + " точек попало в окружность");
    }
}
