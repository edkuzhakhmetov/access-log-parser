import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //получить входящие данные
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x: ");
        int x = in.nextInt();
        System.out.println("Введите y: ");
        int y = in.nextInt();
        //выполнить операции
        int sum=x+y;
        int diff=x-y;
        int mult=x*y;
        double div=x/y;
        //вывод результатов
        System.out.println("X+Y = " +sum);
        System.out.println("X-Y = " +diff);
        System.out.println("X-Y = " +mult);
        System.out.println("X/Y = " +div);
    }
}

