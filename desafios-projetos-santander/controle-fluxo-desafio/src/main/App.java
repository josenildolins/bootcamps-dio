package main;

import java.util.InputMismatchException;
import java.util.Scanner;
import bootcamp.santander.classesModelo.Contador;
import bootcamp.santander.classesModelo.Usuario;
import bootcamp.santander.excessoesPersonalizadas.ParametrosInvalidosException;

public class App {

    public static void main(String[] args) throws ParametrosInvalidosException {
        
        iniciarSistema();
   
    }

    public static void iniciarSistema() throws ParametrosInvalidosException{
        
        Usuario usuario = new Usuario("josenildo");
        Contador contador = new Contador();
        Scanner input = new Scanner(System.in);
        boolean parametroIsValido = false;

        do {

            try {

                input = new Scanner(System.in);
                System.out.println("Digite o primeiro Parâmetro");
                usuario.setParametro1(input.nextInt());

                System.out.println("Digite o segundo Parâmetro");
                usuario.setParametro2(input.nextInt());

                contador.contar(usuario.getParametro1(), usuario.getParametro2());
                
                if( contador.getDigitoVerificador() == 1){
                    parametroIsValido = true;
                }

            } catch (InputMismatchException e) {
                System.out.println("ATENÇÃO: O valor inserido deve ser um número Inteiro");
            }

        } while (parametroIsValido == false);

        input.close();

    }

}