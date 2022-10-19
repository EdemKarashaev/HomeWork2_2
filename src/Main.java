import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        String var;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размерность массива продаж:");
        int size = scanner.nextInt();
        int sales[]=new int[size];

        System.out.println("Введите суммы продаж, для завершения введите:");
        for (int i = 0; i < size; i++) {
            sales[i] = scanner.nextInt();
            var = scanner.toString();
        }

        SalesManager sale = new SalesManager( sales);
        int max=sale.max();
        System.out.println("Сумма максимальной продажи  "+max);
    }
}

