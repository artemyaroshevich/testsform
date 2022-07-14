package example.entity;

import com.github.javafaker.Faker;

public class TextBoxFactory {

    public static TextBox get() {
        Faker faker = new Faker();
        return new TextBox(faker.name().fullName(),
                faker.internet().emailAddress(),
                faker.address().fullAddress(),
                faker.address().fullAddress());
    }
}
