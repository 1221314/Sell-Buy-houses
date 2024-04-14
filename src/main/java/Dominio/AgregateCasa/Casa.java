package Dominio.AgregateCasa;

import Dominio.ValuesObjects.*;
import jakarta.persistence.*;

@Entity
public class Casa {

    /**
     * This Entity will not have a Constructor with all de elements following the Builder Pattern
     */

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public ValorEmEuros valorEmEuros;
    public Pintura pintura;
    public Terreno terreno;
    public Estado estado;
    public Adress adress;
    public Boolean painted;
    public Telhado telhado;
    public DescricaoQuartos descricaoQuartos;
    public NomeTipo nomeTipo;

    protected Casa(){}

    public long WhatIsTheId() {
        return id;
    }

    public Casa(Adress adress, Estado estado, DescricaoQuartos descricaoQuartos, NomeTipo nomeTipo){
    this.adress=adress;
    this.estado=estado;
    this.descricaoQuartos=descricaoQuartos;
    this.nomeTipo=nomeTipo;
    }

    public void setNomeTipo(NomeTipo nomeTipo) {
        this.nomeTipo = nomeTipo;
    }


    public void setDescricaoQuartos(DescricaoQuartos descricaoQuartos) {
        this.descricaoQuartos = descricaoQuartos;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public void setPainted(Boolean painted) {
        this.painted = painted;
    }

    public void setPintura(Pintura pintura) {
        this.pintura = pintura;
    }

    public void setTelhado(Telhado telhado) {
        this.telhado = telhado;
    }

    public void setTerreno(Terreno terreno) {
        this.terreno = terreno;
    }

    public void setValorEmEuros(ValorEmEuros valorEmEuros) {
        this.valorEmEuros = valorEmEuros;
    }

    @Override
    public String toString() {
        return "Esta casa é a id: situada em "+adress+" e esta no estado:"+estado+"\n";
    }
}
