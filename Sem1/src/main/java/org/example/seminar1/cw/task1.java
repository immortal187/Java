//Given an integer number n, return the difference between the product of its digits and the sum of its digits.
//
//
//        Example 1:
//
//        Input: n = 234
//        Output: 15
//        Explanation:
//        Product of digits = 2 * 3 * 4 = 24
//        Sum of digits = 2 + 3 + 4 = 9
//        Result = 24 - 9 = 15

package org.example.seminar1.cw;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt(); // 234

        System.out.println("result = " + getResult(n));

    }

    /**
     * @param n - входящее число
     * @return - произведение минус сумма
     * @apiNote метод преднозначен для расчета разности произведения и суммы.
     */
    private static int getResult(int n) {
        int pr = 1;
        int sum = 0;

        while (n != 0) {
            pr *= n % 10;
            sum += n % 10;
            n /= 10;
        }
        return pr - sum;
    }
}
