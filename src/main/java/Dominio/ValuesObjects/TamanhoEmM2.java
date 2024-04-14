package Dominio.ValuesObjects;

import jakarta.persistence.Embeddable;

@Embeddable
public class TamanhoEmM2 {

    public Integer metros;
    protected TamanhoEmM2(){}

    public TamanhoEmM2(Integer metros){
        if(metros>=0) this.metros=metros;
    }
}
