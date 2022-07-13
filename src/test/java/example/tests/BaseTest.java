package example.tests;

import com.codeborne.selenide.Configuration;
import example.pages.ElementPage;
import example.pages.RegistrationPage;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

    RegistrationPage registrationPage = new RegistrationPage();
    ElementPage elementPage = new ElementPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
        Configuration.clickViaJs = true;
    }

}
