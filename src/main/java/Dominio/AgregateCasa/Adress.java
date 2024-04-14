package Dominio.AgregateCasa;


import Dominio.ValuesObjects.CodigoPostal;
import Dominio.ValuesObjects.Pais;
import Dominio.ValuesObjects.Rua;
import jakarta.persistence.Embeddable;

@Embeddable
public class Adress {


    public Rua rua;
    public CodigoPostal codigoPostal;
    public Pais pais;


    public Adress(Rua rua, CodigoPostal codigoPostal, Pais pais){
        this.rua=rua;
        this.codigoPostal=codigoPostal;
        this.pais=pais;
    }

    @Override
    public String toString() {
        return rua.nomeRua;

    }

    protected Adress() {

    }
}
