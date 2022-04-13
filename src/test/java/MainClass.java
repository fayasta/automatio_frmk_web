import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.AuthenticationPage;
import pages.CreateAccountPage;
import pages.NavigationPage;

public class MainClass {


    public static void main(String[] args){
        openChromeBrowser();
    }

    public static void openChromeBrowser(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");

        NavigationPage navigationPage = new NavigationPage(driver);
        navigationPage.clickOnSignIn();

        AuthenticationPage authenticationPage = navigationPage.clickOnSignIn();

        CreateAccountPage createAccountPage = authenticationPage.completeRegistration();

        createAccountPage.completeAccountForm();

    }

    public static WebDriver setCapabilities(){

        ChromeOptions options = new ChromeOptions();
  //      options.addArguments("--start-fullscreen");
        options.addArguments("--window-size=1000,500");

        return new ChromeDriver(options);

    }



}
