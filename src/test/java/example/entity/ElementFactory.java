package example.entity;

import com.github.javafaker.Faker;

public class ElementFactory {

    public static Element get() {
        Faker faker  = new Faker();
        Element element = new Element();
        element.setFullName(faker.name().fullName());
        element.setEmail(faker.internet().emailAddress());
        element.setCurrentAddress(faker.address().fullAddress());
        element.setPermananetAddress(faker.address().fullAddress());
        return element;
    }
}
