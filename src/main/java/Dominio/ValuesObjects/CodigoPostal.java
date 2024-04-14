package Dominio.ValuesObjects;


import jakarta.persistence.Embeddable;

@Embeddable
public class CodigoPostal {


    private String nomeCodigo;
    protected CodigoPostal(){}


    public CodigoPostal(String nomeCodigo){
        this.nomeCodigo=nomeCodigo;
    }

    @Override
    public String toString() {
        return nomeCodigo;
    }
}
