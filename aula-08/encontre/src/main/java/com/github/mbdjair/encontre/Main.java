package com.github.mbdjair.encontre;

import java.io.IOException;

/**
 * Created by Alunoinf_2 on 04/06/2019.
 */
public class Main {
    public static void main(String[] args) {
        if (args == null || args.length < 2) {
            System.out.println("A aplicação não recebeu argumentos suficientes");
            return;
        }

        try {

            String caminhoArquivo = args[0];
            String palavraProcurada = args[1];
            String retorno = FileBinary.gerarLogOcorrenciaPalavra(caminhoArquivo, palavraProcurada);
            System.out.println(retorno);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
