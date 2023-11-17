package hibernate.CONTROLLER;

import hibernate.MODEL.Entrada;
import hibernate.MODEL.Saida;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.hibernate.Session;
import org.hibernate.query.Query;


public class DAO {
    private static DAO instance;
    protected EntityManager entityManager;
    
    public static DAO getInstace(){
        if (instance == null){
            instance = new DAO();
        }        
        return instance;
    }
    
    private DAO(){
        entityManager = getEntityManager();
    }
    
    private EntityManager getEntityManager(){
        EntityManagerFactory factory = 
                Persistence.createEntityManagerFactory("jpa_exemplo");
        if (entityManager==null){
            entityManager = factory.createEntityManager();
        }
        System.out.println("entity:"+entityManager);
        return entityManager;
    }
    
    public void inserirEntrada(Entrada entrada){
        try{
           entityManager.getTransaction().begin();
           entityManager.persist(entrada);
           entityManager.getTransaction().commit();
           
        } catch (Exception ex){
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
    
    
    
    public void inserirSaida(Saida saida){
        try{
           entityManager.getTransaction().begin();
           entityManager.persist(saida);
           entityManager.getTransaction().commit();
           
        } catch (Exception ex){
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

        public List<Entrada> listarEntradas() {
        List<Entrada> entradas = null;
        try {
            entityManager.getTransaction().begin();
            Session session = (Session) entityManager.getDelegate();
            Query<Entrada> query = session.createQuery("FROM Entrada", Entrada.class);
            entradas = query.getResultList();
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return entradas;
    }

    public List<Saida> listarSaidas() {
        List<Saida> saidas = null;
        try {
            entityManager.getTransaction().begin();
            Session session = (Session) entityManager.getDelegate();
            Query<Saida> query = session.createQuery("FROM Saida", Saida.class);
            saidas = query.getResultList();
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return saidas;
    }
    
    public void limparTabela(String nomeTabela) {
        try {
            entityManager.getTransaction().begin();
            Query query = (Query) entityManager.createQuery("DELETE FROM " + nomeTabela);
            query.executeUpdate();
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
    
    
    
    
}
