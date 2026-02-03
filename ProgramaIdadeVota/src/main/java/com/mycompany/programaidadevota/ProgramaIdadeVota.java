package com.mycompany.programaidadevota;

import java.util.Scanner;

public class ProgramaIdadeVota {

    public static void main(String[] args) {
        
        Scanner t = new Scanner(System.in);
        
        System.out.println("Digite o ano que você nasceu: ");
        int nasc = t.nextInt();
        int i = 2026 - nasc;
        
        if (i < 16) {
            System.out.println("Maior de idade");
        } else {
            if ((i >= 16 && i < 18) || (i > 70)) {
            System.out.println("Opicional");    
            }else{
            System.out.println("Obrigatório");
            }
            
        }
    }
}
