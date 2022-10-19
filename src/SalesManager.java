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

}
