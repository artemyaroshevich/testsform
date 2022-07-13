package example.pages;

import com.codeborne.selenide.Condition;
import com.github.javafaker.Faker;
import example.entity.Element;
import example.entity.ElementFactory;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ElementPage {
   final Element element = ElementFactory.get();
    public void openPage() {
      open("https://demoqa.com/text-box");
    }

    public void fillForm() {
        Faker faker = new Faker();

        $("#userName").sendKeys(element.getFullName());
        $("#userEmail").sendKeys(element.getEmail());
        $("#currentAddress").sendKeys(element.getCurrentAddress());
        $("#permanentAddress").sendKeys(element.getPermananetAddress());
        $("#submit").click();
    }

    public void checkResultForm() {
        $("#name").shouldHave(Condition.text(element.getFullName()));
        $("#email").shouldHave(Condition.text(element.getEmail()));
        $("p#currentAddress").shouldHave(Condition.text(element.getCurrentAddress()));
        $("p#permanentAddress").shouldHave(Condition.text(element.getPermananetAddress()));
    }
}
