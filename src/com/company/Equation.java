package com.company;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Equation extends Translation {

    static int result = 0;

    public void calculate () {
        int n1 = Main.num1;
        int n2 = Main.num2;

        //Выброс исключения, если в массиве не 3 переменные
        if (Main.array.length != 3) {
            throw new InputMismatchException();
        }

        if (n1 <= 10 && n1 > 0 && n2 <= 10 && n2 > 0) {
            if (Objects.equals(Main.array[1], "+")) {
                result = n1 + n2;
            } else if (Objects.equals(Main.array[1], "-")) {
                result = n1 - n2;
            } else if (Objects.equals(Main.array[1], "/")) {
                result = n1 / n2;
            } else if (Objects.equals(Main.array[1], "*")) {
                result = n1 * n2;
            }


            if (Main.numbering == "Арабские") {
                System.out.println(result);
            } else if (Main.numbering == "Римские") {
                if (result == 0) {
                    System.out.println(result);
                } else {
                    super.translate_str();
                    System.out.println(result2);
                }

                //Выброс исключения, если ответ < 0
                if (Equation.result < 0) {
                    throw new InputMismatchException();
                }
            }
        } else
            throw new IllegalArgumentException ();
    }
}
