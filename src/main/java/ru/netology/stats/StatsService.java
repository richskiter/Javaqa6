package ru.netology.stats;

public class StatsService {
    public long totalSumMonth(long[] sumMonths) {
        long sum = 0;
        for (long sumMonth : sumMonths) {
            if (sumMonth >= 0) {
                sum += sumMonth;
            }
        }
        return sum;
    }

    public long averageSumMonth(long[] sumMonths) {
        long month = 0;
        return totalSumMonth(sumMonths) / sumMonths.length;
    }

    public long maxAmountMonth(long[] sumMonths) {
        long currentMonth = sumMonths[0];
        long month = 0;
        long maxMonth = 0;
        for (long sumMonth : sumMonths) {
            month++;
            if (currentMonth <= sumMonth) {
                currentMonth = sumMonth;
                maxMonth = month;
            }
        }
        return maxMonth;
    }

    public long minAmountMonth(long[] sumMonths) {
        long currentMonth = sumMonths[0];
        long month = 0;
        long minMonth = 0;
        for (long sumMonth : sumMonths) {
            month++;
            if (currentMonth >= sumMonth) {
                currentMonth = sumMonth;
                minMonth = month;
            }
        }
        return minMonth;
    }

    public long calculateAmountMinMonth(long[] sumMonths) {
        long currentMonth = averageSumMonth(sumMonths);
        long minSumMonth = 0;
        for (long sumMonth : sumMonths) {
            if (currentMonth > sumMonth) {
                minSumMonth++;
            }
        }
        return minSumMonth;
    }

    public long calculateAmountMaxMonth(long[] sumMonths) {
        long currentMonth = averageSumMonth(sumMonths);
        long maxSumMonth = 0;
        for (long sumMonth : sumMonths) {
            if (currentMonth < sumMonth) {
                maxSumMonth++;
            }
        }
        return maxSumMonth;
    }
}

