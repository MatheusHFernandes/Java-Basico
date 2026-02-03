package com.mycompany.programaimparpar;

import java.util.Scanner;

public class ProgramaImparPar {

    public static void main(String[] args) {

    Scanner t = new Scanner(System.in);
    System.out.println("Insira um numero: ");
    int i = t.nextInt();
        if (i%2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
    }
}
