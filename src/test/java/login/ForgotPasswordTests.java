package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordTests extends BaseTests {

    @Test
    public void testRetrievePassword(){
    ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
    forgotPasswordPage.setEmail("tau@example.com");
    EmailSentPage emailSentPage  = forgotPasswordPage.clickRetrieveButton();
    assertTrue(emailSentPage.getMessageError()
                    .contains("Internal Server Error"),
            "Alert text is incorrect");
    }
}
