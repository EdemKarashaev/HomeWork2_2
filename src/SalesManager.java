public class SalesManager {
    protected long [] sales;
    long max = -1;
    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    //вычисление максимального значения массива
    public long max() {
        for (long sale : sales) {

            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    //вычисление суммы средних продаж
    public long average() {
        long av = 0;
        long aver;
        long min = sales[0];
        //вычисление минимального значения массива
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] < min) {
                min = sales[i];
            }
        }
        //вычисление максимального значения массива
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }

        for (long sale : sales) {
            av = av + sale;
        }
        aver = (av - min - max) / (sales.length - 2);
        return aver;
    }
}
