package Controller;


import Dominio.AgregateCasa.Adress;
import Dominio.AgregateCasa.Casa;
import Dominio.ValuesObjects.DescricaoQuartos;
import Dominio.ValuesObjects.Estado;
import Dominio.ValuesObjects.NomeTipo;
import Dominio.ValuesObjects.ValorEmEuros;
import Repositories.CasaRepositorie;

import java.util.List;

public class CasaController {

    CasaRepositorie casaRepositorie= new CasaRepositorie();

    /**
     * tarefas asseguradas nesta classe:
     * Registar uma nova casa no sistema
     * Listar as casas do sistema
     * Listar uma casa pelo id dela
     * Listar uma casa pela sua morada
     */


    public Casa registarCasa(Adress adress, Estado estado, DescricaoQuartos descricaoQuartos, NomeTipo nomeTipo) {
        Casa grupo1 = new Casa(adress,estado, descricaoQuartos,  nomeTipo);
        CasaRepositorie repo =  new CasaRepositorie();
        return repo.add(grupo1);
    }


    public List<Casa> listarCasas() {
        List<Casa> casasList = casaRepositorie.listarTodos();

        for(Casa casa: casasList){
            System.out.println(casa);
        }
        return casasList;
    }


    public Casa procurarCasaById(long id) {
      Casa casa= casaRepositorie.findById(id);
        System.out.println(casa);
        return casa;
    }


    public List<Casa> procurarCasaByAdress(Adress adress) {
        return casaRepositorie.findByAdress(adress);
    }


}
