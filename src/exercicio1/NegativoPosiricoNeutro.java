package exercicio1;

import javax.swing.*;

public class NegativoPositivoNeutro.java {
    public static void main(String[] args) {

        String numero = JOptionPane.showInputDialog(null, "Insira um número para saber se é POSITIVO, NEUTRO ou NEGATIVO");
        int num = Integer.parseInt(numero);

        if ( num > 0) {
            JOptionPane.showMessageDialog(null,"Número positivo");

        }
        else if ( num < 0) {
            JOptionPane.showMessageDialog(null,"Número negativo");

        }
        else {
            JOptionPane.showMessageDialog(null,"Número neutro");
        }

    }
}
