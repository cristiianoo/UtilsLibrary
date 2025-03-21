/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

public class ConversaoPeso {
    public static double converterPeso(double valor, String unidadeOrigem, String unidadeDestino) {
        double gramas = 0;
        if (unidadeOrigem.equals("g")) {
            gramas = valor;
        } else if (unidadeOrigem.equals("kg")) {
            gramas = valor * 1000;
        } else if (unidadeOrigem.equals("lb")) {
            gramas = valor * 453.592;
        } else if (unidadeOrigem.equals("oz")) {
            gramas = valor * 28.3495;
        }

        if (unidadeDestino.equals("g")) {
            return gramas;
        } else if (unidadeDestino.equals("kg")) {
            return gramas / 1000;
        } else if (unidadeDestino.equals("lb")) {
            return gramas / 453.592;
        } else if (unidadeDestino.equals("oz")) {
            return gramas / 28.3495;
        }
        return valor; // Retorna o valor original se a conversão não for suportada
    }
}

