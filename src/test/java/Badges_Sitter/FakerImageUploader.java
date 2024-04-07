package Badges_Sitter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FakerImageUploader {

    public static File createTempImageFile() throws IOException {
        // Здесь можно установить нужное расширение файла
        String imageExtension = ".jpg";
        // Создание временного файла
        File tempImageFile = Files.createTempFile("temp_image", imageExtension).toFile();
  //      tempImageFile.deleteOnExit(); // Указываем, что файл должен быть удален при выходе
        // Здесь можно написать логику для заполнения файла данными, если это необходимо
        return tempImageFile;
    }
}