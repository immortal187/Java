// Дана последовательность N чисел. Найти количество положительных чисел,
// после которых следует отрицательное число.

package org.example.seminar1.cw;

import java.util.Arrays;
import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        System.out.print("Количество положительных чисел после которых следует отрицательное число: " + getSum(scanner, n));
    }

    /**
     *
     * @apiNote Метод подсчета количества положительных чисел, после которых следует отрицательное.
     * @param scanner
     * @param n - количество последовательных чисел.
     * @return счетчик
     */
    private static int getSum(Scanner scanner, int n) {
        int count = 0;
        int a = scanner.nextInt();

        for (int i = 1; i < n; i++) {
            int b = scanner.nextInt();

            if (a > 0 && b < 0) {
                count++;

            }
            a = b;

        }
        return count;
    }
}
