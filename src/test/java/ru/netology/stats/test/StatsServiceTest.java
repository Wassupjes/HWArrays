package ru.netology.stats.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    public void summarySales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSummary = 180;
        long actualSummary = service.sumSales(sales);

        Assertions.assertEquals(expectedSummary, actualSummary);
    }

    @Test
    public void averageSalesValue() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAverage = 180 / 12;
        long actualAverage = service.averSalesValue(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void findMaximumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMax = 8;
        long actualMax = service.maxSales(sales);

        Assertions.assertEquals(expectedMax, actualMax);
    }

    @Test
    public void findMinimumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMin = 9;
        long actualMin = service.minSales(sales);

        Assertions.assertEquals(expectedMin, actualMin);
    }

    @Test
    public void findBelowAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedBelow = 5;
        long actualBelow = service.belowAverSales(sales);

        Assertions.assertEquals(expectedBelow, actualBelow);
    }

    @Test
    public void findAboveAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAbove = 5;
        long actualAbove = service.aboveAverSales(sales);

        Assertions.assertEquals(expectedAbove, actualAbove);
    }

}
