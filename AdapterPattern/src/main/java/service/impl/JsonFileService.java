package service.impl;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import service.FileService;

public class JsonFileService implements FileService {
    @Override
    public void writeData(String data) throws IOException {
        Files.write(Path.of("object.json"), data.getBytes(StandardCharsets.UTF_8));
    }
}
