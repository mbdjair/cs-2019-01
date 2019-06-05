import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.util.Arrays;

/**
 * Created by Alunoinf_2 on 04/06/2019.
 */
public class FileCheck {
    public static String obterHexadecimal(String filePath) throws IOException {
        InputStream is = new FileInputStream(filePath);
        byte[] bytes = Files.readAllBytes(new File(filePath).toPath());
        String inicio = byteArrayToHexString(Arrays.copyOfRange(bytes,0,2));
        int length = bytes.length;
        String fim  = byteArrayToHexString(Arrays.copyOfRange(bytes, length -2, length));

        return inicio+fim;
    }

    private static String byteArrayToHexString(byte[] bytes) {
        String retorno;
        StringBuilder s = new StringBuilder();
        for (byte b:
             bytes) {
            s.append(String.format("%02x",b));
        }
        retorno = s.toString();
        return retorno;
    }
}
