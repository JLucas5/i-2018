package Exercicio01;

import java.io.*;

public class Exercicio01 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
       
        FileInputStream fis = new FileInputStream("c:\\arquivo.class");
        DataInputStream dis = new DataInputStream(fis);
        
        int valor = dis.readInt();
        dis.close();
        System.out.println(Integer.toHexString(valor));
    }
    
}
