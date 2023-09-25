package bootcamp.santander.classesModelos;

import bootcamp.santander.interfaces.navegador;

public class Browser extends Aplicativo implements navegador{

   
    public Browser(String nome, String logo) {
        super(nome, logo);
    }
    
    @Override
    public void exibirPagina() {
        System.out.println("Estou exibindo uma página WEB");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Estou exibindo uma nova Aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("estou atualizando a pagina...");
    }
    
}
