public class SalesManager {
    protected int [] sales;
    int max = -1;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    //вычисление максимального значения массива
    public int max() {
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

}
