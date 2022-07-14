package example.tests;

import example.entity.CheckBoxFactory;
import example.pages.CheckBoxPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckBoxTest extends BaseTest {

    @Test
    public void checkBox() {
        CheckBoxPage checkBoxPage = new CheckBoxPage();
        String checkboxTitle = CheckBoxFactory.get();
        checkBoxPage.open();
        checkBoxPage.openAllCheckBoxes();
        checkBoxPage.selectFile(checkboxTitle);
        assertTrue(checkBoxPage.isCheckboxSelected(checkboxTitle),
                "Checkbox is not selected or disabled");
    }

}
