package Exercicio06;

import java.io.*;
import java.util.Scanner;

public class Exercicio06 {
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
        
        Scanner scn = new Scanner(System.in);
            
        System.out.println("Qual arquivo deseja exibir?");
        String arquivo = scn.next();
        
        FileInputStream fis = new FileInputStream(arquivo);
        DataInputStream dis = new DataInputStream(fis);
        
        while (dis.available() > 0){
            
            int tamanho = dis.readInt();
        
            byte[] buffer = new byte[tamanho];
            dis.readFully(buffer, 0, tamanho);
            
            String dados = new String(buffer, "UTF-8");
                
            System.out.println(dados + "\n");
            
        }
    }
}
