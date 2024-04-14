package Dominio.ValuesObjects;

import jakarta.persistence.Embeddable;

@Embeddable
public class Telhado {

    public String materiais;

    public Telhado(String materiais){
        this.materiais=materiais;
    }

    protected Telhado() {

    }
}
