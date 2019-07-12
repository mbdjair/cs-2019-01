package com.github.mbdjair.extenso.application.api;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class ExtensoControllerTest {
    @Test
    void numeroExtenso9999() {
        assertEquals(
                new ExtensoController().obterNumeroExtenso(9999)
                , "nove mil e novecentos e noventa e nove"
        );
    }

    @Test
    void numeroExtensoThrowsNumeroNegativo() {
        assertThrows(
                IllegalArgumentException.class
                , () -> new ExtensoController().obterNumeroExtenso(-1)
        );
    }

    @Test
    void numeroExtensoThrowsNumeroCincoDigitos() {
        assertThrows(
                IllegalArgumentException.class
                , () -> new ExtensoController().obterNumeroExtenso(99999)
        );
    }

}