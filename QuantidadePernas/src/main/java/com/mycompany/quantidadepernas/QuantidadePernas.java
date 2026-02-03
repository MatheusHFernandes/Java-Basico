package com.mycompany.quantidadepernas;

import java.util.Scanner;

public class QuantidadePernas {

    public static void main(String[] args) {
        
        Scanner t = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de pernas: ");
        int pernas = t.nextInt();
        String tipo;
        
        switch (pernas) {
            case 1:
                tipo = "SACI";
                break;
            case 2:
                tipo = "BÍPEDE";
                break;
            case 4:
                tipo = "QUADRÚPE";
                break;
            case 6,8:
                tipo = "ARANHA";
                break;
            default:
                tipo = "ET";
                break;
        }
        System.out.println(tipo);
        
    }
}
