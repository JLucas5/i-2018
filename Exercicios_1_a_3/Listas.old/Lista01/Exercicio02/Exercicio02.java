package Exercicio02;

import java.io.*;

public class Exercicio02 {
    
    public static void main(String args[]) throws FileNotFoundException, IOException{
        File file = new File("d:\\arquivo.jpg");
        FileInputStream fis = new FileInputStream(file);
        DataInputStream dis = new DataInputStream(fis);
      
        int byteInicio = dis.readShort();
        
        if(byteInicio == 0xffd8ffe0){
            System.out.println("Restrição satisfeita");            
        }else{
            System.out.println("Restrição não satisfeita");
        }
    }
}
