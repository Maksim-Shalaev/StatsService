package StatsService;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {



    @org.junit.jupiter.api.Test
    void findSum() {
        StatsService service = new StatsService();
        int[] profits = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findSum(profits);
        int expected = 180;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void findAveragesum() {
        StatsService service = new StatsService();
        int[] profits = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findAveragesum(profits);
        int expected = 15;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void findMax() {
        StatsService service = new StatsService();
        int[] profits = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findMax(profits);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void findMin() {
        StatsService service = new StatsService();
        int[] profits = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findMin(profits);
        int expected = 9;
        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void findUnderaverage() {
        StatsService service = new StatsService();
        int[] profits = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findUnderaverage(profits);
        int expected = 7;
        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void findOveraverage() {
        StatsService service = new StatsService();
        int[] profits = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findOveraverage(profits);
        int expected = 5;
        assertEquals(expected, actual);
    }
}