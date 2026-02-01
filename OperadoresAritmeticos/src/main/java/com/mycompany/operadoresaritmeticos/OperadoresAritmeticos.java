package com.mycompany.operadoresaritmeticos;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        
        int n1 = 3;
        int n2 = 5;
        
        float m = (n1 + n2)/2;
        System.out.println("A média é igual a " + m);
        
        System.out.println("===== PRECENDENCIA DE INCREMENTOS =====");
        
        int numero = 10;
        int valor = 5 + ++numero;
        System.out.println(valor);
        System.out.println(numero);
                                                //Ordem de precedencia do ++ e --
        int numero2 = 10;
        int valor2 = 4 + numero2--;
        System.out.println(valor2);
        System.out.println(numero2);
        
        System.out.println("===== ATRIBUIÇOES =====");
        
        int x = 4;
        x += 2; // soma e atribui
        
        System.out.println(x);
        
        int y = 5;
        y -= 3; // subtrai e atribui
        
        System.out.println(y);
        
        System.out.println("===== ARRENDONDAMENTOS =====");
        
        float v = 8.9f;
        int ar = (int) Math.floor(v);
        System.out.println(ar);
        
        float v2 = 8.9f;
        int ar2 = (int) Math.ceil(v2);
        System.out.println(ar2);
        
        float v3 = 8.5f;
        int ar3 = (int) Math.round(v3);
        System.out.println(ar3);
        
        System.out.println("===== GERADOR DE NUMEROS =====");
        
        double ale = Math.random();
        int nu = (int) (15 +  ale * (50-15));
        System.out.println(nu);    
            
    }
}
