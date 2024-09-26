package JPA;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaConfig {
    private static final String PERSISTENCE_UNIT_NAME = "myPersistenceUnit";

    public static EntityManagerFactory getEntityManagerFactory() {
        return Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    }
}
