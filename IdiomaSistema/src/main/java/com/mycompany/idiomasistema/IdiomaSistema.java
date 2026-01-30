package com.mycompany.idiomasistema;

import java.util.Locale;

public class IdiomaSistema {

    public static void main(String[] args) {
    
        Locale locale = Locale.getDefault();
        
        System.out.println("Idioma do sistema: " + locale.getLanguage());
        System.out.println("Nome do idioma: " + locale.getDisplayLanguage());
        System.out.println("País: " + locale.getDisplayCountry());
        
    }
}
