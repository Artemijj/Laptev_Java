package org.aston;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Введите целое число и нажмите Enter");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            if (Integer.parseInt(reader.readLine()) > 7) {
                System.out.println("Привет");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}