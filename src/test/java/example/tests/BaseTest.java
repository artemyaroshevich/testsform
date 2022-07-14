package example.tests;

import com.codeborne.selenide.Configuration;
import example.pages.TextBoxPage;
import example.pages.RegistrationPage;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

    RegistrationPage registrationPage = new RegistrationPage();
    TextBoxPage textBoxPage = new TextBoxPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
        Configuration.clickViaJs = true;
    }

}
