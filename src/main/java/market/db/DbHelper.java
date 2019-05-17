package market.db;

import market.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class DbHelper {

    private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("market");
    private EntityManager em;

    private static DbHelper instance;


    private static DbHelper getInstance(){
        return instance == null ? new DbHelper() : instance;
    }


    public List<User> getUsers(){
        em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();

        List<User> users = em.createQuery("select u from User u ").getResultList();

        em.getTransaction().commit();

        em.close();

        return users;
    }





}


