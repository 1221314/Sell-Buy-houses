package Dominio.ValuesObjects;

import jakarta.persistence.Embeddable;

@Embeddable
public class EstadoBollean {

    private Boolean estadoPintura;

    protected EstadoBollean(){

    }

    public void setEstadoPintura(Boolean estadoPintura) {
        this.estadoPintura = estadoPintura;
    }

    public EstadoBollean(Boolean estadoPintura){
        clarifyEstado(estadoPintura);
    }

    public Boolean whatIsTheState() {
        return estadoPintura;
    }

    private void clarifyEstado(Boolean estadoPintura) {
        if(estadoPintura!=null){
            this.estadoPintura=estadoPintura;
        }
    }
}
