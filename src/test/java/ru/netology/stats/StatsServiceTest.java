package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    public final int[] SALES = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void sumSales() {
        int actual = StatsService.sumSales(SALES);

        assertEquals(180, actual);
    }

    @Test
    public void averageSales() {
        double actual = StatsService.averageSales(SALES);

        assertEquals(15, actual);
    }

    @Test
    public void maxSales() {
        int actual = StatsService.maxSales(SALES);

        assertEquals(8, actual);
    }

    @Test
    public void minSales() {
        int actual = StatsService.minSales(SALES);

        assertEquals(9, actual);
    }

    @Test
    public void lessThanAverageSumSale() {
        int actual = StatsService.lessThanAverageSumSale(SALES);

        assertEquals(5, actual);
    }

    @Test
    public void moreThanAverageSumSale() {
        int actual = StatsService.moreThanAverageSumSale(SALES);

        assertEquals(5, actual);
    }
}