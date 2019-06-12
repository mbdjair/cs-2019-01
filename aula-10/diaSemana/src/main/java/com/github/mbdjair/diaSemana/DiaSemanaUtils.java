package com.github.mbdjair.diaSemana;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Alunoinf_2 on 04/06/2019.
 */
public class DiaSemanaUtils {
    public static int obterDiaSemana(String[] args){
        if(!entradasValidas(args))
            return -1;
        switch (compararDatas(args)) {
            case 0:
                return Integer.parseInt(args[3]);
            case 1:
                return obterDiaSemanaIncrementa(args);
            case -1:
                return obterDiaSemanaDecrementa(args);
            default:
                return -1;
        }


    }

    private static boolean isAnoBissexto(String anoBase, String anoAtual){
        int anoBaseNum = Integer.parseInt(anoBase);
        int anoAtualNum = Integer.parseInt(anoAtual);
        boolean b = (anoBaseNum - anoAtualNum) % 4 == 0;
        boolean b1 = anoAtualNum % 100 != 0;
        boolean b2 = anoAtualNum % 400 == 0;
        return b && (b1 || b2);
    }

    private static int obterDiaSemanaIncrementa(String[] args) {
        String dataBaseIncrementa = incrementaData(args[2]);
        String diaSemanaIncrementa = inCrementaDiaSemana(args[3]);
        return obterDiaSemana(new String[]{args[0], args[1], dataBaseIncrementa, diaSemanaIncrementa});
    }

    private static String inCrementaDiaSemana(String arg) {
        return null;
    }

    private static String incrementaData(String arg) {
        return null;
    }

    private static int obterDiaSemanaDecrementa(String[] args) {
        String dataBaseDecrementa = decrementaData(args[2]);
        String diaSemanaDecrementa = decrementaDiaSemana(args[3]);
        return obterDiaSemana(new String[]{args[0], args[1], dataBaseDecrementa, diaSemanaDecrementa});
    }

    private static String decrementaDiaSemana(String arg) {
        return null;
    }

    private static String decrementaData(String arg) {
        return null;
    }

    private static int compararDatas(String[] args) {
        boolean equals = args[0].equals(args[2]);
        if(equals)
        return 0;
        if(maiorQue(args))
            return 1;
        return -1;
    }

    private static boolean maiorQue(String[] args) {
        return false;
    }

    private static boolean entradasValidas(String[] args) {
        return false;
    }
}
