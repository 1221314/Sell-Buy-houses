package Repositories;

import Dominio.AgregateAnuncio.Anuncio;
import Dominio.AgregateCasa.Casa;
import Dominio.ValuesObjects.Email;
import Dominio.ValuesObjects.Nif;
import Dominio.ValuesObjects.NomePessoal;
import jakarta.persistence.*;

import java.util.List;

public class AnuncioRepositorie implements ValuesRepositorie<Anuncio> {


    protected EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.
                createEntityManagerFactory("DEMO_ORMPU");
        EntityManager manager = factory.createEntityManager();
        return manager;
    }


    @Override
    public Anuncio add(Anuncio entity) {
        if (entity == null) {
            throw new IllegalArgumentException();
        }
        EntityManager em = getEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(entity);
        tx.commit();
        em.close();

        return entity;
    }

    @Override
    public Anuncio findById(Long id) {
        return getEntityManager().find(Anuncio.class,id);
    }

    @Override
    public List<Anuncio> listarTodos() {
        Query query = getEntityManager().createQuery("select ga from Anuncio ga");
        List<Anuncio> results = query.getResultList();

        getEntityManager().close();
        return results;
    }

    public List<Anuncio> obterAnunciosDeUmAnunciante(Email email) {
        Query query = getEntityManager().createQuery("select ga from Anuncio ga where ga.EmailDonoDaResidencia.emailAdress = "+email);
        List<Anuncio> results = query.getResultList();

        getEntityManager().close();
        return results;
    }
}
