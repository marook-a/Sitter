package settings;

import com.github.javafaker.Faker;

import java.util.Locale;

public class FakerSettings {
    public static Faker faker = new Faker(new Locale("en"));

    public static String fake_name = faker.name().fullName();

    public static String faker_jpegFileName = faker.file().fileName();

    public static String address = faker.address().fullAddress();
    public static String faker_email = faker.internet().emailAddress();

    public static String generateRandomEmail() {
        Faker faker = new Faker();
        String username = faker.name().username();
        String domain = "example.com";
        return username + "@" + domain;
    }

        public static void main(String[] args) {
        String randomEmail = generateRandomEmail();
        System.out.println(randomEmail);
    }

 //       public static void main(String[] args) {
 //           // ваш код метода main здесь

    }
