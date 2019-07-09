package com.github.mbdjair.diferencaDatas.application.api;

import com.github.mbdjair.diferencaDatas.domain.DateUtils;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Alunoinf_2 on 09/07/2019.
 */
class DiaDaSemanaControllerTest {
    @Test
    void obterDiferencaDatasDiasComParametros() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateUtils.DEFAULT_DATE_FORMAT);
        final Date primeiraData = simpleDateFormat.parse("04/07/2019");
        final Date segundaData = simpleDateFormat.parse("05/07/2019");
        long diferenca = new DiaDaSemanaController().diaDaSemana(primeiraData, segundaData);
        assertEquals(0L, diferenca);
    }

    @Test
    void obterDiferencaDatasDiasSem() {
        long diferenca = new DiaDaSemanaController().diaDaSemana(null, null);
        assertEquals(0L, diferenca);
    }

}