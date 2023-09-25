package bootcamp.santander.classesModelos;

import bootcamp.santander.interfaces.ExecutorDeChamada;

public class Telefone extends Aplicativo  implements ExecutorDeChamada{

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("atendendo a chamada");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Chamando correio de voz");
    }
    
}