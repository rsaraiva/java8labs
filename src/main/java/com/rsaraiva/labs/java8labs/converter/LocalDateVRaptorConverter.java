package com.rsaraiva.labs.java8labs.converter;

import br.com.caelum.vraptor.Convert;
import br.com.caelum.vraptor.converter.Converter;
import java.time.LocalDate;

@Convert(LocalDate.class)
public class LocalDateVRaptorConverter implements Converter<LocalDate> {

    @Override
    public LocalDate convert(String string, Class<? extends LocalDate> type) {
        return LocalDate.parse(string);
    }
}
