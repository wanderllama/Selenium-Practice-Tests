package assessment;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NewWindowPage;
import pages.OpeningNewWindowPage;
import util.Driver;

import java.util.Set;

public class OpeningNewWindow extends Hooks {

    OpeningNewWindowPage page = new OpeningNewWindowPage(Driver.getDriver());

    @Test
    public void open_in_new_tab_test() {
        Driver.getDriver().get("http://localhost:7080/windows");

        page.openNewWindowLink.click();

        String currentHandle = Driver.getDriver().getWindowHandle();
        Set<String> handles = Driver.getDriver().getWindowHandles();

        Assert.assertTrue(handles.size() != 1 , "new window not opened, getWindowHandles() only returned one handle");

        for (String handle : handles) {
            if (!handle.equals(currentHandle)) {
                Driver.getDriver().switchTo().window(handle);
            }
        }

        String expectedText = "New Window";
        String actualText = NewWindowPage.headerThree.getText();

        Assert.assertEquals(actualText , expectedText , "The header text of the new window is not correct. actualText: " + actualText + "\nexpectedText: " + expectedText);

    }
}
