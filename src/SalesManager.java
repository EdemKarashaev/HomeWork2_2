public class SalesManager {

    protected int[] sales;
    int max = -1;


    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    //вычисление суммы средних продаж
    public int average() {
        int av = 0;
        int aver;
        int min = sales[0];
        //вычисление минимального значения массива
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] < min) {
                min = sales[i];
            }
        }
        //вычисление максимального значения массива
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }

        for (int sale : sales) {
            av = av + sale;
        }
        aver = (av - min - max) / (sales.length - 2);
        return aver;
    }
}
