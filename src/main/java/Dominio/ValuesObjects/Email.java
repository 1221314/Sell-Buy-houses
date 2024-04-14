package Dominio.ValuesObjects;


import jakarta.persistence.Embeddable;

@Embeddable
public class Email {

    private String emailAdress;

    protected Email(){}

    public Email(String email){
        changeEmailAdress(email);
    }

    public void changeEmailAdress(String emailAdress) {
        if(emailAdress!=null && emailAdress.contains("@")) this.emailAdress = emailAdress;
    }

}
