package Repositories;

import Dominio.AgregateCasa.Adress;
import Dominio.AgregateCasa.Casa;
import jakarta.persistence.*;

import java.util.List;

public class CasaRepositorie implements ValuesRepositorie<Casa> {


    protected EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.
                createEntityManagerFactory("DEMO_ORMPU");
        EntityManager manager = factory.createEntityManager();
        return manager;
    }

    @Override
    public Casa add(Casa entity) {
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
    public Casa findById(Long id) {
        return getEntityManager().find(Casa.class,id);
    }

    public List<Casa> findByAdress(Adress adress) {
       Query queryCasas = getEntityManager().createQuery("select ga from Casa ga where ga.adress = "+adress.rua.nomeRua);
       List<Casa> list = queryCasas.getResultList();
       getEntityManager().close();
       return list;
    }


    @Override
    public List<Casa> listarTodos() {

        Query query = getEntityManager().createQuery("select ga from Casa ga");
        List<Casa> results = query.getResultList();

        getEntityManager().close();
        return results;
    }


}
