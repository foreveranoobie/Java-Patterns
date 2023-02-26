package client;

import com.fasterxml.jackson.core.JsonProcessingException;
import entity.Car;
import java.io.IOException;

public interface ClientInterface {
    void writeObjectToFile(Car car) throws IOException;
}
