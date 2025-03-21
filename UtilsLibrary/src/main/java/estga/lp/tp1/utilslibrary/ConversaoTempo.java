/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

public class ConversaoTempo {
    public static double converterTempo(double valor, String unidadeOrigem, String unidadeDestino) {
        double segundos = 0;
        if (unidadeOrigem.equals("s")) {
            segundos = valor;
        } else if (unidadeOrigem.equals("min")) {
            segundos = valor * 60;
        } else if (unidadeOrigem.equals("h")) {
            segundos = valor * 3600;
        } else if (unidadeOrigem.equals("d")) {
            segundos = valor * 86400;
        }

        if (unidadeDestino.equals("s")) {
            return segundos;
        } else if (unidadeDestino.equals("min")) {
            return segundos / 60;
        } else if (unidadeDestino.equals("h")) {
            return segundos / 3600;
        } else if (unidadeDestino.equals("d")) {
            return segundos / 86400;
        }
        return valor; // Retorna o valor original se a conversão não for suportada
    }
}

