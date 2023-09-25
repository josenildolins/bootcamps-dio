package bootcamp.santander.classesModelos;
public class Aplicativo {
    
    private String nome;

    private String logo;

    public Aplicativo(String nome, String logo) {
        this.nome = nome;
        this.logo = logo;
    }

    public Aplicativo() {
    }

    public void exibirDetalhes(){
        System.out.println("Exibindo Detalhes");
    }
    
    public String getNome() {
        return nome;
    }

    public String getLogo() {
        return logo;
    }
}
