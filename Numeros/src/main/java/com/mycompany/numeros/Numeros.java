package com.mycompany.numeros;

import java.util.Scanner;

public class Numeros {

    public static void main(String[] args) {

        int n, s = 0;
        String resp;
        
        Scanner t = new Scanner (System.in);
        do {
            System.out.println("Digite um número: ");
            n = t.nextInt();
            s += n;
            System.out.println("Quer continuar?");
            resp = t.next();
        } while (resp.equals("s") || resp.equals("S"));
        System.out.println("A soma de todos os valores é: " + s);
    }
}
