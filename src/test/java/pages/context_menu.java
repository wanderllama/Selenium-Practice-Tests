package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class context_menu {

    public context_menu(WebDriver driver) {
        PageFactory.initElements(driver , this);
    }

    @FindBy(id = "hot-spot")
    public WebElement hotSpot;
}
