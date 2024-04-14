package Dominio.AgregateAnuncio;

import Dominio.ValuesObjects.Email;
import Dominio.ValuesObjects.EstadoBollean;
import Dominio.ValuesObjects.ValorEmEuros;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Anuncio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public EstadoBollean estadoDoAnuncio;
    public ValorEmEuros valorMinimoDeOfertas;

    public Email EmailDonoDaResidencia;
    public Long IdCasaAnunciada;


    public Anuncio(Long idCasaAnunciada, ValorEmEuros valorEmEuros,Email emailDonoDaResidencia){
        this.IdCasaAnunciada=idCasaAnunciada;
        this.valorMinimoDeOfertas=valorEmEuros;
        this.EmailDonoDaResidencia=emailDonoDaResidencia;
        estadoDoAnuncio=new EstadoBollean(true); //está disponivel no momento de criação do anuncio
    }

   public Boolean isHouseAvailable(){
        return estadoDoAnuncio.whatIsTheState();
    }

    public void soldHouse(){
        estadoDoAnuncio.setEstadoPintura(false);
    }

    public Email whoIsTheOwner() {
        return EmailDonoDaResidencia;
    }

    protected Anuncio() {}


}
