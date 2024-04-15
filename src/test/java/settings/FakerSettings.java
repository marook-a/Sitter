package settings;

import com.github.javafaker.Faker;

import java.util.Locale;

public class FakerSettings {
    public static Faker faker = new Faker(new Locale("en"));

   // String female_fake_name = faker.name().firstName(Gender.FEMALE);

    public static String faker_jpegFileName = faker.file().fileName();

    public static String faker_address = faker.address().fullAddress();

    public static String faker_phone = faker.phoneNumber().phoneNumber();

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
    }



