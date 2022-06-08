
public class Main {
    public static void main(String[] args) {
        //task 1
        byte varForByte = 127;
        short varForShort = -32768;
        long varForLong = 999L;
        float varForFloat = 0.1f;
        double varForDouble = 0.000000001;

        //task 2
        float firstBoxerWeight = 78.2f;
        float secondBoxerWeight = 82.7f;

        float totalBoxersWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес боксеров равен " + totalBoxersWeight + " килограмм");

        float deltaBoxersWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница в весе боксеров равна " + deltaBoxersWeight + " килограмм");

        //task 3
        byte bananaCount = 5;
        byte bananaWeight = 80;
        short milkCount = 200;
        float milkDensity = 105.0f / 100;
        byte icecreamCount = 2;
        byte icecreamWeight = 100;
        byte eggsCount = 4;
        byte eggWeight = 70;

        float breakfastWeight = bananaCount * bananaWeight + milkCount * milkDensity + icecreamCount * icecreamWeight
                + eggsCount * eggWeight;
        float breakfastWeightKilo = breakfastWeight / 1000;
        System.out.println("Общий вес завтрака спортсмена равен " + breakfastWeight + " грамм или " + breakfastWeightKilo + " килограмм");

        //task 4
        byte loseWeightKilo = 7;
        int loseWeightGram = loseWeightKilo * 1000;
        short minLosePerDayGram = 250;
        short maxLosePerDayGram = 500;

        int maxDaysToLoseWeight = loseWeightGram / minLosePerDayGram;
        int minDaysToLoseWeight = loseWeightGram / maxLosePerDayGram;
        int averageDaysToLoseWeight = (minDaysToLoseWeight + maxDaysToLoseWeight) / 2;

        System.out.println("Спортсмен сможет сбросить вес до необходимого за период от " + minDaysToLoseWeight + " до " +
                maxDaysToLoseWeight + " дней. \nВ среднем добиться результата похуденя спортсмен сможет через "
                + averageDaysToLoseWeight + " дней");

        //task 5
        int mariaMonthSalary = 67760;
        int denisMonthSalary = 83690;
        int kristinaMonthSalary = 76230;

        float mariaNewMonthSalary = mariaMonthSalary * 1.1f;
        float denisNewMonthSalary = denisMonthSalary * 1.1f;
        float kristinaNewMonthSalary = kristinaMonthSalary * 1.1f;

        float mariaAnnualSalaryUp = (mariaNewMonthSalary - mariaMonthSalary) * 12;
        float denisAnnualSalaryUp = (denisNewMonthSalary - denisMonthSalary) * 12;
        float kristinaAnnualSalaryUp = (kristinaNewMonthSalary - kristinaMonthSalary) * 12;

        System.out.println("Маша теперь получает " + mariaNewMonthSalary + " рублей. Годовой доход вырос на " + mariaAnnualSalaryUp +" рублей");
        System.out.println("Денис теперь получает " + denisNewMonthSalary + " рублей. Годовой доход вырос на " + denisAnnualSalaryUp +" рублей");
        System.out.println("Кристина теперь получает " + kristinaNewMonthSalary + " рублей. Годовой доход вырос на " + kristinaAnnualSalaryUp +" рублей");

        //task 6
        byte a = 12;
        byte b = 27;
        byte c = 44;
        byte d = 15;
        byte e = 9;

        int result = a * (b + (c - d * e));
        result = result * -1;
        System.out.println(result);

        //task 7
        int f = 5;
        int j = 7;
        System.out.println(f + " " + j);
        f = f + j;
        j = f - j;
        f = f - j;
        System.out.println(f + " " + j);

        //task 8
        int k = 739;
        int l = (k % 100 - k % 10) / 10;
        System.out.println(l);
    }
}
