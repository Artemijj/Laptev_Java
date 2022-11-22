package org.aston;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vyacheslav {
    public static void main(String[] args) {
        System.out.println("Введите имя и нажмите Enter");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            if (reader.readLine().equals("Вячеслав")) {
                System.out.println("Привет, Вячеслав");
            } else {
                System.out.println("Нет такого имени");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
