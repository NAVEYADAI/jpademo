import jakarta.persistence.*;
import Entity.*;

public class Main {
    public static void main(String[] args) {
        jpa();
    }
    public static void jpa(){
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("default");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction transaction=entityManager.getTransaction();
        try {
            transaction.begin();
            tmp.printSumOfRow(entityManager,"name");
            TypedQuery<NameEntity> emp = entityManager.createNamedQuery
                    ("NameEntity.byDept", NameEntity.class);
            //emp.setParameter(1 , "DEMO");
            for (NameEntity e: emp.getResultList() ) {
                System.out.println(e);
            }

            entityManager.persist(tmp.insertNameTable("demo","1.2"));

            transaction.commit();
        }
        finally {
            if (transaction.isActive()){
                transaction.rollback();
            }
            entityManager.close();
            entityManagerFactory.close();
        }
    }

}
