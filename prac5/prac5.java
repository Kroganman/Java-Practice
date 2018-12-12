import java.util.Scanner;

public class Main {

    static int Recursion (int n) {
        for (int i = 1;i <= n;i++)
            System.out.println(i);
        return 0;
    }

    public static void main(String[] args) {
        Scanner rec = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = rec.nextInt();
        Recursion(number);
    }
}
