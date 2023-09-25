package main;

import java.util.ArrayList;
import java.util.List;

import bootcamp.santander.classesModelos.Aparelho;
import bootcamp.santander.classesModelos.Aplicativo;
import bootcamp.santander.classesModelos.Browser;
import bootcamp.santander.classesModelos.Ipod;
import bootcamp.santander.classesModelos.Telefone;

public class App {
    public static void main(String[] args) throws Exception {

        Browser browser = new Browser("Chrome", "Eu sou uma imagem");
        Ipod ipod = new Ipod("Itunes", "Eu sou uma imagem");
        Telefone telefone = new Telefone("Discador", "Eu sou uma imagem");

        List<Aplicativo> aplicativos = new ArrayList<>();
        aplicativos.add(telefone);
        aplicativos.add(ipod);
        aplicativos.add(browser);
        
        Aparelho aparelho = new Aparelho("Iphone8", "2123523231512321523512351", aplicativos);

        System.out.println("===================================================");
        System.out.println("exibindo funcionalidades do aplicativo Browser");
        System.out.println("===================================================");

        browser.adicionarNovaAba();
        browser.atualizarPagina();
        browser.exibirPagina();
        System.out.println(browser.getNome() + " | " + browser.getLogo());

        System.out.println();
        System.out.println("===================================================");
        System.out.println("exibindo funcionalidades do aplicativo Ipod");
        System.out.println("===================================================");

        ipod.play();
        ipod.pausar();
        System.out.println(ipod.selecionarMusica("Quero subir"));
        System.out.println(ipod.getNome() + " | " + ipod.getLogo());

        System.out.println();
        System.out.println("===================================================");
        System.out.println("exibindo funcionalidades do aplicativo Telephone");
        System.out.println("===================================================");

        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioDeVoz();
        telefone.exibirDetalhes();

        System.out.println();
        System.out.println("===================================================");
        System.out.println("exibindo funcionalidades do Aparelho");
        System.out.println("===================================================");

        aparelho.executarAplicativo(ipod.getNome());
        aparelho.executarAplicativo(browser.getNome());
        aparelho.executarAplicativo(telefone.getNome());
        aparelho.exibiraplicativos(aplicativos);

    }
}