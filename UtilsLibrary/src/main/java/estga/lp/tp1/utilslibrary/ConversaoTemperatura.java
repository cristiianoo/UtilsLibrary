/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estga.lp.tp1.utilslibrary;

public class ConversaoTemperatura {
    public static double converterTemperatura(double valor, String unidadeOrigem, String unidadeDestino) {
        if (unidadeOrigem.equals("C")) {
            if (unidadeDestino.equals("F")) {
                return (valor * 9/5) + 32;
            } else if (unidadeDestino.equals("K")) {
                return valor + 273.15;
            }
        } else if (unidadeOrigem.equals("F")) {
            if (unidadeDestino.equals("C")) {
                return (valor - 32) * 5/9;
            } else if (unidadeDestino.equals("K")) {
                return (valor - 32) * 5/9 + 273.15;
            }
        } else if (unidadeOrigem.equals("K")) {
            if (unidadeDestino.equals("C")) {
                return valor - 273.15;
            } else if (unidadeDestino.equals("F")) {
                return (valor - 273.15) * 9/5 + 32;
            }
        }
        return valor; // Retorna o valor original se a conversão não for suportada
    }
}


