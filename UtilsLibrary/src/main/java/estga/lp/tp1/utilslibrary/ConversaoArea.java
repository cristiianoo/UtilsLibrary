/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estga.lp.tp1.utilslibrary;

public class ConversaoArea {
    public static double converterArea(double valor, String unidadeOrigem, String unidadeDestino) {
        double metrosQuadrados = 0;
        if (unidadeOrigem.equals("m2")) {
            metrosQuadrados = valor;
        } else if (unidadeOrigem.equals("km2")) {
            metrosQuadrados = valor * 1e6;
        } else if (unidadeOrigem.equals("ha")) {
            metrosQuadrados = valor * 10000;
        } else if (unidadeOrigem.equals("ac")) {
            metrosQuadrados = valor * 4046.86;
        }

        if (unidadeDestino.equals("m2")) {
            return metrosQuadrados;
        } else if (unidadeDestino.equals("km2")) {
            return metrosQuadrados / 1e6;
        } else if (unidadeDestino.equals("ha")) {
            return metrosQuadrados / 10000;
        } else if (unidadeDestino.equals("ac")) {
            return metrosQuadrados / 4046.86;
        }
        return valor; // Retorna o valor original se a conversão não for suportada
    }
}

