package com.mycompany.contador01;

public class Contador01 {

    public static void main(String[] args) {

        int cc = 0;
        while (cc < 10){
            cc++;
            if (cc == 5 || cc == 7 || cc == 9) {
               continue; // não mostra na telae continua o bloco de codigo do while 
            }
            System.out.println("Cambalhota " + (cc));
            
            if (cc%2 == 0) {
               System.out.println("PARES: " + cc);
            } else{
               System.out.println("IMPARES: " + cc);
            }
            
        }
        
                
    }
}
