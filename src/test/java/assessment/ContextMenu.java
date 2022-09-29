package assessment;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContextMenuPage;
import util.Driver;

public class ContextMenu extends Hooks {

    ContextMenuPage page = new ContextMenuPage(Driver.getDriver());

    @Test
    public void right_click_alert_trigger_test() {
        Driver.getDriver().get("http://localhost:7080/context_menu");

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(page.hotSpot).contextClick().build().perform();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver() , 15);

        if (wait.until(ExpectedConditions.alertIsPresent()) != null) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("alert is not present");
        }
    }
}
