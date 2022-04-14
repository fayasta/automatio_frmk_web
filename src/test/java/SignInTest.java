import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AuthenticationPage;
import pages.CreateAccount;
import pages.NavigationPage;

public class SignInTest extends BaseTest{

    @Test
    public void signInTest(){
        NavigationPage navigationPage = new NavigationPage(driver);
        navigationPage.clickOnSignIn();
        AuthenticationPage authenticationPage = navigationPage.clickOnSignIn();
        CreateAccount createAccount = authenticationPage.completeRegistration();
        createAccount.completeAccountForm();
        navigationPage = new NavigationPage(driver);
        String varUserName = navigationPage.getUserName();

        Assert.assertEquals(varUserName,"testFName testLName");
    }
}
