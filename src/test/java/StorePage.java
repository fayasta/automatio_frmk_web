import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class StorePage {

    public void loginStorePage(WebDriver driver){

        //Sign In Page
        WebElement signInButton = driver.findElement(By.cssSelector("a.login"));
        signInButton.click();

        //Create Account
        WebElement createAccountTextField = driver.findElement(By.id("email_create"));
        createAccountTextField.click();
        createAccountTextField.sendKeys(randomEmail());

        WebElement createAccountButton = driver.findElement(By.id("SubmitCreate"));
        createAccountButton.click();

        //User Form
  //      WebElement mrCheckBox = driver.findElement(By.id("id_gender1"));
        WebDriverWait wait = new WebDriverWait(driver,30);
        WebElement mrCheckBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_gender1")));
        mrCheckBox.click();

        WebElement dayBirthComboBox = driver.findElement(By.id("years"));
        Select daysSelect = new Select(dayBirthComboBox);
        daysSelect.selectByVisibleText("2012  ");

    }

    public String randomEmail(){
        Random random = new Random();
        String baseEmail = "correo90@correo80.com";
        return Integer.toString(random.nextInt(10000)).concat(baseEmail);
    }


}

