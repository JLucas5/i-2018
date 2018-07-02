/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio05;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Exercicio05 {
    
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("d:\\arquivo.txt"), "UTF-8"));
        
        FileOutputStream fos = new FileOutputStream("d:\\arquivoByte.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        
        String linha;
        
        while ((linha = br.readLine()) != null) {

            dos.writeInt(linha.getBytes().length);
            
            dos.write(linha.getBytes(), 0, linha.getBytes().length);
        }
        dos.close();
        br.close();
    } 
}
