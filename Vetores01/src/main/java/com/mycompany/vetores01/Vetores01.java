package com.mycompany.vetores01;

public class Vetores01 {

    public static void main(String[] args) {

        int n[] = {3,2,8,7,5,4};
        System.out.println("Total de casas de N " + n.length);
        for (int i = 0; i <= n.length - 1; i++) {
            System.out.println("Na posição" + i + "temos o valor " + n[i]);
        }
    }
}
