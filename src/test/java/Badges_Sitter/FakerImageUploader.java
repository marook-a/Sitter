package Badges_Sitter;

import com.github.javafaker.Faker;

import java.io.*;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FakerImageUploader {
    public static void main(String[] args) {
        Faker faker = new Faker();
        byte[] fakeImageData = generateFakeImage();
        String url = "https://dev.sittertree.com/file-upload/badge-document";

        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "image/jpeg");
            connection.setDoOutput(true);

            try (OutputStream os = connection.getOutputStream()) {
                os.write(fakeImageData);
            }

            int responseCode = connection.getResponseCode();
            System.out.println("HTTP Response Code: " + responseCode);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static byte[] generateFakeImage() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        Random random = new Random();

        // Генерация фейковых данных изображения
        byte[] imageData = new byte[640 * 480]; // Пример размера изображения 640x480
        random.nextBytes(imageData);

        // Запись данных изображения в ByteArrayOutputStream
        try {
            baos.write(imageData);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return baos.toByteArray();
    }
    public void uploadFile(String fileExtension) {
        // Simulating file upload logic
        if(isValidFileExtension(fileExtension)) {
            System.out.println("Uploading file with extension: " + fileExtension);
            // Add your actual file upload logic here
            // For example, you can use a library like Apache Commons IO to handle file upload
        } else {
            System.out.println("Invalid file extension. Upload failed.");
        }
    }

    private boolean isValidFileExtension(String fileExtension) {
        // Add logic to check if the file extension is valid
        // For example, you can check against a list of allowed file extensions
        List<String> allowedExtensions = Arrays.asList(".jpg", ".jpeg", ".png");
        return allowedExtensions.contains(fileExtension);
    }

}

