package StatsService;

public class StatsService {
    public static void main(String[] args) {
        int[] profits = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int sum = findSum(profits);
        System.out.println("Итоговая сумма за весь период:" + sum);

        int averagesum = findAveragesum(profits);
        System.out.println("Средняя сумма за весь период:" + averagesum);

        int Max = findMax(profits);
        System.out.println("Месяц с максимальной прибылью:" + Max);

        int Min = findMin(profits);
        System.out.println("Месяц с минимальной прибылью:" + Min);

        int monthunderaverage = findUnderaverage(profits);
        System.out.println("Кол-во месяцев с суммой ниже среднемесячного:" + monthunderaverage);

        int monthoveraverage = findOveraverage(profits);
        System.out.println("Кол-во месяцев с суммой выше среднемесячного:" + monthoveraverage);

    }

    public static int findSum(int[] profits) {
        int sum = 0;
        for (int profit : profits) {
            sum += profit;
        }
        return sum;
    }

    public static int findAveragesum(int[] profits) {
        return findSum(profits) / profits.length;
    }

    public static int findMax(int[] profits) {
        int max = profits[0];
        int number = 0;
        int numberMax = 0;
        for (int profit : profits) {
            number++;
            if (max <= profit) {
                max = profit;
                numberMax = number;
            }
        }
        return numberMax;
    }

    public static int findMin(int[] profits) {
        int min = profits[0];
        int number = 0;
        int numberMin = 0;
        for (int profit : profits) {
            number++;
            if (min >= profit) {
                min = profit;
                numberMin = number;
            }
        }
        return numberMin;
    }

    public static int findUnderaverage(int[] profits) {
        int average = findAveragesum(profits);
        int month = 0;
        int quantityUnder = 0;
        for (int profit : profits) {
             if (profit <= average) {
             month++;
             quantityUnder = month;
            }
        }
        return quantityUnder;
    }

    public static int findOveraverage(int[] profits) {
        int average = findAveragesum(profits);
        int month = 0;
        int quantityOver = 0;
        for (int profit : profits) {
            if (profit > average) {
                month++;
                quantityOver = month;
            }
        }
        return quantityOver;
    }
}