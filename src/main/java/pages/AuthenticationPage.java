package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Utilities;

public class AuthenticationPage extends BasePage{

    @FindBy(id = "email_create")
    private WebElement emailCreateField;

    @FindBy(id = "SubmitCreate")
    private WebElement createAccountButton;

    public AuthenticationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public CreateAccountPage completeRegistration(){
        //Create Account
        emailCreateField.click();
        emailCreateField.sendKeys(Utilities.randomEmail());

        createAccountButton.click();
        return new CreateAccountPage(driver);
    }
}
