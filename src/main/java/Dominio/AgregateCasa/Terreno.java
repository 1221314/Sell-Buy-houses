package Dominio.AgregateCasa;


import Dominio.ValuesObjects.Estado;
import Dominio.ValuesObjects.EstadoTerreno;
import Dominio.ValuesObjects.TamanhoEmM2;
import jakarta.persistence.*;

@Embeddable

public class Terreno {



    public EstadoTerreno estadoO;
    public TamanhoEmM2 tamanho;

    protected Terreno(){}

    public Terreno (EstadoTerreno estadoo,TamanhoEmM2 tamanho){
        this.estadoO=estadoo;
        this.tamanho=tamanho;
    }

    public EstadoTerreno whatIsTheState() {
        return estadoO;
    }

    public TamanhoEmM2 whatIsTheSize() {
        return tamanho;
    }
}
