public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа массивы №2");
        System.out.println("\nЗадача № 1");
        int[] salaries = {25_000, 15_556, 104_586, 87_563, 74_562};
        int sumSalaries = 0;
        for (int salary : salaries) {
            sumSalaries += salary;
        }
        System.out.printf("Сумма трат за месяц составила %,d рублей%n", sumSalaries);

        System.out.println("\nЗадача № 2");
        int[] expenses = {2, 1, 3, 5, 10};
        int minExpence = expenses[0];
        int maxExpence = expenses[0];
        for (int expens : expenses) {
            if (expens > maxExpence) {
                maxExpence = expens;
            }
            if (expens < minExpence) {
                minExpence = expens;
            }
        }
        System.out.printf("Минимальная сумма трат за неделю составила %d рублей. Максимальная сумма трат за неделю " +
                "составила %d рублей\n", minExpence, maxExpence);

        System.out.println("\nЗадача № 3");
        int[] expenses2 = {2, 1, 3, 5, 10};

        int sumExpenses2 = 0;
        for (int salary : expenses2) {
            sumExpenses2 += salary;
        }
        double averageExpenses2 = (double)sumExpenses2 / expenses2.length;
        System.out.printf("Средняя сумма трат за месяц составила %,2.2f рублей\n", averageExpenses2);

        System.out.println("\nЗадача № 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}