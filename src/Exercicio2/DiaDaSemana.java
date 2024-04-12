package Exercicio2;
import javax.swing.*;

public class DiaDaSemana {
    public static void main(String[] args){

        String numberDay = JOptionPane.showInputDialog("Insira um número para saber qual o dia da semana referente a ele");
        int day = Integer.parseInt((numberDay));

        String nameDay;

        switch (day) {
            case Constantes.domingo:
                nameDay = "Domingo";
                break;
            case Constantes.segunda:
                nameDay = "Segunda";
                break;
            case Constantes.terca:
                nameDay = "Terça";
                break;
            case Constantes.quarta:
                nameDay = "Quarta";
                break;
            case Constantes.quinta:
                nameDay = "Quinta";
                break;
            case Constantes.sexta:
                nameDay = "Sexta";
                break;
            case Constantes.sabado:
                nameDay = "Sabado";
                break;
            default:
                nameDay = "Dia invalido!";
                break;
        }
        JOptionPane.showMessageDialog(null,"O dia da semana referente a "+day+ " é "+nameDay+"!" );

    }
}
