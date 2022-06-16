package example.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestFormPageObject extends TestBase {

    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
    }
    @Test
    void testForm() {
        registrationPage.openPage();

        registrationPage.fillInFirstName("Nikolay");
        registrationPage.fillInLastName("Nikij");

        registrationPage.fillInEmail("nikolay@gmail.com");

        registrationPage.selectGender();

        registrationPage.indicatePhoneNumber("323123124");


        registrationPage.calendar.selectDate("10","10", "1990");
        registrationPage.selectSubjects("English").selectSubjects("Math");

        registrationPage.checkHobbies("Reading")
                .checkHobbies("Music");

        registrationPage.uploadPicture("1.png");

        registrationPage.fillInAddress("Minsk.Sckoriny");

        registrationPage.selectState("Haryana");

        registrationPage.selectCity("Panipat");

        registrationPage.clickSubmit();

        registrationPage.checkTable("Thanks for submitting the form");

        registrationPage.checkResultFullName("Nikolay Nikij")
                .checkResultEmail("nikolay@gmail.com");
    }
}
