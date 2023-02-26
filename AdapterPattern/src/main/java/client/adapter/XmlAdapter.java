package client.adapter;

import client.ClientInterface;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import entity.Car;
import java.io.IOException;
import service.FileService;
import service.impl.XmlFileService;

public class XmlAdapter implements ClientInterface {
    private XmlMapper mapper;
    private FileService fileService;

    public XmlAdapter(){
        mapper = new XmlMapper();
        fileService = new XmlFileService();
    }

    @Override
    public void writeObjectToFile(Car car) throws IOException {
        String xmlData = mapper.writeValueAsString(car);
        fileService.writeData(xmlData);
    }
}
