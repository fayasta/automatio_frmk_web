package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount extends BasePage{

    @FindBy(id = "id_gender1")
    private WebElement genderMale;

    @FindBy(id= "customer_firstname" )
    private WebElement cus_firstName;

    @FindBy(id = "customer_lastname")
    private WebElement cus_lastName;

    @FindBy(id = "passwd")
    private WebElement cus_pswd;

    @FindBy(id = "days")
    private WebElement dob_days;

    @FindBy(id = "months")
    private WebElement dob_month;

    @FindBy(id = "years")
    private WebElement dob_year;

    @FindBy(id = "firstname")
    private WebElement firstname;

    @FindBy(id = "lastname")
    private WebElement lastname;

    @FindBy(id = "company")
    private WebElement company;

    @FindBy(id = "address1")
    private WebElement address1;

    @FindBy(id = "city")
    private WebElement city;

    @FindBy(id = "id_state")
    private WebElement state;

    @FindBy(id = "postcode")
    private WebElement postcode;

    @FindBy(id = "id_country")
    private WebElement country;

    @FindBy(id = "other")
    private WebElement other;

    @FindBy(id = "phone")
    private WebElement home_phone;

    @FindBy(id = "phone_mobile")
    private WebElement phone_mobile;

    @FindBy(id = "alias")
    private WebElement alias;

    @FindBy(id = "submitAccount")
    private WebElement submitAccount;


    public CreateAccount(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void completeAccountForm(){
       wait.until(ExpectedConditions.visibilityOf(genderMale)).click();

       cus_firstName.click();
       cus_firstName.sendKeys("testFName");

       cus_lastName.click();
       cus_lastName.sendKeys("testLName");

       cus_pswd.click();
       cus_pswd.sendKeys("testPwd");

       Select dob_days1 = new Select(dob_days);
       dob_days1.selectByIndex(23);

       Select dob_month1 = new Select(dob_month);
       dob_month1.selectByIndex(6);

       Select dob_year1 = new Select(dob_year);
       dob_year1.selectByIndex(39);

       firstname.click();
       firstname.sendKeys("addressFName");

       lastname.click();
       lastname.sendKeys("addressLName");

       company.click();
       company.sendKeys("testCompany");

       address1.click();
       address1.sendKeys("1313 Mockingbird Lane");

       city.click();
       city.sendKeys("Caldwell");

       Select state1 = new Select(state);
       state1.selectByIndex(6);

       postcode.click();
       postcode.sendKeys("07006");

       Select country1 = new Select(country);
       country1.selectByValue("21");

       other.click();
       other.sendKeys("test test test");

       home_phone.click();
       home_phone.sendKeys("2016515442");

       phone_mobile.click();
       phone_mobile.sendKeys("3087430127");

       alias.click();
       alias.sendKeys("test alias");

       submitAccount.click();

    }
}
