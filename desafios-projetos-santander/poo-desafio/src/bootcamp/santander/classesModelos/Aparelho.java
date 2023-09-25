package bootcamp.santander.classesModelos;

import java.util.List;

public class Aparelho {
    
    private String nome;

    private String IMEI;

    private List<Aplicativo> aplicativos;

    
    public Aparelho(String nome, String iMEI, List<Aplicativo> aplicativos) {
        this.nome = nome;
        IMEI = iMEI;
        this.aplicativos = aplicativos;
    }

    public String getNome() {
        return nome;
    }

    public String getIMEI() {
        return IMEI;
    }

    public List<Aplicativo> getAplicativos() {
        return aplicativos;
    }

    public void exibiraplicativos(List<Aplicativo> aplicativos){
        System.out.println("Exibindo Aplicativos");
    }

}