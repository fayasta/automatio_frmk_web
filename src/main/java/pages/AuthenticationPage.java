package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Utilities;

public class AuthenticationPage  extends BasePage{

    @FindBy(id = "email_create")
    private WebElement emailCreate;

    @FindBy(id = "SubmitCreate")
    private WebElement submitCreate;


    public AuthenticationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public CreateAccount completeRegistration(){

        emailCreate.click();
        emailCreate.sendKeys(Utilities.randomEmail());

        submitCreate.click();
        return new CreateAccount(driver);
    }



}
