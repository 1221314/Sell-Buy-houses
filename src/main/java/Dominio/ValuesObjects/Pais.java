package Dominio.ValuesObjects;

import jakarta.persistence.Embeddable;

@Embeddable
public class Pais {


    public String nomeDoPais;

    @Override
    public String toString() {
        return nomeDoPais ;
    }

    public Pais(String nomeDoPais){
        if(nomeDoPais!= null){
            this.nomeDoPais=nomeDoPais;
        }

    }


    protected Pais() {

    }
}
