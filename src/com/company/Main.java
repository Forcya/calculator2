package com.company;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    public static String[] array = new String[3];
    public static String numbering = "";
    static int num1;
    static int num2;

    public static void main(String[] args) {

        //Создаем объект класса Equation
        Equation equation = new Equation();
        Translation translation = new Translation();

        //Выводим в консоли текст: "Введи уравнение: "
        System.out.println("Введи уравнение: ");

        //Создаем строковый массив из 3 переменных и записываем в, только что созданные, переменные значения из введенной в консоли строки (переменные отделены друг от друга пробелом: " ")
        array = scan.nextLine().split(" ");


        if (Objects.equals(array[0], "1") | Objects.equals(array[0], "2") | Objects.equals(array[0], "3") | Objects.equals(array[0], "4") | Objects.equals(array[0], "5") | Objects.equals(array[0], "6") | Objects.equals(array[0], "7") | Objects.equals(array[0], "8") | Objects.equals(array[0], "9") | Objects.equals(array[0], "10")) {
            numbering = "Арабские";
        } else if (Objects.equals(array[0], "I") | Objects.equals(array[0], "II") | Objects.equals(array[0], "III") | Objects.equals(array[0], "IV") | Objects.equals(array[0], "V") | Objects.equals(array[0], "VI") | Objects.equals(array[0], "VII") | Objects.equals(array[0], "VIII") | Objects.equals(array[0], "IX") | Objects.equals(array[0], "X")) {
            if (Objects.equals(array[2], "I") | Objects.equals(array[2], "II") | Objects.equals(array[2], "III") | Objects.equals(array[2], "IV") | Objects.equals(array[2], "V") | Objects.equals(array[2], "VI") | Objects.equals(array[2], "VII") | Objects.equals(array[2], "VIII") | Objects.equals(array[2], "IX") | Objects.equals(array[2], "X")) {
                numbering = "Римские";
                translation.translate_int();
            } else
                throw new InputMismatchException();
        }

        //Преобразование строчных чисел в int
        num1 = Integer.parseInt(array[0]);
        num2 = Integer.parseInt(array[2]);

        //Метод подсчета
        equation.calculate();
    }
}


