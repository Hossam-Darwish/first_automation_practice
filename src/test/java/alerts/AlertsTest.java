package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AlertsTest extends BaseTests {
    @Test
    public void testAlert(){
        var contextPage= homePage.clickContextMenu();
        contextPage.rightclick();
        String alertMessage = contextPage.getAlertText();
        contextPage.acceptAlert();
        assertTrue(alertMessage.contains("You selected a context menu"));

    }
}

