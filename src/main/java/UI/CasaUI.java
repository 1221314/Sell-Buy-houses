package UI;

import Controller.CasaController;
import Dominio.AgregateCasa.Adress;
import Dominio.AgregateCasa.Casa;
import Dominio.ValuesObjects.*;
import util.Console;

public class CasaUI {

    CasaController casaController = new CasaController();

    public void registarCasa() {
        System.out.println("*** Registo Casa ***\n");
        String nome = Console.readLine("Morada:");
        String codigo = Console.readLine("Codigo postal:");
        String pais = Console.readLine("país:");
        String classe = Console.readLine("Estado:");
        String quartos = Console.readLine("Quantos quartos?(e.g T1/T2,etc..)");
        String tipo = Console.readLine("Que tipo de casa é?");

        Casa grupoAutomovel = casaController.
                registarCasa(new Adress(new Rua(nome),new CodigoPostal(codigo),new Pais(pais)),new Estado(classe),new DescricaoQuartos(quartos),new NomeTipo(tipo));
        System.out.println("Casa" + grupoAutomovel);
    }

    public void listarCasas(){
        casaController.listarCasas();
    }

    public void listarUmaCasaPeloID(){
        int idP=Console.readInteger("Qual é o ID da casa que procura?");

        casaController.procurarCasaById(idP);
    }

    public void listarCasasNumaMorada(){
        String nomedarua= Console.readLine("Onde é a rua?");
        String pais= Console.readLine("Em que pais é?");
        String codigopostal= Console.readLine("Codigo postal?");

        casaController.procurarCasaByAdress(new Adress(new Rua(nomedarua),new CodigoPostal(codigopostal),new Pais(pais)));
    }


}
