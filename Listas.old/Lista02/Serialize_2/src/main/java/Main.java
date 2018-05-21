import java.io.*;

public class Main {

    public static void Main(String[] args) throws IOException, ClassNotFoundException {

        Serialize serialize = new Serialize("valor");

        grava(serialize, "arquivo.txt");
        Serialize deserializado = deserializa("arquivo.txt");

        System.out.println(deserializado);

    }

    private static void grava(Serializable serialize, String arquivo) throws IOException {
        FileOutputStream fileOut = new FileOutputStream(arquivo);
        ObjectOutputStream oout = new ObjectOutputStream(fileOut);
        oout.writeObject(serialize);
        oout.close();
        fileOut.close();


    }

    private static Serialize deserializa(String arquivo) throws IOException, ClassNotFoundException{
        Serialize t;
        FileInputStream fileIn = new FileInputStream(arquivo);
        ObjectInputStream oin = new ObjectInputStream(fileIn);
        t = (Serialize) oin.readObject();
        oin.close();
        fileIn.close();
        return t;
    }
}
