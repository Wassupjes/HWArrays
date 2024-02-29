package ru.netology.stats;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StatsService {

    public int sumSales(long[] sales) {
        long sum = LongStream.of(sales).sum();
        return (int) sum;
    }

    public int averSalesValue(long[] sales) {
        long averageSales = LongStream.of(sales).sum() / sales.length;
        return (int) averageSales;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int belowAverSales(long[] sales) {
        int belowAverMonth = 0;
        long averageSales = LongStream.of(sales).sum() / sales.length;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales) {
                belowAverMonth = belowAverMonth + 1;
            }
        }

        return belowAverMonth;
    }

    public int aboveAverSales(long[] sales) {
        int aboveAverMonth = 0;
        long averageSales = LongStream.of(sales).sum() / sales.length;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) {
                aboveAverMonth = aboveAverMonth + 1;
            }
        }

        return aboveAverMonth;
    }
}
