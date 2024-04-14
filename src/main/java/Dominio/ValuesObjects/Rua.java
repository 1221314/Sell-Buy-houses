package Dominio.ValuesObjects;


import jakarta.persistence.Embeddable;

@Embeddable
public class Rua {

    public String nomeRua;
    protected Rua(){}


    public Rua(String nomeRua){
        this.nomeRua=nomeRua;
    }

    @Override
    public String toString() {
        return nomeRua;
    }
}
