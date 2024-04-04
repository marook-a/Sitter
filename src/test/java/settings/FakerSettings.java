package settings;

import com.github.javafaker.Faker;

import java.util.Locale;

public class FakerSettings {
    public static Faker faker = new Faker();
    public static String name = faker.name().fullName();

    public static String faker_jpegFileName = faker.file().fileName();

    public static String address = faker.address().fullAddress();
    public static String faker_email = faker.internet().emailAddress();

    public static void main(String[] args) {
        // your main method code here
    }
}