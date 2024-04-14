package Dominio.ValuesObjects;


import jakarta.persistence.Embeddable;

@Embeddable
public class Estado {

    public String estadoPresentee;

    protected Estado(){

    }

    public Estado(String estadoPresentee){
        clarifyEstado(estadoPresentee);
    }

    private void clarifyEstado(String estadoPresentee) {
        if(estadoPresentee!=null){
            this.estadoPresentee=estadoPresentee;
        }
    }

    @Override
    public String toString() {
        return  estadoPresentee;

    }
}
