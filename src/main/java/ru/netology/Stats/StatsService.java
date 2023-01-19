package ru.netology.Stats;

public class StatsService {
    public int minSales(long[] sales) { //метод №4
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) { //метод №3
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public long sum(long[] sales) { // метод №1
        long sumSale = 0; //сумма всех продаж
        for (long sale : sales) {
            sumSale = sumSale + sale;
        }
        return sumSale;
    }

    public long mediumSale(long[] sales) { // метод №2
        long medium = sum(sales);
        return sum(sales) / sales.length;
    }

    public int belowAverage(long[] sales) { //метод №5
        int month = 0;
        for (long sale : sales) {
            if (sale < mediumSale(sales)) {
                month = month + 1;
            }
        }
        return month;
    }
    public int aboveAverage(long[] sales) { //метод №6
        int month = 0;
        for (long sale : sales) {
            if (sale > mediumSale(sales)) {
                month = month + 1;
            }
        }
        return month;
    }

}