package example.tests;

import org.junit.jupiter.api.Test;

public class FormPageObjectTest extends BaseTest {

    @Test
    void testForm() {
        registrationPage.openPage();
        registrationPage.fillInFirstName("Nikolay");
        registrationPage.fillInLastName("Nikolaj");
        registrationPage.fillInEmail("nikolay@gmail.com");
        registrationPage.selectGender();
        registrationPage.indicatePhoneNumber("1234567891");
        registrationPage.filldateOfBirth("");
//        registrationPage.calendar.selectDate("05","Jul", "2022");
        registrationPage.selectSubjects("English").selectSubjects("Math");
        registrationPage.uploadPicture("1.png");
        registrationPage.checkHobby();
        registrationPage.fillInAddress("");
        registrationPage.selectState("Haryana");
        registrationPage.selectCity("Panipat");
        registrationPage.clickSubmit();
        registrationPage.check();

    }
}
