/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.mbdjair.diferencaDatas.application.api;

import com.github.mbdjair.diferencaDatas.domain.DateUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class DiaDaSemanaController {

    @CrossOrigin
    @RequestMapping("diferencaData")
    public long diaDaSemana(@RequestParam(value = "firstDate", defaultValue =
            "não fornecida") String arg1,
                            @RequestParam(value = "secondDate", defaultValue =
                                    "não fornecida") String arg2) {

        Date primeiraData = dateFromString(arg1);
        Date segundaData = dateFromString(arg2);

        // Se segundaData não é fornecida, ou é inválida, use o dia corrente.
        if (primeiraData == null) {
            primeiraData = new Date();
        }

        if (segundaData == null) {
            segundaData = new Date();
        }

        return DateUtils.obterDiferencaDatasDias(primeiraData, segundaData);
    }

    /**
     * Recupera a instância de {@link Date} correspondente à sequência
     * de caracteres.
     *
     * @param data Sequência de caracteres no formato dd/MM/yyyy.
     * @return Instância de {@link Date} ou {@code null}, se a sequência
     * não está no formato esperado (por exemplo, "01-01-2018")
     */
    private Date dateFromString(String data) {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat(
                    DateUtils.DEFAULT_DATE_FORMAT
            );
            return formatter.parse(data);
        } catch (Exception exp) {
            return null;
        }
    }
}
