
package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) {
        long total = 0;
        for (long sale : sales) {
            total +=  sale;
        }
        return total;
    }

    public long averageSale(long[] sales) {
        return sumSales(sales) / sales.length;
    }

    public int monthMaxSale(long[] sales) {
        int monthMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[monthMax] <= sales[i]) {
                 monthMax = i;
            }
        }
        return monthMax + 1;
    }

}
