package com.Sofia.ind.lab.task4;

import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class Try {
    public static void timeTable(int[] data) {
        NameLesson[] nameLessons = NameLesson.values();
        LocalTime time = LocalTime.of(data[0], data[1]);
        System.out.println(nameLessons[0] + " урок");
        System.out.println("\tначало: " + time.toString());
        for (int i = 0; i < data[4]; i++) {
            time = time.plusMinutes(data[2]);
            System.out.println("\tконец:  " + time.toString());
            System.out.println(nameLessons[i + 1] + " урок");
            time = time.plusMinutes(data[3]);
            System.out.println("\tначало: " + time.toString());
        }
        time = time.plusMinutes(data[2]);
        System.out.println("\tконец:  " + time.toString());
    }

    public static int[] inputData(Scanner scanner) {
        int[] data = new int[5];
        System.out.print("Введите время начала уроков: (часы и минуты через пробел) ");
        String[] strTime = scanner.nextLine().split(" ");
        data[0] = Integer.parseInt(strTime[0]);
        data[1] = Integer.parseInt(strTime[1]);
        System.out.print("Длительность урока: ");
        data[2] = scanner.nextInt();
        System.out.print("Длительность перемены: ");
        data[3] = scanner.nextInt();
        System.out.print("Сколько уроков: ");
        data[4] = scanner.nextInt() - 1;
        return data;
    }

    enum NameLesson {
        Первый, Второй, Третий, Четвёртый, Пятый, Шестой, Седьмой, Восьмой
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] lessonOption = inputData(scanner);
        timeTable(lessonOption);
        scanner.close();
    }
}
