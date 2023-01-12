package com.groupstudy.groupstudy;

import java.util.Objects;
import java.util.Scanner;

public class Utils {

    private static Scanner teclado;

    public static void print(String value) {
        System.out.println(value);
    }

    public static int teclado() {
        if (Objects.isNull(teclado)) {
            teclado = new Scanner(System.in);
        }

        return teclado.nextInt();
    }
}
