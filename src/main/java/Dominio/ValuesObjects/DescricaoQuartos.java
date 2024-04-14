package Dominio.ValuesObjects;


import jakarta.persistence.Embeddable;

@Embeddable
public class DescricaoQuartos {

    public String nomeDoTipoDaCasa;


    public DescricaoQuartos(String nomeDoTipoDaCasa){
        setNome(nomeDoTipoDaCasa);
    }

    protected DescricaoQuartos() {}

    private void setNome(String nomeDoTipoDaCasa) {
        if(nomeDoTipoDaCasa!=null){
            if(nomeDoTipoDaCasa.equals("T0") || nomeDoTipoDaCasa.equals("T1") || nomeDoTipoDaCasa.equals("T2") || nomeDoTipoDaCasa.equals("T3") || nomeDoTipoDaCasa.equals("T4")){
                this.nomeDoTipoDaCasa=nomeDoTipoDaCasa;
            }
        }
    }





}
