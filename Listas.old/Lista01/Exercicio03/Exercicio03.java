package Exercicio03;

import java.io.*;

public class Exercicio03 {

    public static void main(String[] args) throws Exception {

            BufferedReader myBuffer = new BufferedReader(new InputStreamReader(new FileInputStream("c:\\arquivo.txt"), "UTF-8"));

            String linha = myBuffer.readLine();

            while (linha != null) {
                    System.out.println(linha);
                    linha = myBuffer.readLine();
            }

            myBuffer.close();

    }
}
