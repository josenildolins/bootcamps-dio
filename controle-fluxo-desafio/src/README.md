
# [DIO](https://web.dio.me/track/santander-bootcamp-2023-fullstack-java-angular) - Santander Bootcamp 20023 - fullstack Java+Angular

#### Autor
- [Josenildo Lins](https://github.com/josenildolins)

## Controle de Fluxo - Desafio

Este projeto tem por objetivo a prática dos assuntos que fora aprendido durante as atividades de java básico do bootcamp:

- Declaração de variáveis
- Declaração das propriedades
- Uso dos laços de repetições
- Tratamento de Exceções
- Criação de exceções customizadas
- Criação de pacotes
- Criação de classes
- Encapsulamento

## Descrição do Desafio - [Autor: Gleyson Sampaio](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/controle-fluxo)

Vamos exercitar todo o conteúdo apresentado no módulo de Controle de Fluxo codificando o seguinte cenário.

O sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros, com estes dois números você deverá obter a quantidade de interações (for) e realizar a impressão no console (System.out.print) dos números incrementados, exemplo:

- Se você passar os números 12 e 30, logo teremos uma interação (for) com 18 ocorrências para imprimir os números, exemplo: `"Imprimindo o número 1"`, `"Imprimindo o número 2"` e assim por diante.
- Se o primeiro parâmetro for MAIOR que o segundo parâmetro, você deverá lançar a exceção customizada chamada de `ParametrosInvalidosException`com a seguinte mensagem: "O segundo parâmetro deve ser maior que o primeiro"  

1. Crie o projeto  `DesafioControleFluxo`
2. Dentro do projeto, crie a classe `Contador.java` para realizar toda a codificação do nosso programa.
3. Dentro do projeto, crie a classe `ParametrosInvalidosException` que representará a exceção de negócio no sistema.

## O que foi feito

Neste projeto eu separei a implementação do código em pacotes, para melhor visualização e manutenção

1. No pacote `bootcamp.santander.classesModelo` foram adicionadas as classes que seriam utilizadas como modelos no projeto
2. No pacote `bootcamp.santander.excessõesPersonalizadas` foram adicionadas as classes de exceções otimizadas
3. No pacote `package main` está localizado a classe main (classe utilizada para execução do código)

Foi realizada o tratamento das seguintes exceções:

- `InputMismatchException`
- `ParametrosInvalidosException`

>
 A exceção `ParametrosInvalidosException` é lançada quando o valor do primeiro parâmetro é maior que o valor do segundo parâmetro conforme solicitado no enunciado do desafio  
Como tratamento de exceção foi implementado a lógica onde o Usuário recebe a mensagem: "ATENÇÃO: O valor do segundo parâmetro deve ser maior que o valor do primeiro" e o programa reinicia até que o usuário insira o valor correto.  

>
 A exceção `InputMismatchException` é lançada quando o usuário insere uma letra, caractere especial ou um número fracionado, esta implementação não estava prevista no enunciado, porém eu implementei como sugestão de melhoria.  
Caso o usuário insira um valor inválido, ele receberá a seguinte mensagem: "ATENÇÃO: O valor inserido deve ser um número Inteiro" e o programa reinicia até que o usuário insira o valor correto.  

>
Caso algum dos valores inseridos pelos usuários for negativo, o sistema converterá o valor negativo para positivo, evitando erro de resiliência na implementação.
Esta implementação não estava prevista no enunciado do desafio, porém eu implementei como sugestão de melhoria.

# Linguagem de programação Utilizada

- Java

# IDE Utilizada

- Visual Studio Code
