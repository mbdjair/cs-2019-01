/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.mbdjair.diferencaDatas.application.api;

import com.github.mbdjair.diferencaDatas.domain.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class DiaDaSemanaController {
    /**
     * Recupera a quantidade de dias que existem entre as duas datas recebidas.
     *
     * @param primeiraData Primeira data usada para descobrir o intervalo.
     * @param segundaData Segunda data usada para descobrir o intervalo.
     * @return Quantidade de dias que existe entre as duas datas recebidas
     */
    @CrossOrigin
    @RequestMapping("diferencaData")
    public long diaDaSemana(
            @RequestParam(value = "firstDate")
            @DateTimeFormat(pattern = "dd/MM/yyyy") Date primeiraData,
            @RequestParam(value = "secondDate")
            @DateTimeFormat(pattern = "dd/MM/yyyy") Date segundaData) {


        if (primeiraData == null) {
            primeiraData = new Date();
        }

        if (segundaData == null) {
            segundaData = new Date();
        }

        return DateUtils.obterDiferencaDatasDias(primeiraData, segundaData);
    }
}
