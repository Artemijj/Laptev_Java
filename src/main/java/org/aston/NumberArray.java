package org.aston;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberArray {
    public static void main(String[] args) {
        System.out.println("Введите последовательность чисел, через пробел, и нажмите Enter");
        int[] arrayNum;
        String stringNum = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            stringNum = reader.readLine();
            } catch (IOException e) {
            e.printStackTrace();
        }
        String[] arrayStr = stringNum.split(" ");
        arrayNum = new int[arrayStr.length];
        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = Integer.parseInt(arrayStr[i]);
        }
        System.out.println("Элементы массива, кратные 3:");
        for (int i : arrayNum) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }

    }
}
