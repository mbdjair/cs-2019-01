package com.github.mbdjair.diferencaDatas.domain;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by Alunoinf_2 on 04/07/2019.
 */
public final class DateUtils {

    private DateUtils() {
    }

    /**
     * String que contém o formato de data padrão.
     */
    public static final String DEFAULT_DATE_FORMAT = "dd/MM/yyyy";

    /**
     * Obtém diferença entre datas.
     *
     * @param primeiraData primeira data que participará da subtração.
     * @param segundaData  segunda data que participará da subtração.
     * @return retorna o número de dias entre as datas
     */
    public static long obterDiferencaDatasDias(
            final Date primeiraData,
            final Date segundaData) {
        final long primeiraDataMillis = primeiraData.getTime();
        final long segundaDataMillis = segundaData.getTime();

        long diferecaMillis = Math.abs(segundaDataMillis - primeiraDataMillis);
        return TimeUnit.DAYS.convert(diferecaMillis, TimeUnit.MILLISECONDS);
    }
}
