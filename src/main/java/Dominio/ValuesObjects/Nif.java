package Dominio.ValuesObjects;


import jakarta.persistence.Embeddable;

import java.io.Serializable;


@Embeddable
public class Nif implements Serializable {

    private String nif;
    protected Nif(){}

    public Nif(String nif){
        if(nif!=null && nif.length()==9){
            this.nif=nif;
        }
    }


}
