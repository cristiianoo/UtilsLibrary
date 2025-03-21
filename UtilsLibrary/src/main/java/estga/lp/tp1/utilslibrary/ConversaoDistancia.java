/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estga.lp.tp1.utilslibrary;

public class ConversaoDistancia {
    public static double converterDistancia(double valor, String unidadeOrigem, String unidadeDestino) {
        double metros = 0;
        if (unidadeOrigem.equals("m")) {
            metros = valor;
        } else if (unidadeOrigem.equals("km")) {
            metros = valor * 1000;
        } else if (unidadeOrigem.equals("mi")) {
            metros = valor * 1609.34;
        } else if (unidadeOrigem.equals("yd")) {
            metros = valor * 0.9144;
        }

        if (unidadeDestino.equals("m")) {
            return metros;
        } else if (unidadeDestino.equals("km")) {
            return metros / 1000;
        } else if (unidadeDestino.equals("mi")) {
            return metros / 1609.34;
        } else if (unidadeDestino.equals("yd")) {
            return metros / 0.9144;
        }
        return valor; // Retorna o valor original se a conversão não for suportada
    }
}

