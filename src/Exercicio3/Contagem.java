package Exercicio3;

import javax.swing.*;

public class Contagem {
    public static void main(String[] args){


        int contagem = 0;

        String numero = JOptionPane.showInputDialog(null,"Insira um valor para loop ");
        int num = Integer.parseInt(numero);

        for (int i=0; i<num; i++) {

            JOptionPane.showMessageDialog(null, "For " + i);
        }
        while (num > contagem ){
            JOptionPane.showMessageDialog(null,"Whille "+contagem);
            contagem ++;
        }
        contagem = 0;

        do {
            JOptionPane.showMessageDialog(null, "Do while "+ contagem);
            contagem++;

        } while (contagem < num);
    }

}



