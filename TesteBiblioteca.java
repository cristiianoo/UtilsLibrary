/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package estga.lp.testebiblioteca;

import utils.ConversaoTemperatura;
import utils.ConversaoDistancia;
import utils.ConversaoPeso;
import utils.ConversaoTempo;
import utils.ConversaoVelocidade;
import utils.ConversaoArea;
import utils.FifoBuffer;
import utils.LifoBuffer;

public class TesteBiblioteca {
    public static void main(String[] args) {
        // Teste de conversão de temperatura
        testarConversaoTemperatura();

        // Teste de conversão de distância
        testarConversaoDistancia();

        // Teste de conversão de peso
        testarConversaoPeso();

        // Teste de conversão de tempo
        testarConversaoTempo();

        // Teste de conversão de velocidade
        testarConversaoVelocidade();

        // Teste de conversão de área
        testarConversaoArea();

        // Teste de FIFO
        testarFifoBuffer();

        // Teste de LIFO
        testarLifoBuffer();
    }

    private static void testarConversaoTemperatura() {
        System.out.println("Testando Conversão de Temperatura:");
        double celsius = 25;
        double fahrenheit = ConversaoTemperatura.converterTemperatura(celsius, "C", "F");
        double kelvin = ConversaoTemperatura.converterTemperatura(celsius, "C", "K");
        System.out.println(celsius + "°C = " + fahrenheit + "°F");
        System.out.println(celsius + "°C = " + kelvin + "K");

        double fahrenheitToCelsius = ConversaoTemperatura.converterTemperatura(fahrenheit, "F", "C");
        System.out.println(fahrenheit + "°F = " + fahrenheitToCelsius + "°C");
        System.out.println();
    }

    private static void testarConversaoDistancia() {
        System.out.println("Testando Conversão de Distância:");
        double metros = 1000;
        double quilometros = ConversaoDistancia.converterDistancia(metros, "m", "km");
        double milhas = ConversaoDistancia.converterDistancia(metros, "m", "mi");
        System.out.println(metros + "m = " + quilometros + "km");
        System.out.println(metros + "m = " + milhas + "mi");

        double milhasParaMetros = ConversaoDistancia.converterDistancia(milhas, "mi", "m");
        System.out.println(milhas + "mi = " + milhasParaMetros + "m");
        System.out.println();
    }

    private static void testarConversaoPeso() {
        System.out.println("Testando Conversão de Peso:");
        double gramas = 500;
        double quilogramas = ConversaoPeso.converterPeso(gramas, "g", "kg");
        double libras = ConversaoPeso.converterPeso(gramas, "g", "lb");
        System.out.println(gramas + "g = " + quilogramas + "kg");
        System.out.println(gramas + "g = " + libras + "lb");

        double librasParaGramas = ConversaoPeso.converterPeso(libras, "lb", "g");
        System.out.println(libras + "lb = " + librasParaGramas + "g");
        System.out.println();
    }

    private static void testarConversaoTempo() {
        System.out.println("Testando Conversão de Tempo:");
        double segundos = 3600;
        double minutos = ConversaoTempo.converterTempo(segundos, "s", "min");
        double horas = ConversaoTempo.converterTempo(segundos, "s", "h");
        System.out.println(segundos + "s = " + minutos + "min");
        System.out.println(segundos + "s = " + horas + "h");

        double horasParaSegundos = ConversaoTempo.converterTempo(horas, "h", "s");
        System.out.println(horas + "h = " + horasParaSegundos + "s");
        System.out.println();
    }

    private static void testarConversaoVelocidade() {
        System.out.println("Testando Conversão de Velocidade:");
        double metrosPorSegundo = 10;
        double quilometrosPorHora = ConversaoVelocidade.converterVelocidade(metrosPorSegundo, "m/s", "km/h");
        double milhasPorHora = ConversaoVelocidade.converterVelocidade(metrosPorSegundo, "m/s", "mph");
        System.out.println(metrosPorSegundo + "m/s = " + quilometrosPorHora + "km/h");
        System.out.println(metrosPorSegundo + "m/s = " + milhasPorHora + "mph");

        double milhasPorHoraParaMetrosPorSegundo = ConversaoVelocidade.converterVelocidade(milhasPorHora, "mph", "m/s");
        System.out.println(milhasPorHora + "mph = " + milhasPorHoraParaMetrosPorSegundo + "m/s");
        System.out.println();
    }

    private static void testarConversaoArea() {
        System.out.println("Testando Conversão de Área:");
        double metrosQuadrados = 1000;
        double hectares = ConversaoArea.converterArea(metrosQuadrados, "m2", "ha");
        double acres = ConversaoArea.converterArea(metrosQuadrados, "m2", "ac");
        System.out.println(metrosQuadrados + "m² = " + hectares + "ha");
        System.out.println(metrosQuadrados + "m² = " + acres + "ac");

        double acresParaMetrosQuadrados = ConversaoArea.converterArea(acres, "ac", "m2");
        System.out.println(acres + "ac = " + acresParaMetrosQuadrados + "m²");
        System.out.println();
    }

    private static void testarFifoBuffer() {
        System.out.println("Testando FIFO Buffer:");
        FifoBuffer<String> fifoBuffer = new FifoBuffer<>();
        fifoBuffer.adicionarElemento("Elemento 1");
        fifoBuffer.adicionarElemento("Elemento 2");
        fifoBuffer.adicionarElemento("Elemento 3");
        System.out.println("Elementos no FIFO Buffer:");
        fifoBuffer.listarElementos();

        System.out.println("Removendo elemento do FIFO Buffer:");
        fifoBuffer.removerElemento();
        fifoBuffer.listarElementos();
        System.out.println();
    }

    private static void testarLifoBuffer() {
        System.out.println("Testando LIFO Buffer:");
        LifoBuffer<String> lifoBuffer = new LifoBuffer<>();
        lifoBuffer.adicionarElemento("Elemento 1");
        lifoBuffer.adicionarElemento("Elemento 2");
        lifoBuffer.adicionarElemento("Elemento 3");
        System.out.println("Elementos no LIFO Buffer:");
        lifoBuffer.listarElementos();

        System.out.println("Removendo elemento do LIFO Buffer:");
        lifoBuffer.removerElemento();
        lifoBuffer.listarElementos();
        System.out.println();
    }
}

