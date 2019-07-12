package com.github.mbdjair.diferencaDatas.domain;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Grupo implementações de operações entre datas
 */
public final class DateUtils {

    private DateUtils() {
    }

    /**
     * String que contém o formato de data padrão.
     */
    public static final String DEFAULT_DATE_FORMAT = "dd/MM/yyyy";

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
    public static long obterDiferencaDatasDias(
            final Date primeiraData,
            final Date segundaData) {

        if (primeiraData == null || segundaData == null) {
            throw new IllegalArgumentException(
                    "Tanto primeiraData quanto segundaData" +
                            " devem ser diferente de nulo"
            );
        }

        final long primeiraDataMillis = primeiraData.getTime();
        final long segundaDataMillis = segundaData.getTime();

        long diferecaMillis = Math.abs(segundaDataMillis - primeiraDataMillis);
        return TimeUnit.DAYS.convert(diferecaMillis, TimeUnit.MILLISECONDS);
    }
}
