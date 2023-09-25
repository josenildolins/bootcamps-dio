package bootcamp.santander.classesModelos;

import bootcamp.santander.interfaces.reprodutorMusical;

public class Ipod extends Aplicativo implements reprodutorMusical {

    
    public Ipod(String nome, String logo) {
        super(nome, logo);
    }

    @Override
    public void play() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica");
    }

    @Override
    public String selecionarMusica(String musica) {
        return "A Música " + musica + " Foi selecionada";
    }
    
}