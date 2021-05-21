package com.company;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


public class Main {

    public static void main(String[] args) throws IOException {


/*      // Приветствовать любого пользователя при вводе его имени через командную строку

        final Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свое имя...");
        final String name  = scanner.nextLine();
        System.out.println("Привет, " + name);*/



/*        // Отобразить в окне консоли аргументы командной строки в обратном порядке

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов, :");
        int value = scanner.nextInt();
        int []array = new int[value];
        System.out.println("Введите целые числа: ");
            for (int i = 0; i < value; i++) {
                 array[i] = scanner.nextInt();
        }
        System.out.print("Введенные числа в обратном порядке: ");
             for (int i = value - 1; i >= 0; i--) {
                 System.out.print(array[i] + " ");
        }*/



/*  // Ввести пароль из командной строки и сравнить его со строкой-образцом

        String my_password = "123";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите пароль: ");
        String entered_password = scanner.next();
            if (entered_password.equals(my_password)) {
                 System.out.println("Пароль правильный");
         }  else {
                 System.out.println("Пароль не верный");
         }*/



/*     //  Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

        Scanner input = new Scanner(System.in);
        System.out.println("Введите число, которое будет соотвествовать количеству выводимых значений  :");
        int value = input.nextInt();
        int[] array = new int[value];
             for (int i = 0; i < array.length; i++) {
                  array[i] = ((int)(Math.random() * 100));
                      System.out.println(array[i] + " ");
        }
        System.out.println(Arrays.toString(array));*/



/*      // Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат на консоль

        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        Integer value1 = s1.nextInt();
        System.out.print("Введите целое число: ");
        Integer value2 = s2.nextInt();
        System.out.print("Сумма введенных чисел: " + (value1 + value2) + "\n");
        System.out.print("Произведение введенных чисел: " + (value1 * value2));*/


/*        // Ввести с консоли n целых чисел. На консоль вывести: наибольшее и наименьшее числоа.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел для сравнения: ");
        int value = scanner.nextInt();
        int[] array = new int[value];
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        System.out.println("Введите целые числа, которые будут сравниваться: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt(); }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i]; }

            if (array[i] < minValue) {
                minValue = array[i]; }
            }
            System.out.println("Максимальное из введенных чисел: " + maxValue);
            System.out.println("Минимальное из введенных чисел: " + minValue);*/



/*        // Ввести с консоли n целых чисел. На консоль вывести: четные и нечетные числа.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел для сравнения: ");
        int valueNumber = scanner.nextInt();
        int[] arrayNumbers = new int[valueNumber];

        System.out.println("Введите целые числа: ");
        for (int i = 0; i < valueNumber; i++) {
            arrayNumbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < valueNumber; i++)
            if (arrayNumbers[i] % 2 != 0) {
                System.out.println("Нечётное число: " + arrayNumbers[i]); }
            else if (arrayNumbers[i] % 2 == 0) {
                System.out.println("Чётное число: " + arrayNumbers[i]); }*/



/*        // Ввести с консоли n целых чисел. На консоль вывести: числа, которые делятся на 3 или на 9.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел для сравнения: ");
        int valueNumber = scanner.nextInt();
        int[] arrayNumbers = new int[valueNumber];

        System.out.println("Введите целые числа: ");
        for (int i = 0; i < valueNumber; i++) {
            arrayNumbers[i] = scanner.nextInt();  }
        for (int i = 0; i < valueNumber; i++)
            if ((arrayNumbers[i] % 3 == 0)) {
                System.out.println("Число, которое делится на 3 или 9: " + arrayNumbers[i]); }*/



/*        // Ввести с консоли n целых чисел. На консоль вывести: числа, которые делятся на 5 и на 7.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел для сравнения: ");
        int valueNumber = scanner.nextInt();
        int[] arrayNumbers = new int[valueNumber]; 

        System.out.println("Введите целые числа: ");
        for (int i = 0; i < valueNumber; i++) {
            arrayNumbers[i] = scanner.nextInt(); }

        for (int i = 0; i < valueNumber; i++)
            if ((arrayNumbers[i] % 5 == 0) && (arrayNumbers[i] % 7 == 0)) {
                System.out.println("Число, которое делится на 5 и 7: " + arrayNumbers[i]); }*/


            // Ввести с консоли n целых чисел. На консоль вывести: все трехзначные числа, в десятичной записи которых нет одинаковых цифр

/*      Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел для сравнения: ");
        int valueNumber = scanner.nextInt();
        int[] arrayNumbers = new int[valueNumber];

        System.out.println("Введите целое трехзначное число: ");
        for (int i = 0; i < valueNumber; i++) {
            arrayNumbers[i] = scanner.nextInt(); }

        int a = 0, b = 0, c = 0;
        for (int j = 0; j < valueNumber; j++)
            if ((arrayNumbers[j] > 99) && (arrayNumbers[j] < 1000)) {
                a = arrayNumbers[j] / 10 / 10;
                b = arrayNumbers[j] / 10 % 10;
                c = arrayNumbers[j] % 100 % 10;
                    if (a != b && a != c && b != a && b != c && c != a && c != b) {
                    System.out.println("Число, в котором нет одинаковых цифр: " + arrayNumbers[j]);}
            }*/




        }

    }














