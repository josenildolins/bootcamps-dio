package bootcamp.santander.classesModelo;

import bootcamp.santander.excessoesPersonalizadas.ParametrosInvalidosException;

public class Contador {

    public void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {

        try {

           int contagem = 0; 

            if (parametro2 < parametro1) {
                throw new ParametrosInvalidosException();
            }

            if(parametro1 < 0){
                parametro1 *= -1;

            }

            contagem = parametro2 - parametro1;

            System.out.println();
            System.out.println("Contando de " + 1 + " até " + contagem);

            for (int i = 1; i < contagem + 1; i++) {
                System.out.println(i);
            }

        } catch (ParametrosInvalidosException e) {
            System.out.println(e.Message());

        }
    }
}