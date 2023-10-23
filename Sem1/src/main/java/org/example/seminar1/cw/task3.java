// Дана строка. Поменять местами половины.

package org.example.seminar1.cw;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();

        String s1 = str1.substring(0, str1.length()/2);
        String s2 = str1.substring(str1.length() / 2);

        String result = s2 + s1;

        System.out.println("result = " + result);

        scanner.close();
    }

}
