package Pages;
import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    @FindBy(css="input[formcontrolname='username']")
    public WebElement username;

    @FindBy(css="input[formcontrolname='password']")
    public WebElement password;

    @FindBy(css="button[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(css="span[class='mat-mdc-tooltip-trigger logo-text']")
    public WebElement textTechnoStudy;

    @FindBy(css="//ms-add-button[contains(@tooltip,'ADD')]//buton")
    public WebElement addButton;
    @FindBy(xpath="//ms-text-field[@formcontrolname='name']//input")
    public WebElement nameInput;
    @FindBy(xpath="//ms-text-field[@formcontrolname='code']//input")
    public WebElement codeInput;
    @FindBy(xpath="//ms-save-button/button")
    public WebElement saveButton;
    @FindBy(xpath="//div[contains(text(),'successfully'")
    public WebElement successMessage;
}