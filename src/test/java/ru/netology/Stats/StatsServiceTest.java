package ru.netology.Stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void findMin() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSale = 9;
        int actualSale = service.minSales(sales);

        Assertions.assertEquals(expectedSale, actualSale);
    }

    @Test
    public void findMax() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSale = 8;
        int actualSale = service.maxSales(sales);

        Assertions.assertEquals(expectedSale, actualSale);
    }

    @Test
    public void findSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSale = 180;
        long actualSale = service.sum(sales);

        Assertions.assertEquals(expectedSale, actualSale);
    }

    @Test
    public void findMedium() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSale = 15;
        long actualSale = service.mediumSale(sales);

        Assertions.assertEquals(expectedSale, actualSale);
    }

    @Test
    public void findBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMonth = 5;
        long actualMonth = service.belowAverage(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void findAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMonth = 5;
        long actualMonth = service.aboveAverage(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }
}
