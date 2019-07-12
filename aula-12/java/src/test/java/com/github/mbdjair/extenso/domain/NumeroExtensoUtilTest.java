package com.github.mbdjair.extenso.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NumeroExtensoUtilTest {
    @Test
    void numeroExtenso2() {
        assertEquals(NumeroExtensoUtil.obterNumeroExtenso(2), "dois");
    }

    @Test
    void numeroExtenso10() {
        assertEquals(NumeroExtensoUtil.obterNumeroExtenso(10), "dez");
    }

    @Test
    void numeroExtenso20() {
        assertEquals(NumeroExtensoUtil.obterNumeroExtenso(20), "vinte");
    }

    @Test
    void numeroExtenso21() {
        assertEquals(NumeroExtensoUtil.obterNumeroExtenso(21), "vinte e um");
    }

    @Test
    void numeroExtenso200() {
        assertEquals(NumeroExtensoUtil.obterNumeroExtenso(200), "duzentos");
    }

    @Test
    void numeroExtenso201() {
        assertEquals(NumeroExtensoUtil.obterNumeroExtenso(201), "duzentos e um");
    }

    @Test
    void numeroExtenso220() {
        assertEquals(
                NumeroExtensoUtil.obterNumeroExtenso(220)
                , "duzentos e vinte"
        );
    }

    @Test
    void numeroExtenso1000() {
        assertEquals(NumeroExtensoUtil.obterNumeroExtenso(1000), "mil");
    }

    @Test
    void numeroExtenso1001() {
        assertEquals(NumeroExtensoUtil.obterNumeroExtenso(1001), "mil e um");
    }

    @Test
    void numeroExtenso2001() {
        assertEquals(NumeroExtensoUtil.obterNumeroExtenso(2001), "dois mil e um");
    }

    @Test
    void numeroExtenso9999() {
        assertEquals(
                NumeroExtensoUtil.obterNumeroExtenso(9999)
                , "nove mil e novecentos e noventa e nove"
        );
    }

    @Test
    void numeroExtensoThrowsNumeroNegativo() {
        assertThrows(
                IllegalArgumentException.class
                , () -> NumeroExtensoUtil.obterNumeroExtenso(-1)
        );
    }

    @Test
    void numeroExtensoThrowsNumeroCincoDigitos() {
        assertThrows(
                IllegalArgumentException.class
                , () -> NumeroExtensoUtil.obterNumeroExtenso(99999)
        );
    }

}