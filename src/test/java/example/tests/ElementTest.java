package example.tests;

import org.junit.jupiter.api.Test;


public class ElementTest extends BaseTest {

    @Test
    public void launchElementTest() {
        elementPage.openPage();
        elementPage.fillForm();
        elementPage.checkResultForm();
    }

}
