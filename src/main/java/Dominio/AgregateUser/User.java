package Dominio.AgregateUser;


import Dominio.ValuesObjects.Email;
import Dominio.ValuesObjects.Nif;
import Dominio.ValuesObjects.NomePessoal;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

    protected User(){}
    @Id
    private Nif nif;
    private Email email;
    private NomePessoal nome;



    public User(NomePessoal nomePessoal, Nif nif, Email email){
        this.email=email;
        this.nome=nomePessoal;
        this.nif=nif;
    }

    public Email getEmail() {
        return email;
    }

    public Nif getNif() {
        return nif;
    }

    public NomePessoal getNome() {
        return nome;
    }


}
