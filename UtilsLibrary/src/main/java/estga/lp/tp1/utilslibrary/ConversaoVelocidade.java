/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estga.lp.tp1.utilslibrary;

public class ConversaoVelocidade {
    public static double converterVelocidade(double valor, String unidadeOrigem, String unidadeDestino) {
        double metrosPorSegundo = 0;
        if (unidadeOrigem.equals("m/s")) {
            metrosPorSegundo = valor;
        } else if (unidadeOrigem.equals("km/h")) {
            metrosPorSegundo = valor * 1000 / 3600;
        } else if (unidadeOrigem.equals("mph")) {
            metrosPorSegundo = valor * 1609.34 / 3600;
        } else if (unidadeOrigem.equals("kn")) {
            metrosPorSegundo = valor * 1852 / 3600;
        }

        if (unidadeDestino.equals("m/s")) {
            return metrosPorSegundo;
        } else if (unidadeDestino.equals("km/h")) {
            return metrosPorSegundo * 3600 / 1000;
        } else if (unidadeDestino.equals("mph")) {
            return metrosPorSegundo * 3600 / 1609.34;
        } else if (unidadeDestino.equals("kn")) {
            return metrosPorSegundo * 3600 / 1852;
        }
        return valor; // Retorna o valor original se a conversão não for suportada
    }
}

