package com.github.mbdjair.encontre;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Alunoinf_2 on 04/06/2019.
 */
public class FileBinary {
    public static String obterHexadecimal(String filePath) throws IOException {
        FileInputStream fis = new FileInputStream(filePath);
        DataInputStream dis = new DataInputStream(fis);
        int valor = dis.readInt();
        dis.close();
        return Integer.toHexString(valor);
    }
}
