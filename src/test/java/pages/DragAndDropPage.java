package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDropPage {

    public DragAndDropPage(WebDriver driver) {
        PageFactory.initElements(driver , this);
    }

    public String source = "//div[@id='column-a']";

    public String destination = "//div[@id='column-b']";

    @FindBy(id = "column-a")
    public WebElement boxA;

    @FindBy(id = "column-b")
    public WebElement boxB;
}
