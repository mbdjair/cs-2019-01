package com.github.mbdjair.diferencaDatas.domain;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Alunoinf_2 on 04/07/2019.
 */
class DateUtilsTest {
    @Test
    void obterDiferencaDatasDias() {
        final Date primeiraData = new Date();
        final Date segundaData = new Date();
        long diferenca = DateUtils.obterDiferencaDatasDias(primeiraData, segundaData);
        assertEquals(0L, diferenca);
    }

    @Test
    void obterDiferencaDatasDiasUmDia() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateUtils.DEFAULT_DATE_FORMAT);
        final Date primeiraData = simpleDateFormat.parse("04/07/2019");
        final Date segundaData = simpleDateFormat.parse("05/07/2019");
        long diferenca = DateUtils.obterDiferencaDatasDias(primeiraData, segundaData);
        assertEquals(1L, diferenca);
    }

}