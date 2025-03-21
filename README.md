# Utils Library
Biblioteca Java que fornece funcionalidades para conversão de unidades e manipulação de estruturas de dados FIFO e LIFO.

## Descrição
A UtilsLibrary é uma biblioteca que oferece métodos para conversão entre diferentes unidades de medida e implementa estruturas de dados FIFO e LIFO.

## Funcionalidades
### Módulo de Conversão de Unidades
#### Conversão de Temperatura
- ConversaoTemperatura.converterTemperatura(double valor, String unidadeOrigem, String unidadeDestino)
- Unidades: Celsius (C), Fahrenheit (F) e Kelvin (K)
#### Conversão de Distância
- ConversaoDistancia.converterDistancia(double valor, String unidadeOrigem, String unidadeDestino)
- Unidades: metros (m), quilómetros (km), milhas (mi) e jardas (yd)
#### Conversão de Peso
- ConversaoPeso.converterPeso(double valor, String unidadeOrigem, String unidadeDestino)
- Unidades: gramas (g), quilogramas (kg), libras (lb) e onças (oz)
#### Conversão de Peso
- ConversaoPeso.converterPeso(double valor, String unidadeOrigem, String unidadeDestino)
- Unidades: gramas (g), quilogramas (kg), libras (lb) e onças (oz)
#### Conversão de Tempo
- ConversaoTempo.converterTempo(double valor, String unidadeOrigem, String unidadeDestino)
- Unidades: segundos (s), minutos (min), horas (h) e dias (d)
#### Conversão de velocidade
- ConversaoVelocidade.converterVelocidade(double valor, String unidadeOrigem, String unidadeDestino)
- Unidades: metros por segundo (m/s), quilómetros por hora (km/h), milhas por hora (mph) e nós (kn)
#### Conversão de Área
- ConversaoArea.converterArea(double valor, String unidadeOrigem, String unidadeDestino)
- Unidades: metros quadrados (m2), quilómetros quadrados (km2), hectares (ha) e acres (ac)

### Módulo de Estruturas de Dados
#### FifoBuffer (First In, First Out)
- adicionarElemento(T elemento): Adiciona um elemento ao buffer
- removerElemento(): Remove o elemento mais antigo
- listarElementos(): Lista todos os elementos armazenados
####LifoBuffer (Last In, Last Out)
- adicionarElemento(T elemento): Adiciona um elemento ao buffer
- removerElemento(): Remove o elemento mais recente
- listarElementos(): Lista todos os elementos armazenados

## Estrutura do Projeto
O projeto está organizado nos seguintes pacotes:
- utils: Contém todas as classes de conversão e estruturas de dados
  - ConversaoTemperatura.java
  - ConversaoDistancia.java
  - ConversaoPeso.java
  - ConversaoTempo.java
  - ConversaoVelocidade.java
  - ConversaoArea.java
  - FifoBuffer.java
  - LifoBuffer.java
