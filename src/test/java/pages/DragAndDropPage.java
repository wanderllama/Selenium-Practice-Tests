package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage extends BasePage {

    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    public String source = "//div[@id='column-a']";

    public String destination = "//div[@id='column-b']";

    @FindBy(id = "column-a")
    public WebElement boxA;

    @FindBy(id = "column-b")
    public WebElement boxB;
}
