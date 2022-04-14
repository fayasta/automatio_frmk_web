package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationPage extends BasePage {

    @FindBy(css = "a.login")
    private WebElement signInButton;

    @FindBy(css = "a.account")
    private WebElement userName;

    public NavigationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public AuthenticationPage clickOnSignIn(){
        //Sign In Page
        signInButton.click();
        return new AuthenticationPage(driver);
    }

    public String getUserName(){
        return userName.getText();
    }
}
