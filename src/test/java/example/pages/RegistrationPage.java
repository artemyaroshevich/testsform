package example.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import example.components.CalendarComponent;
import org.openqa.selenium.Keys;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {

    SelenideElement

            firstNameInput = $("[id=firstName]"),
            lastNameInput = $("[id=lastName]"),
            emailInput = $("[id=userEmail]"),
            clickRadioButton = $(".custom-control-label"),
            phoneInput = $("[id=userNumber]"),
            dateOfBirth = $("[id=dateOfBirthInput]"),
            subjectsInput = $("#subjectsInput"),
            hobbyCheckBox = $("#hobbies-checkbox-1"),
            addressInput = $("[id=currentAddress]"),
            selectFileButton = $("[id=uploadPicture]"),
            stateField = $("#react-select-3-input"),
            cityField = $("#react-select-4-input"),
            submitButton = $("[id=submit]"),
            resultTable = $(".table-responsive"),
            tableTitle = $("[id=example-modal-sizes-title-lg]");

    public void openPage() {
        open("https://demoqa.com/automation-practice-form");
    }


    public RegistrationPage fillInFirstName(String firstName) {
        firstNameInput.sendKeys(firstName);
        return this;
    }

    public RegistrationPage fillInLastName(String lastName) {
        lastNameInput.setValue(lastName);
        return this;
    }

    public void fillInEmail(String email) {
        emailInput.setValue(email);
    }
    public void selectGender() {
        clickRadioButton.click();
    }

    public void indicatePhoneNumber(String phoneNumber) {
        phoneInput.setValue(phoneNumber);
    }

    public void filldateOfBirth (String birth) {
        dateOfBirth.sendKeys(birth, Keys.ENTER);

    }

    public RegistrationPage selectSubjects(String subject) {
        subjectsInput.setValue(subject).pressEnter();
        return this;
    }

    public void checkHobby() {
    hobbyCheckBox.click();

    }

    public void fillInAddress(String address) {
        addressInput.setValue(address).scrollTo();
    }

    public void uploadPicture(String fileName) {
        selectFileButton.uploadFile(new File("src/main/resources/picture/" + fileName));
    }

    public void selectState(String state) {
        stateField.sendKeys(state, Keys.ENTER);;
    }

    public void selectCity(String city) {
        cityField.sendKeys(city, Keys.ENTER);
    }

    public void clickSubmit() {
        submitButton.click();
    }

    public void check() {
        $x("//*[contains(text(),'Nikolay Nikolaj')]").shouldBe(Condition.visible);
        $x("//*[contains(text(),'nikolay@gmail.com')]").shouldBe(Condition.visible);
        $x("(//*[contains(text(),'Male')])[2]").shouldBe(Condition.visible);
        $x("(//*[contains(text(),'06 July,2022')])").shouldBe(Condition.visible);
        $x("//*[contains(text(),'English, Maths')]").shouldBe(Condition.visible);
        $x("(//*[contains(text(),'Sports')])[2]").shouldBe(Condition.visible);
        $x("//*[contains(text(),'1.png')]").shouldBe(Condition.visible);
        $x("//*[contains(text(),'Haryana Panipat')]").shouldBe(Condition.visible);

    }
}
