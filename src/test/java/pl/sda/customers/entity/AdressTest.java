package pl.sda.customers.entity;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AdressTest {

    @Autowired
    private EntityManager em;

    @Test
    @Transactional
    void shouldSaveAdress() {
//        given
        final var adress = new Adress("Bracławsska", "Warszawa", "04-044", "PL");
//        when - save to database
//        klucz: ID, wartość:Encja : zawartość casha
em.persist(adress); //  insert into adresses.......
        em.flush(); // patrzy co jest w cashu i wysyla do
        // bazy, uzywamy tylko w testach
        em.clear(); // czyszczenie cacha
//        then
        final var readAdress = em.find(Adress.class, adress.getId());
        assertEquals(adress, readAdress);

    }
}