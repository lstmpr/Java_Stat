package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateAverage(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int maxMonth(int[] sales) {
        int numMaxMonth = 0;
        int numMonth = 0;
        for (int sale : sales) {
            if (sale >= sales[numMaxMonth]) {
                numMaxMonth = numMonth;
            }
            numMonth += 1;
        }
        return numMaxMonth + 1;
    }

    public int minMonth(int[] sales) {
        int numMinMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[numMinMonth]) {
                numMinMonth = month;
            }
            month += 1;
        }
        return numMinMonth + 1;
    }

    public int countMonthLowAverage(int[] sales) {
        int count = 0;
        int averageNum = calculateAverage(sales);
        for (int sale : sales) {
            if (sale < averageNum) {
                count++;
            }
        }
        return count;
    }

    public int countMonthMoreAverage(int[] sales) {
        int count = 0;
        int averageNum = calculateAverage(sales);
        for (int sale : sales) {
            if (sale > averageNum) {
                count++;
            }
        }
        return count;
    }


}
