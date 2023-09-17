package main;

import java.util.Scanner;

import bootcamp.santander.classesModelo.Contador;
import bootcamp.santander.excessoesPersonalizadas.ParametrosInvalidosException;

public class App {

    public static void main(String[] args) throws ParametrosInvalidosException {
        
        var input = new Scanner(System.in);
        System.out.println("Digite o primeiro Parâmetro");
        int parametro1 = input.nextInt();

        System.out.println("Digite o segundo Parâmetro");
        int parametro2 = input.nextInt();

        input.close();
        
        
        Contador contador = new Contador();

        contador.contar(parametro1, parametro2);

    }
    
}
