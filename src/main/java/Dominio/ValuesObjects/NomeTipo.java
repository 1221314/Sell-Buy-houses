package Dominio.ValuesObjects;


import jakarta.persistence.Embeddable;

@Embeddable
public class NomeTipo {

    public String nomeDoTipoDaCasaa;


    public NomeTipo(String nomeDoTipoDaCasaa){
        setNome(nomeDoTipoDaCasaa);
    }

    protected NomeTipo() {}

    private void setNome(String nomeDoTipoDaCasaa) {
        if(nomeDoTipoDaCasaa!=null){
            this.nomeDoTipoDaCasaa=nomeDoTipoDaCasaa;
                    }
    }


}
