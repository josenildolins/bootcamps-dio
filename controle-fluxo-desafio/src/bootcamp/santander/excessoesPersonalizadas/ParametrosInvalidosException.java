package bootcamp.santander.excessoesPersonalizadas;

public class ParametrosInvalidosException extends Exception {
    
    public ParametrosInvalidosException() {
        super();
    }
    
    public String Message(){
       
        return "ATENÇÃO: O valor do segundo parâmetro deve ser maior que o valor do primeiro";
    }
}