/**
 * @author rsaraiva
 */
package com.rsaraiva.labs.java8labs.controller;

import com.rsaraiva.labs.java8labs.service.EventService;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;
import java.io.Serializable;
import java.time.LocalDate;
import javax.inject.Inject;

@Controller
public class EventController implements Serializable {
    
    @Inject private EventService service;
    @Inject private Result result;

    @Get("/events/add/{description}/{date}")
    public void add(String description, LocalDate date) {
        service.persist(description, date);
        result.nothing();
    }
}
