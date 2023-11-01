
# [DIO](https://www.dio.me/) - Bootcamp WEX - Desenvolvimento .NET e QA

## Autor

- [Josenildo Lins](https://github.com/josenildolins)

## Blindando Seu C�digo com TDD e Testes Unit�rios Usando .NET Core

Este projeto tem por objetivo a pr�tica dos assuntos que fora aprendido durante as atividades do curso "Trabalhando com Desenvolvimento Orientado a Testes":

- Como criar testes unitarios utilizando XUnit
- Valida��es de Testes Unit�rios com c#

## Descri��o do Desafio
Criar um projeto do zero ou reproduzir o projeto abordado nas aulas do bootcamp

## O que foi feito

 - Foi criado uma Api que simula as opera��es de uma Calculadora

 - Neste projeto eu separei a implementa��o do c�digo em 3 Camadas (Aplica��o, Dom�nio e Dados)
 
 - Criei um projeto de teste que aponta para a camada de dom�nio

1. Na Camada de aplica��o est�o as chamadas dos m�todos da camada de dom�nio
2. Na Camada de Dom�nio esta localizada as regras de neg�cio da aplica��o e a implementa��o dos m�todos
3. Na camada de Dados est� localizada os dados persistidos em banco

# Linguagem de programa��o Utilizada

- C#
- AspnetCore(6.2.3
- EntityFrameWorkCore.Sqlite(7.0.13)
- Microsoft.NET.Test.Sdk(17.5.0)
- xunit(2.4.2)
- xunit.runner.visualstudio(2.4.5)

# IDE Utilizada

- Visual Studio
