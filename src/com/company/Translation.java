package com.company;

import java.util.InputMismatchException;
import java.util.Objects;

public class Translation {

    int  []A = {1, 4, 5, 9, 10, 40, 50, 90, 100};
    String []R = {"I","IV","V","IX","X","XL","L","XC","C"};
    String result2 = "";

    public void translate_int () {
        if (Objects.equals(Main.array[0], "I")) {
            Main.array[0] = "1";
        } else if (Objects.equals(Main.array[0], "II")) {
            Main.array[0] = "2";
        } else if (Objects.equals(Main.array[0], "III")) {
            Main.array[0] = "3";
        } else if (Objects.equals(Main.array[0], "IV")) {
            Main.array[0] = "4";
        } else if (Objects.equals(Main.array[0], "V")) {
            Main.array[0] = "5";
        } else if (Objects.equals(Main.array[0], "VI")) {
            Main.array[0] = "6";
        } else if (Objects.equals(Main.array[0], "VII")) {
            Main.array[0] = "7";
        } else if (Objects.equals(Main.array[0], "VIII")) {
            Main.array[0] = "8";
        } else if (Objects.equals(Main.array[0], "IX")) {
            Main.array[0] = "9";
        } else if (Objects.equals(Main.array[0], "X")) {
            Main.array[0] = "10";
        }

        if (Objects.equals(Main.array[2], "I")) {
            Main.array[2] = "1";
        } else if (Objects.equals(Main.array[2], "II")) {
            Main.array[2] = "2";
        } else if (Objects.equals(Main.array[2], "III")) {
            Main.array[2] = "3";
        } else if (Objects.equals(Main.array[2], "IV")) {
            Main.array[2] = "4";
        } else if (Objects.equals(Main.array[2], "V")) {
            Main.array[2] = "5";
        } else if (Objects.equals(Main.array[2], "VI")) {
            Main.array[2] = "6";
        } else if (Objects.equals(Main.array[2], "VII")) {
            Main.array[2] = "7";
        } else if (Objects.equals(Main.array[2], "VIII")) {
            Main.array[2] = "8";
        } else if (Objects.equals(Main.array[2], "IX")) {
            Main.array[2] = "9";
        } else if (Objects.equals(Main.array[2], "X")) {
            Main.array[2] = "10";
        }
    }

    public void translate_str () {
        int i = 8;
        while (Equation.result > 0) {
            while (A[i] > Equation.result) {
                i--;
            }
            result2 += R[i];
            Equation.result -= A[i];
        }
    }

}
