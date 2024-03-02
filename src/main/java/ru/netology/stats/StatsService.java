package ru.netology.stats;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StatsService {

    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }

        return sum;
    }

    public long averSalesValue(long[] sales) {
        long averageSales = sumSales(sales) / sales.length;

        return averageSales;
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
        long averageSales = averSalesValue(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales) {
                belowAverMonth = belowAverMonth + 1;
            }
        }

        return belowAverMonth;
    }

    public int aboveAverSales(long[] sales) {
        int aboveAverMonth = 0;
        long averageSales = averSalesValue(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) {
                aboveAverMonth = aboveAverMonth + 1;
            }
        }

        return aboveAverMonth;
    }
}
