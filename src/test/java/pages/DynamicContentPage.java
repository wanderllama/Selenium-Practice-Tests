package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class DynamicContentPage extends BasePage {

    public DynamicContentPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='large-2 columns']//img")
    public List<WebElement> icons;

    @FindBy(xpath = "//div[@class='large-10 columns']")
    public List<WebElement> description;

    public List<String> getTextFromAll(List<WebElement> elements, String type) throws RuntimeException {
        List<String> allTexts;
        switch (type) {
            case "getText":
                allTexts = new ArrayList<>();
                for (WebElement description : elements) {
                    allTexts.add(description.getText());
                }
                break;
            case "getSrc":
                allTexts = new ArrayList<>();
                for (WebElement icon : elements) {
                    allTexts.add(icon.getAttribute("href"));
                }
                break;
            default:
                throw new RuntimeException("wrong type provided to getTextFromAll");
        }
        return allTexts;
    }
}
