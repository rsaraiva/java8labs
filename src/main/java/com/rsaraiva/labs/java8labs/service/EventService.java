/**
 * @author rsaraiva
 */
package com.rsaraiva.labs.java8labs.service;

import com.rsaraiva.labs.java8labs.model.Event;
import java.time.LocalDate;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class EventService {
    
    @PersistenceContext
    private EntityManager em;

    public void persist(String description, LocalDate date) {
        em.persist(new Event(description, date));
    }
}
