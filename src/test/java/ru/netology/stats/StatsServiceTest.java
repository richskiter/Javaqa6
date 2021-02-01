package ru.netology.stats;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    static Stream<Arguments> TotalSumMonth() {
        return Stream.of(
                Arguments.of((new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}), 180),
                Arguments.of((new long[]{13, 9, 18, 12, 12, 46, 32, 55, 3, 22, 45, 13}), 280),
                Arguments.of((new long[]{-1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1}), 6)
        );
    }

    static Stream<Arguments> AverageSum() {
        return Stream.of(
                Arguments.of((new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}), 15),
                Arguments.of((new long[]{13, 9, 18, 12, 12, 46, 32, 55, 3, 22, 45, 13}), 23),
                Arguments.of((new long[]{-1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1}), 0)
        );
    }

    static Stream<Arguments> MaxSumMonth() {
        return Stream.of(
                Arguments.of((new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}), 8),
                Arguments.of((new long[]{13, 9, 18, 12, 12, 46, 32, 55, 3, 22, 45, 13}), 8),
                Arguments.of((new long[]{-1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1}), 12)
        );
    }

    static Stream<Arguments> MinSumMonth() {
        return Stream.of(
                Arguments.of((new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}), 9),
                Arguments.of((new long[]{13, 9, 18, 12, 12, 46, 32, 55, 3, 22, 45, 13}), 9),
                Arguments.of((new long[]{-1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1}), 11)
        );
    }

    static Stream<Arguments> CalculateSumMaxMonth() {
        return Stream.of(
                Arguments.of((new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}), 5),
                Arguments.of((new long[]{13, 9, 18, 12, 12, 46, 32, 55, 3, 22, 45, 13}), 4),
                Arguments.of((new long[]{-1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1}), 6)
        );
    }

    static Stream<Arguments> CalculateSumMinMonth() {
        return Stream.of(
                Arguments.of((new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}), 5),
                Arguments.of((new long[]{13, 9, 18, 12, 12, 46, 32, 55, 3, 22, 45, 13}), 8),
                Arguments.of((new long[]{-1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1}), 6)
        );
    }

    @ParameterizedTest
    @MethodSource("TotalSumMonth")
    void TotalSum(long[] Month, long expected) {
        StatsService services = new StatsService();
        long actual = services.totalSumMonth(Month);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("AverageSum")
    void AverageSum(long[] Month, long expected) {
        StatsService services = new StatsService();
        long actual = services.averageSumMonth(Month);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("MaxSumMonth")
    void MaxSumMonth(long[] Month, long expected) {
        StatsService services = new StatsService();
        long actual = services.maxAmountMonth(Month);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("MinSumMonth")
    void MinSumMonth(long[] Month, long expected) {
        StatsService services = new StatsService();
        long actual = services.minAmountMonth(Month);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("CalculateSumMinMonth")
    void CalculateSumMinMonth(long[] Month, long expected) {
        StatsService services = new StatsService();
        long actual = services.calculateAmountMinMonth(Month);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("CalculateSumMaxMonth")
    void CalculateSumMaxMonth(long[] Month, long expected) {
        StatsService services = new StatsService();
        long actual = services.calculateAmountMaxMonth(Month);
        assertEquals(expected, actual);
    }


}