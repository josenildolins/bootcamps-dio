package bootcamp.santander.classesModelos;

import java.util.List;

public class Aparelho {
    
    private String nome;

    private String IMEI;

    private List<Aplicativo> aplicativos;

    
    public Aparelho(String nome, String iMEI, List<Aplicativo> aplicativos) {
        this.nome = nome;
        this.IMEI = iMEI;
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
        

        for (Aplicativo aplicativo : aplicativos) {
            System.out.println(aplicativo);
        }

    }

    public void executarAplicativo(String nome){
        System.out.println("executando aplicativo " + nome.toUpperCase());
    }

}