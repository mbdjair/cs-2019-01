package com.github.mbdjair.inteiro;

import java.io.IOException;

/**
 * Created by Alunoinf_2 on 04/06/2019.
 */
public class InteiroMain {
    public static void main(String[] args) {
        if(args == null){
            System.out.println("A aplicação não recebeu argumentos");
            return;
        }

        try {

            String caminhoArquivo = args[0];
            String hexadecimal = FileBinary.obterHexadecimal(caminhoArquivo);
            System.out.println(hexadecimal);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
