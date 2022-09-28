package assessment;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.checkboxes;
import util.Driver;

import java.util.List;

public class CheckBoxes extends Hooks{

    checkboxes page = new checkboxes(Driver.getDriver());

    @Test
    public void checkboxes_test() {
        Driver.getDriver().get("http://localhost:7080/checkboxes");

        List<WebElement> allCheckBoxes = page.checkboxes;

        for (WebElement element : allCheckBoxes) {
            if (!element.isSelected()) {
                element.click();
            } else {
                element.click();
                Assert.assertFalse(element.isSelected());
                element.click();
            }
            Assert.assertTrue(element.isSelected());
        }
    }
}
