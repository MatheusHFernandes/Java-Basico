package com.mycompany.repitaoptionpane;

import javax.swing.JOptionPane;

public class RepitaOptionPane {

    public static void main(String[] args) {
        
        int n,s = 0;
        
        do {
            
          n = Integer.parseInt (JOptionPane.showInputDialog("<html>Informe um número: <br><em>(valor 0 interrompe)</em></html> "));
        
          s += n;
        } while (n != 0);
        JOptionPane.showMessageDialog(null, "<html>Resultado final <hr><br>Somatorio vale " + s + "</html>");
        
    }
}
