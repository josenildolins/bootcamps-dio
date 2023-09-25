package bootcamp.santander.classesModelos;

import bootcamp.santander.interfaces.reprodutorMusical;

public class Ipod extends Aplicativo implements reprodutorMusical {

    @Override
    public void play() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica");
    }

    @Override
    public String selecionarMusica() {
        return "selecionando musica";
    }
    
}