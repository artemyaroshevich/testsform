package example.tests;

import example.pages.RadioButtonPage;
import org.junit.jupiter.api.Test;

public class RadioButtonTest extends BaseTest {

    @Test
    public void radioButtonTest() {
        RadioButtonPage radioButtonPage = new RadioButtonPage();
        radioButtonPage.open();
        radioButtonPage.clickButton();

    }
}
