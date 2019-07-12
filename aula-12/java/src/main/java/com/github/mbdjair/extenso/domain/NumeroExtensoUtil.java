package com.github.mbdjair.extenso.domain;

/**
 * Classe que engloba implementeações de escrita de valores inteiros por extenso
 */
public final class NumeroExtensoUtil {


    /**
     * Valor de correção para se obter o valor por extenso de centena correto
     * utilizando valor de seu dígito. Exemplo 200, dígito = 2, valor corrigido
     * digito - (valor de correção) = 1
     */
    private static final int CORRECAO_CENTENA = 1;
    /**
     * Valor de correção para se obter o valor por extenso de centena correto
     * utilizando valor de seu dígito. Exemplo 2000, dígito = 2, valor corrigido
     * digito - (valor de correção) = 0
     */
    private static final int CORRECAO_DEZENA = 2;

    /**
     * Valores de 0 á 19 por extenso
     */
    private static final String[] baseNumbers = new String[]{
            "zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito"
            , "nove", "dez", "onze", "doze", "treze", "quatorze", "quinze"
            , "dezesseis", "dezessete", "dezoito", "dezenove"
    };

    /**
     * Valores de dezenas por extenso de 20 em diante
     */
    private static final String[] dezenasMaioresDez = new String[]{
            "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta"
            , "noventa"
    };


    /**
     * Valores de centenas por extenso com exceção de "cem"
     */
    private static final String[] centenasMaioresCem = new String[]{
            "cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos"
            , "setecentos", "oitocentos", "novecentos"
    };


    /**
     * Boa prática para garantir que a classe de útilidade não será incicializada
     */
    private NumeroExtensoUtil() {
    }


    /**
     * Método que escreve por extenso qualquer número de no máximo 2 digitos maior que 0
     *
     * @param numero número de até  2 dígitos que será escrito por extenso
     * @return parâmetro escrito por extenso
     */
    private static String obterDezena(int numero) {
        if (numero < 20) {
            return baseNumbers[numero];
        }

        final int numeroSemDezena = numero % 10;
        final int digitoDezena = (numero - numeroSemDezena)/10;


        String dezena = dezenasMaioresDez[digitoDezena - CORRECAO_DEZENA];

        if (ehZero(numeroSemDezena)) {
            return dezena;
        }

        return String.format("%s e %s", dezena, baseNumbers[numeroSemDezena]);


    }

    /**
     * Método que escreve por extenso qualquer número de no máximo 3 digitos maior que 0
     *
     * @param numero número de até  3 dígitos que será escrito por extenso
     * @return parâmetro escrito por extenso
     */
    private static String obterCentena(int numero) {
        final int numeroSemCentena = numero % 100;
        final int digitoCentena = (numero - numeroSemCentena)/100;

        if (ehZero(digitoCentena)) {
            return obterDezena(numero);
        }

        String centena;


        if (numero == 100) {
            centena = "cem";
        } else {
            centena = centenasMaioresCem[digitoCentena - CORRECAO_CENTENA];
        }

        if (ehZero(numeroSemCentena)) {
            return centena;
        }

        return String.format("%s e %s", centena, obterCentena(numeroSemCentena));
    }


    /**
     * Método que escreve por extenso qualquer número de no máximo 4 digitos maior que 0
     *
     * @param numero número de até 4 dígitos que será escrito por extenso
     * @return parâmetro escrito por extenso
     * @throws IllegalArgumentException se numero possuir mais de 4 digitos
     * @throws IllegalArgumentException se numero for negativo
     */
    public static String obterNumeroExtenso(int numero) {
        if (numero > 9999) throw new IllegalArgumentException("Não é permitido"
                + " valores com mais de 4 dígitos");
        if (numero < 0) throw new IllegalArgumentException("Não é permitido"
                + " valores negativos");

        final int numeroSemMilhar = numero % 1000;
        final int digitoMilhar = (numero - numeroSemMilhar)/1000;

        if (ehZero(digitoMilhar)) {
            return obterCentena(numero);
        }

        String milhar;

        if (digitoMilhar == 1) {
            milhar = "mil";
        } else {
            milhar = String.format("%s mil", baseNumbers[digitoMilhar]);
        }


        if (ehZero(numeroSemMilhar)) {
            return milhar;
        }

        return String.format("%s e %s", milhar, obterCentena(numeroSemMilhar));

    }

    private static boolean ehZero(int digitoMilhar) {
        return digitoMilhar == 0;
    }


}
