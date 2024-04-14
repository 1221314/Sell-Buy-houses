package Dominio.ValuesObjects;

import jakarta.persistence.Embeddable;

@Embeddable
public class Cor {

    public String cor;

    protected Cor(){

    }

    public Cor(String cor){
        clarifyCor(cor);
    }

    private void clarifyCor(String cor) {
        if(cor!=null){
            this.cor=cor;
        }
    }
}
