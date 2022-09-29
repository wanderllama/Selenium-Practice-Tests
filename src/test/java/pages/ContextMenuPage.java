package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContextMenuPage {

    public ContextMenuPage(WebDriver driver) {
        PageFactory.initElements(driver , this);
    }

    @FindBy(id = "hot-spot")
    public WebElement hotSpot;
}
