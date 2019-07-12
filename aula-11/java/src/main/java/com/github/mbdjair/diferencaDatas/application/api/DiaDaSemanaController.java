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

/**
 * Classe que possui métodos de manipulação de datas
 */
@RestController
public class DiaDaSemanaController {
    /**
     * Obtém valor em dias da diferença entre datas recebidas retornando
     * , este é sempre positivo.
     *
     * @param primeiraData primeira data que participará da subtração.
     * @param segundaData  segunda data que participará da subtração.
     * @return retorna o número de dias entre as datas, sempre positivo
     * @throws IllegalArgumentException se primeiraData ou segundaData
     * forem nulas
     */
    @CrossOrigin
    @RequestMapping("diferencaData")
    public long diaDaSemana(
            @RequestParam(value = "firstDate")
            @DateTimeFormat(pattern = "dd/MM/yyyy") Date primeiraData,
            @RequestParam(value = "secondDate")
            @DateTimeFormat(pattern = "dd/MM/yyyy") Date segundaData) {

        if (primeiraData == null || segundaData == null) {
            throw new IllegalArgumentException(
                    "Tanto primeiraData quanto segundaData" +
                            " devem ser diferente de nulo"
            );
        }

        return DateUtils.obterDiferencaDatasDias(primeiraData, segundaData);
    }
}
