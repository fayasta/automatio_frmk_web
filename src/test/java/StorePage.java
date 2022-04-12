import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class StorePage {

    public void loginStorePage(WebDriver driver){

        WebElement signInButton = driver.findElement(By.cssSelector("a.login"));
        signInButton.click();

        WebElement email = driver.findElement(By.id("email_create"));
        email.click();
        email.sendKeys(randoEmail());

        WebElement createAccount = driver.findElement(By.id("SubmitCreate"));
        createAccount.click();

        //WebElement gender1 = driver.findElement(By.id("id_gender1"));
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement waitCheckBoxes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_gender1")));
        waitCheckBoxes.click();

        WebElement cus_firstName = driver.findElement(By.id("customer_firstname"));
        cus_firstName.click();
        cus_firstName.sendKeys("testFName");

        WebElement cus_lastName = driver.findElement(By.id("customer_lastname"));
        cus_lastName.click();
        cus_lastName.sendKeys("testLName");

        WebElement cus_pswd = driver.findElement(By.id("passwd"));
        cus_pswd.click();
        cus_pswd.sendKeys("testPwd");

        Select dob_days = new Select(driver.findElement(By.id("days")));
        dob_days.selectByIndex(23);

        Select dob_month = new Select(driver.findElement(By.id("months")));
        dob_month.selectByIndex(6);

        Select dob_year = new Select(driver.findElement(By.id("years")));
        dob_year.selectByIndex(39);


    }

    public String randoEmail(){
        Random random = new Random();
        String baseEmail = "correo@gmail.com";
        return Integer.toString(random.nextInt(10000)).concat(baseEmail);
    }
}
