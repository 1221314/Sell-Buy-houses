package Dominio.ValuesObjects;

import jakarta.persistence.Embeddable;

@Embeddable
public class ValorEmEuros {
    public Integer unidade;
    public Integer centimos;

    protected ValorEmEuros() {

    }

    public ValorEmEuros(Integer unidade,Integer centimos){
        clarifyUnidade(unidade);
        clarifyCentimos(centimos);
    }

    private void clarifyCentimos(Integer centimos) {
        try {
            if (centimos != null && centimos >= 0) {
                this.centimos = centimos;
            }
        }catch (Exception e){
            System.out.println("O valor não é válido!!!");
        }
    }

    private void clarifyUnidade(Integer unidade) {
        try {
            if (unidade != null && unidade >= 0) {
                this.unidade = unidade;
            }
        }catch (Exception e){
            System.out.println("O valor não é válido!!!");
        }
    }

}
