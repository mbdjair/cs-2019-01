package com.github.mbdjair.encontre;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Alunoinf_2 on 04/06/2019.
 */
public class FileBinary {
    public static String gerarLogOcorrenciaPalavra(String filePath, String palavra) throws IOException {
        Path arquivo = Paths.get(filePath);
        Charset utf8 = Charset.forName("UTF-8");
        StringBuilder builder = new StringBuilder();
        builder.append("Encontradas: %d");
        int linha = 0;
        int ocorrencias = 0;

        for (String text : Files.readAllLines(arquivo, utf8)) {
            int col = text.indexOf(palavra);
            boolean existeOcorrencia = col > -1;
            if (existeOcorrencia) {
                adicionaLinha(builder, linha, text, col);
                ocorrencias = ocorrencias + getOcorrencias(palavra, text, col);
            }
            linha++;
        }
        return String.format(builder.toString(),ocorrencias);
    }

    private static void adicionaLinha(StringBuilder builder, int lin, String text, int col) {
        builder.append(String.format("%nL%d C%d: %s",lin + 1 ,col + 1,text));
    }

    private static int getOcorrencias(String palavraProcurada, String linhaTexto, int coluna) {
        int numeroOcorrencias = 0;
        do {
            numeroOcorrencias++;
            coluna = linhaTexto.indexOf(palavraProcurada, coluna+1);
            System.out.println(coluna);
        } while (coluna > -1);
        return numeroOcorrencias;
    }
}
