/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.mbdjair.extenso.application.api;

import com.github.mbdjair.extenso.domain.NumeroExtensoUtil;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Classe que possui implemetações referentes a
 */
@RestController
public class ExtensoController {
    /**
     * Recebe um número positivo de até quatro dígitos e obtém uma String que é
     * equivalente a este número escrito por extenso na lingua portuguesa.
     *
     * @param numero valor que será escrito por extenso.
     * @return Quantidade de dias que existe entre as duas datas recebidas
     * @throws IllegalArgumentException se numero for negativo
     * @throws IllegalArgumentException se numero possuir mais de 4 casas decimais
     */
    @CrossOrigin
    @RequestMapping("extenso")
    public String obterNumeroExtenso(
            @RequestParam(value = "number") int numero
    ) {
        if (numero > 9999) throw new IllegalArgumentException("Não é permitido"
                + " valores com mais de 4 dígitos");
        if (numero < 0) throw new IllegalArgumentException("Não é permitido"
                + " valores negativos");

        return NumeroExtensoUtil.obterNumeroExtenso(numero);
    }
}
