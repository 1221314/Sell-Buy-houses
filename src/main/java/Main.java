import UI.CasaUI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CasaUI grupoAutomovelUI= new CasaUI();

        Boolean cont=true;
        Scanner scanner= new Scanner(System.in);
        while(cont) {
            System.out.println("\n\nO que deseja?");
            System.out.println("1-registar Casa");
            System.out.println("2-listar todas as casas no sistema");
            System.out.println("3-listar uma casa pelo seu id");
            System.out.println("4-listar uma casa pela sua moradia");
            System.out.println("5-PARAR\n\n");
            String ver = scanner.next();
            if(ver.equals("1"))grupoAutomovelUI.registarCasa();
            if(ver.equals("2"))grupoAutomovelUI.listarCasas();
            if(ver.equals("3"))grupoAutomovelUI.listarUmaCasaPeloID();
            if(ver.equals("4"))grupoAutomovelUI.listarCasasNumaMorada();
            if(ver.equals("5")) cont=false;
        }


    }
}