import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class StorePage {

    public void loginStorePage(WebDriver driver){

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

        WebElement address_firstName = driver.findElement(By.id("firstname"));
        address_firstName.click();
        address_firstName.sendKeys("addressFName");

        WebElement address_lastName = driver.findElement(By.id("lastname"));
        address_lastName.click();
        address_lastName.sendKeys("addressLName");

        WebElement company = driver.findElement(By.id("company"));
        company.click();
        company.sendKeys("testCompany");

        WebElement address1 = driver.findElement(By.id("address1"));
        address1.click();
        address1.sendKeys("1313 Mockingbird Lane");

        WebElement city = driver.findElement(By.id("city"));
        city.click();
        city.sendKeys("Calwell");

        Select state = new Select(driver.findElement(By.id("id_state")));
        state.selectByIndex(6);

        WebElement postcode = driver.findElement(By.id("postcode"));
        postcode.click();
        postcode.sendKeys("07006");

        Select country = new Select(driver.findElement(By.id("id_country")));
        country.selectByValue("21");

        WebElement addit_info = driver.findElement(By.id("other"));
        addit_info.click();
        addit_info.sendKeys("test test test");

        WebElement home_phone = driver.findElement(By.id("phone"));
        home_phone.click();
        home_phone.sendKeys("2015442");

        WebElement phone_mobile = driver.findElement(By.id("phone_mobile"));
        phone_mobile.click();
        phone_mobile.sendKeys("3087430127");

        WebElement alias = driver.findElement(By.id("alias"));
        alias.click();
        alias.sendKeys("test alias");

        WebElement submitAccount = driver.findElement(By.id("submitAccount"));
        submitAccount.click();

    }


}
