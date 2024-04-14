package Dominio.AgregateCasa;

import Dominio.ValuesObjects.Cor;
import Dominio.ValuesObjects.DataDias;
import Dominio.ValuesObjects.EstadoBollean;
import jakarta.persistence.Embeddable;

@Embeddable

public class Pintura {

    public Cor cor;
    public EstadoBollean estadoBollean;
    public DataDias dataDias;

    protected Pintura(){}

    public Pintura(Cor cor, EstadoBollean estadoBollean, DataDias dataDias){
        this.cor=cor;
        this.estadoBollean = estadoBollean;
        this.dataDias=dataDias;
    }

    public Cor whatIsTheColor() {
        return cor;
    }

    public DataDias whenWasLastPainting() {
        return dataDias;
    }

    public EstadoBollean isComplete() {
        return estadoBollean;
    }
}
