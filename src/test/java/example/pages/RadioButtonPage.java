package example.pages;

import com.codeborne.selenide.Selenide;

import java.util.Locale;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RadioButtonPage {

    public void open() {
        Selenide.open("https://demoqa.com/radio-button");
    }

    public void clickButton() {
        $("#yesRadio").click();
        assertTrue($("#yesRadio").isSelected(), "Radio button is not selected or disabled");
        assertEquals( "Yes", getSuccessMessage());

        $("#impressiveRadio").click();
        assertTrue($("#impressiveRadio").isSelected(), "Radio button is not selected or disabled");
        assertEquals( "Impressive", getSuccessMessage());


        $("#NoRadio").click();
        assertTrue($("#NoRadio").isSelected(), "Radio button is not selected or disabled");
        assertEquals(  "No", getSuccessMessage());
    }
    public String getSuccessMessage () {
        return $(".text-success").getText();
    }

}
