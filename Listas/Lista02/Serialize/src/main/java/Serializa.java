import java.io.Serializable;

public class Serializa implements Serializable{

    private NaoSerializa object;

    public Serializa(NaoSerializa object){
        this.object = object;
    }

    public NaoSerializa getObject() {
        return object;
    }

    public void setObject(NaoSerializa object) {
        this.object = object;
    }

}
