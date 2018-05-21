package Exercicio07;

import java.io.*;

public class Exercicio07 {
    
    public static void main(String[] args) throws UnsupportedEncodingException, IOException{
        
         FileInputStream fis = new FileInputStream("d:\\arquivo.txt");
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader br = new BufferedReader(isr);
        
        FileOutputStream fos = new FileOutputStream("d:\\arquivoByte.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        
        int qntLinhas = 0;
        String linha;
        while((linha = br.readLine()) != null){
            qntLinhas++;
        }
        dos.writeInt(qntLinhas);
        fis.getChannel().position(0);
        br = new BufferedReader(new InputStreamReader(fis));
        
        while((linha = br.readLine()) != null){
            byte[] texto = linha.getBytes("UTF-8");
            dos.writeInt(texto.length);
        }
        
        fis.getChannel().position(0);
        br = new BufferedReader(new InputStreamReader(fis));
        while((linha = br.readLine()) != null){
            byte[] texto = linha.getBytes("UTF-8");
            dos.write(texto, 0, texto.length);
        }
        br.close();
        dos.close();
    }
    
}
