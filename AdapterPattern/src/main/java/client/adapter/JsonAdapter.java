package client.adapter;

import client.ClientInterface;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import entity.Car;
import java.io.IOException;
import service.FileService;
import service.impl.JsonFileService;

public class JsonAdapter implements ClientInterface {
    private JsonMapper mapper;
    private FileService fileService;

    public JsonAdapter(){
        mapper = new JsonMapper();
        fileService = new JsonFileService();
    }

    @Override
    public void writeObjectToFile(Car car) throws IOException {
        String jsonData = mapper.writeValueAsString(car);
        fileService.writeData(jsonData);
    }
}
