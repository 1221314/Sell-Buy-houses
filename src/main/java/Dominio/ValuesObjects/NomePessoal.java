package Dominio.ValuesObjects;


import jakarta.persistence.Embeddable;

@Embeddable
public class NomePessoal {


    private String nomePessoal;


    public NomePessoal(String nomePessoal){
        this.nomePessoal=nomePessoal;
    }

    protected NomePessoal() {

    }

    public void setNomePessoal(String nomePessoal) {
        this.nomePessoal = nomePessoal;
    }

    public String whatIsTheName() {
        return nomePessoal;
    }
}
