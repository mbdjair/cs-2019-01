package com.github.mbdjair.jpeg;

import java.io.IOException;

/**
 * Created by Alunoinf_2 on 04/06/2019.
 */
public class Main {
    public static void main(String[] args) {
        if (args == null || args.length < 1) {
            System.out.println("A aplicação não recebeu argumentos suficientes");
            return;
        }

        try {

            String caminhoArquivo = args[0];
            String retorno = "Não é um arquivo JPEG";
            if (FileCheck.obterHexadecimal(caminhoArquivo)) {
                retorno = "É um arquivo JPEG";
            }
            System.out.println(retorno);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
