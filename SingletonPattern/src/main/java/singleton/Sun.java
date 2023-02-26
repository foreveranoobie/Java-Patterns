package singleton;

import java.util.Objects;
import java.util.Random;

public class Sun {
    private static Sun instance;

    private int temperature;

    private Sun(){
        this.temperature = new Random().nextInt();
    }

    public static Sun getInstance() {
        if(Objects.isNull(instance)){
            instance = new Sun();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Sun{" +
            "temperature=" + temperature +
            '}';
    }
}
