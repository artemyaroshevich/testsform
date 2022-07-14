package example.tests;

import org.junit.jupiter.api.Test;


public class TextBoxTest extends BaseTest {

    @Test
    public void launchElementTest() {
        textBoxPage.openPage();
        textBoxPage.fillForm();
        textBoxPage.checkResultForm();
    }

}
