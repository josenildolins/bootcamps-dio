package bootcamp.santander.classesModelo;

public class Usuario {

    private String nome;

    private int parametro1;

    private int parametro2;

    
    public Usuario(String nome) {
        this.nome = nome;
    }

    
    public String getNome() {
        return nome;
    }

    public int getParametro1() {
        return parametro1;
    }

    public int getParametro2() {
        return parametro2;
    }

    public void setParametro1(int parametro1) {
        this.parametro1 = parametro1;
    }

    public void setParametro2(int parametro2) {
        this.parametro2 = parametro2;
    }

}