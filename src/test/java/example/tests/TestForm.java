package example.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestForm {

    private SelenideElement

            firstNameInput = $("[id=firstName]"),
            lastNameInput = $("[id=lastName]"),
            emailInput = $("[id=userEmail]"),
            clickRadioButton = $(".custom-control-label"),
            phoneInput = $("[id=userNumber]"),
            subjectsInput = $("#subjectsInput"),
            hobbiesInput = $("[id=hobbiesWrapper]"),
            selectFileButton = $("[id=uploadPicture]"),
            stateField = $("#state"),
            stateFromDropdown = $("#stateCity-wrapper"),
            cityField = $("#city"),
            cityFromDropdown = $("#stateCity-wrapper"),
            submitButton = $("[id=submit]"),
            tableTitle = $("[id=example-modal-sizes-title-lg]");



    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
    }

    @Test
    public void testForm() {
        open("https://demoqa.com/automation-practice-form");
        $("[id=firstName]").setValue("Max");
        $("[id=lastName]").setValue("Kuznecov");
        $("[id=userEmail]").setValue("max@gmail.com");

        $(".custom-control-label").click();
        $("[id=userNumber]").setValue("23456678");

        $("[id=dateOfBirthInput]").click();
//        $(".react-datepicker__month-select").selectOption("");
//        $(".react-datepicker__year_select").selectOption("1991");
        $(".react-datepicker__day--018:not(.react-datepicker__day--outside-month)").click();

        $("#subjectsInput").setValue("English").pressEnter();
        $("#subjectsInput").setValue("Maths").pressEnter();

        $("[id=hobbiesWrapper]").$(byText("Reading")).click();
        $("[id=hobbiesWrapper]").$(byText("Music")).click();

        $("[id=uploadPicture]").uploadFile(new File("src/main/resources/picture/1.png"));
        $("[id=uploadPicture]").uploadFromClasspath("picture/1.png");

        $("[id=currentAddress]").setValue("Rozy").scrollTo();

        $("#react-select-3-input").doubleClick();
        $("#react-select-3-input").setValue("N").pressEnter();
        $("#react-select-4-input").doubleClick();
        $("#react-select-4-input").setValue("D").pressEnter();
        $("#submit").click();


        $("[id=example-modal-sizes-title-lg]").shouldHave(text("Thanks for submitting the form"));

        $(".table-responsive").shouldHave(text("Max Kuznecov"),
                text("max@gmail.com"), text("Male"), text("23456678"));

//        public void openPage() {
//            openPage("https://demoqa.com/automation-practice-form");
//        }

  }
}
