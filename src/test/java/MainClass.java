import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.AuthenticationPage;
import pages.CreateAccount;
import pages.NavigationPage;

public class MainClass {

    public static void main(String[] args){

        openChromeBrowser();

    }

    public static void openChromeBrowser(){

        // String chromeDriverPath = basePath.concat(driverFolderPath).concat("chromedriver.exe");
        // System.setProperty("webdriver.chrome.driver",chromeDriverPath);
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        // WebDriver driver = setCapabilities();

        driver.get("http://automationpractice.com/index.php");

        NavigationPage navigationPage = new NavigationPage(driver);
        AuthenticationPage authenticationPage = navigationPage.clickOnSignIn();
        CreateAccount createAccount = authenticationPage.completeRegistration();
        createAccount.completeAccountForm();

    }

    public static WebDriver setCapabilities(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-fullscreen");

        return new ChromeDriver(options);
    }
}
