import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        NaoSerializa naoSerializa = new NaoSerializa("valor");
        Serializa serializa = new Serializa(naoSerializa);

        grava(serializa,"arquivo.txt");
    }


    private static void grava(Serializable object, String arquivo) throws IOException{
        try {


            FileOutputStream fileOut = new FileOutputStream(arquivo);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(object);
        }catch(java.io.NotSerializableException e){
            System.out.println("Exceção encontrada: " + e);
        }

    }
}
