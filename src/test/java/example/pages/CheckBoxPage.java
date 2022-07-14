package example.pages;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CheckBoxPage {

    public void open() {
        Selenide.open("https://demoqa.com/checkbox");
    }

    public void openAllCheckBoxes() {
        $("button[aria-label='Expand all']").click();
        //$("button[aria-label='Collapse all']").click();
    }
    public void selectFile(String checkboxTitle) {
        new CheckBoxPage().selectCheckbox(checkboxTitle);
    }

    public boolean isCheckboxSelected(String checkboxTitle) {
        return new CheckBoxPage().isSelected(checkboxTitle);
    }

    private boolean isSelected(String title) {
        return $x(String.format("//*[contains(text(),'%s')]/ancestor::span[@class='rct-text']" +
                "//*[@type='checkbox']", title)).isSelected();
    }


    private void selectCheckbox(String title) {
        $x(String.format("//*[contains(text(),'%s')]/ancestor::span[@class='rct-text']" +
                "//*[@class='rct-checkbox']", title)).click();
    }

}
