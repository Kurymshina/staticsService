package ru.netology.stats;

public class StatsService {

    public static int sumSales(int[] sales) {
        int result = 0;
        for (int sale : sales) {
            result = sale + result;
        }
        return result;
    }

    public static int averageSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = (sale + sum);

        }
        return (sum / sales.length);
    }

    public static int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public static int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public static int lessThanAverageSumSale(int[] sales) {
        int average = averageSales(sales);
        int result = 0;
        for (int sale : sales) {
            if (average < sale) {
                result++;
            }
        }
        return result;
    }

    public static int moreThanAverageSumSale(int[] sales) {
        int average = averageSales(sales);
        int result = 0;
        for (int sale : sales) {
            if (average > sale) {
                result++;
            }
        }
        return result;
    }
}