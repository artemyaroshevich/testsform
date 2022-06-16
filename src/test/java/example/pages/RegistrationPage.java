package example.pages;

import com.codeborne.selenide.SelenideElement;
import example.components.CalendarComponent;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {

    public CalendarComponent calendar = new CalendarComponent();

    SelenideElement

            firstNameInput = $("[id=firstName]"),
            lastNameInput = $("[id=lastName]"),
            emailInput = $("[id=userEmail]"),
            clickRadioButton = $(".custom-control-label"),
            phoneInput = $("[id=userNumber]"),
            subjectsInput = $("#subjectsInput"),
            hobbiesInput = $("[id=hobbiesWrapper]"),
            addressInput = $("[id=currentAddress]"),
            selectFileButton = $("[id=uploadPicture]"),
            stateField = $("#state"),
            stateFromDropdown = $("#stateCity-wrapper"),
            cityField = $("#city"),
            cityFromDropdown = $("#stateCity-wrapper"),
            submitButton = $("[id=submit]"),
            resultTable = $(".table-responsive"),
            tableTitle = $("[id=example-modal-sizes-title-lg]");

    public void openPage() {
        open("https://demoqa.com/automation-practice-form");
    }


    public RegistrationPage fillInFirstName(String firstName) {
        firstNameInput.setValue(firstName).shouldHave(text(firstName));
        return this;
    }

    public RegistrationPage fillInLastName(String lastName) {
        lastNameInput.setValue(lastName).shouldHave(text(lastName));
        return this;
    }

    public void fillInEmail(String email) {
        emailInput.setValue(email).shouldHave(text(email));
    }

    public void selectGender() {
        clickRadioButton.click();
    }

    public void indicatePhoneNumber(String phoneNumber) {
        phoneInput.setValue(phoneNumber).shouldHave(text(phoneNumber));
    }

    public RegistrationPage selectSubjects(String subject) {
        subjectsInput.setValue(subject).pressEnter();
        return this;
    }

    public RegistrationPage checkHobbies(String hobby) {
        hobbiesInput.$(byText(hobby)).click();
        return this;
    }

    public void fillInAddress(String address) {
        addressInput.setValue(address).scrollTo();
    }

    public void uploadPicture(String fileName) {
        selectFileButton.uploadFile(new File("src/main/resources/picture/" + fileName));
        selectFileButton.uploadFile();
    }

    public void selectState(String state) {
        stateField.click();
        stateFromDropdown.$(byText(state)).click();
    }

    public void selectCity(String city) {
        cityField.click();
        cityFromDropdown.$(byText(city)).click();
    }

    public void clickSubmit() {
        submitButton.click();
    }

    public void checkTable(String title) {
        tableTitle.shouldHave(text(title));
    }

    public RegistrationPage checkResultFullName(String fullName) {
        resultTable.shouldHave(text(fullName));
        return this;
    }

    public void checkResultEmail(String email) {
        resultTable.shouldHave(text(email));
    }

}
