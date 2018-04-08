package Exercicio04;

import java.io.*;
import java.util.Scanner;

public class Exercicio04 {
    
     public static void main(String[] args) throws Exception {

            Scanner scn = new Scanner(System.in);
            
            System.out.println("Qual arquivo deseja gravar?");
            String arquivo = scn.next();
            
            System.out.println("O que deseja gravar?");
            String linha = scn.next();
         
            File file = new File(arquivo);
         
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file),"UTF-8"));
            
            bw.append(linha);
    }
}
