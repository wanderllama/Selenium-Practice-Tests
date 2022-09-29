package assessment;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.DragAndDropPage;
import util.Driver;
import util.UI_Util;

public class DragAndDrop extends Hooks {

    DragAndDropPage page = new DragAndDropPage(Driver.getDriver());

    @Test
    public void drag_and_drop_test() throws InterruptedException {
        Driver.getDriver().get("http://localhost:7080/drag_and_drop");

//        String originalTextA = page.boxA.getText();
        String originalTextB = page.boxB.getText();

        UI_Util.move_elements(page.boxA , page.boxB);

        String newTextA = page.boxA.getText();
//        String newTextB = page.boxB.getText();

        SoftAssert softAssert = new SoftAssert();

        Assert.assertEquals(newTextA , originalTextB , "drag and drop failed");
//        Assert.assertEquals(newTextB , originalTextA);
    }
}
