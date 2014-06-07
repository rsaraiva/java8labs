/**
 * @author rsaraiva
 */
package com.rsaraiva.labs.java8labs.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;
import com.rsaraiva.labs.java8labs.model.Event;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Calendar;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Controller
public class EventController implements Serializable {
    
    @Inject private EventService service;
    @Inject private Result result;

    @Get("/events/add/{description}/{day}/{month}/{year}")
    public void event(String description, int day, int month, int year) {
        service.persist(description, LocalDate.of(year, month, day));
        result.nothing();
    }
}
