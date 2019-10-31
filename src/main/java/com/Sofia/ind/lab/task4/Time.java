package com.Sofia.ind.lab.task4;

import java.time.LocalTime;
import java.util.Scanner;

public class Time {
    public static void timeTable(int[] data) {
        Lesson[] Lessons = Lesson.values();
        LocalTime time = LocalTime.of(data[0], data[1]);
        System.out.println(Lessons[0] + " пара");
        System.out.println("\tначало: " + time.toString());
        for (int i = 0; i < data[4]; i++) {
            time = time.plusMinutes(data[2]);
            System.out.println("\tконец:  " + time.toString());
            System.out.println(Lessons[i + 1] + " пара");
            time = time.plusMinutes(data[3]);
            System.out.println("\tначало: " + time.toString());
        }
        time = time.plusMinutes(data[2]);
        System.out.println("\tконец:  " + time.toString());
    }

    public static int[] inputData(Scanner scanner) {
        int[] data = new int[5];
        System.out.print("Введите время начала пары: (например, 8:30) ");
        String[] strTime = scanner.nextLine().split(":");
        data[0] = Integer.parseInt(strTime[0]);
        data[1] = Integer.parseInt(strTime[1]);
        System.out.print("Длительность пары: ");
        data[2] = scanner.nextInt();
        System.out.print("Длительность перерыва: ");
        data[3] = scanner.nextInt();
        System.out.print("Количество пар: ");
        data[4] = scanner.nextInt() - 1;
        return data;
    }

    enum Lesson {
        Первая, Вторая, Третья, Четвёртая, Пятая, Шестая, Седьмая, Восьмая
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] lessonOption = inputData(scanner);
        timeTable(lessonOption);
        scanner.close();
    }
}
