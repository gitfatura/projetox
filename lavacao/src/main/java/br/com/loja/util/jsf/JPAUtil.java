package br.com.loja.util.jsf;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
    private static final EntityManagerFactory emf;
    private static EntityManager entityManager = null;
    
    static {
        emf = Persistence.createEntityManagerFactory("SODECODIGO_PU");
    }
    
    public static EntityManager getEntityManager(){
        if(entityManager==null){
            entityManager = emf.createEntityManager();
        }
        return entityManager;
    }
}
