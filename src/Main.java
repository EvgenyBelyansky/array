public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа Массивы 1 часть");
        System.out.println("Задача № 1");
        int[] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;

        double[] j = {1.57, 7.654, 9.986};

        double[] k = {0.57, 25.4, 289.53};

        System.out.println("\nЗадача № 2");
        System.out.printf("%d, %d, %d%n", i[0], i[1], i[2]);
        System.out.printf("%f, %f, %f%n", j[0], j[1], j[2]);
        System.out.printf("%f, %f, %f%n", k[0], k[1], k[2]);


        for (int l = 0; l < i.length; l++) {
            System.out.print(i[l]);
            if (l != i.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int l = 0; l < j.length; l++) {
            System.out.print(j[l]);
            if (l != j.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int l = 0; l < k.length; l++) {
            System.out.print(k[l]);
            if (l != k.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("\n\nЗадача № 3");
        for (int l = i.length - 1; l >= 0; l--) {
            System.out.print(i[l]);
            if (l != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int l = j.length - 1; l >= 0; l--) {
            System.out.print(j[l]);
            if (l != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int l = k.length - 1; l >= 0; l--) {
            System.out.print(k[l]);
            if (l != 0) {
                System.out.print(", ");
            }
        }

        System.out.println("\n\nЗадача № 4");
        for (int l = 0; l < i.length; l++) {
            if (i[l] % 2 != 0) {
                i[l]++;
            }
            System.out.print(i[l] + " ");
        }
    }
}