package Dominio.ValuesObjects;


import jakarta.persistence.Embeddable;

@Embeddable
public class EstadoTerreno {

    public String estadoPresente;

    protected EstadoTerreno(){

    }

    public EstadoTerreno(String estadoPresente){
        clarifyEstado(estadoPresente);
    }

    private void clarifyEstado(String estadoPresente) {
        if(estadoPresente!=null){
            this.estadoPresente=estadoPresente;
        }
    }

    @Override
    public String toString() {
        return  estadoPresente;

    }




}
