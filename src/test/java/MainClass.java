import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MainClass {

    //private static String basePath = System.getProperty("user.dir");
    //private static String driverFolderPath = "/src/test/resources/drivers/";
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
        StorePage storePage = new StorePage();
        storePage.loginStorePage(driver);

    }

    public static WebDriver setCapabilities(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-fullscreen");

        return new ChromeDriver(options);
    }
}
