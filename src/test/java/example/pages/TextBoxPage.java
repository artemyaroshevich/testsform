package example.pages;

import com.codeborne.selenide.Condition;
import com.github.javafaker.Faker;
import example.entity.TextBox;
import example.entity.TextBoxFactory;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxPage {
   final TextBox textBox = TextBoxFactory.get();
    public void openPage() {
      open("https://demoqa.com/text-box");
    }

    public void fillForm() {
        Faker faker = new Faker();
        $("#userName").sendKeys(textBox.getFullName());
        $("#userEmail").sendKeys(textBox.getEmail());
        $("#currentAddress").sendKeys(textBox.getCurrentAddress());
        $("#permanentAddress").sendKeys(textBox.getPermananetAddress());
        $("#submit").click();
    }

    public void checkResultForm() {
        $("#name").shouldHave(Condition.text(textBox.getFullName()));
        $("#email").shouldHave(Condition.text(textBox.getEmail()));
        $("p#currentAddress").shouldHave(Condition.text(textBox.getCurrentAddress()));
        $("p#permanentAddress").shouldHave(Condition.text(textBox.getPermananetAddress()));
    }
}
