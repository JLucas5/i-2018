package Exxercicio08;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Exercicio08 {
    
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException{
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Qual a linha dsejada?");
        int linha = scn.nextInt();
        
        FileInputStream fis = new FileInputStream("d:\\arquivo.txt");
        DataInputStream dis = new DataInputStream(fis);
        // String de retorno
        String dados = "";
        // Variável que captura o número de linhas do arquivo
        int qntLinhas = 0;
        // Variável de captura a quantidade de Bytes a serem pulados
        int qntBytes = 0;
        // Variável de salva o tamanho da linha
        int tamanhoLinha = 0;
        // Grava qual a linha desejada
        int linhaDesejada = linha;
            // Lê a quantidade de linhas
            qntLinhas = dis.readInt();
            // Faz um for para ler os tamanhos de cada linha
            for(int i = 1; i <= qntLinhas; i++){
                // Lê o tamanho
                int lin = dis.readInt();
                if(i == linhaDesejada){
                    // Salva o tamanho da linha desejada
                    tamanhoLinha = lin;
                }
                if(i < linhaDesejada){
                    // Grava a quantidade de Bytes a ser pulados até a linha desejada
                    qntBytes = qntBytes + lin;
                }
            }
            // Pula os Bytes
            dis.skipBytes(qntBytes);
             // Lê os próximos bytes
            byte[] buffer = new byte[tamanhoLinha];
            dis.readFully(buffer, 0, tamanhoLinha);
            // Transforma os bytes em String
            dados = new String(buffer, "UTF-8");
    }
}
