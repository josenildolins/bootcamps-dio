
# [DIO](https://www.dio.me/) - Bootcamp WEX - Desenvolvimento .NET e QA

## Autor

- [Josenildo Lins](https://github.com/josenildolins)

## Blindando Seu Código com TDD e Testes Unitários Usando .NET Core

Este projeto tem por objetivo a prática dos assuntos que fora aprendido durante as atividades do curso "Trabalhando com Desenvolvimento Orientado a Testes":

- Como criar testes unitarios utilizando XUnit
- Validações de Testes Unitários com c#

## Descrição do Desafio
Criar um projeto do zero ou reproduzir o projeto abordado nas aulas do bootcamp

## O que foi feito

 - Foi criado uma Api que simula as operações de uma Calculadora

 - Neste projeto eu separei a implementação do código em 3 Camadas (Aplicação, Domínio e Dados)
 
 - Criei um projeto de teste que aponta para a camada de domínio

1. Na Camada de aplicação estão as chamadas dos métodos da camada de domínio
2. Na Camada de Domínio esta localizada as regras de negócio da aplicação e a implementação dos métodos
3. Na camada de Dados está localizada os dados persistidos em banco

# Linguagem de programação Utilizada

- C#
- AspnetCore(6.2.3
- EntityFrameWorkCore.Sqlite(7.0.13)
- Microsoft.NET.Test.Sdk(17.5.0)
- xunit(2.4.2)
- xunit.runner.visualstudio(2.4.5)

# IDE Utilizada

- Visual Studio
