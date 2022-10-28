package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HorizontalSliderPage {
            private WebDriver driver;

            public HorizontalSliderPage(WebDriver driver){
                    this.driver = driver;
            }

            private By slider = By.tagName("input");
            private By result = By.id("range");


            public void clickSlider (){
                 driver.findElement(slider).click();
            }
    public void moveSlider (){
        driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
    }
    public void severalmoves (int n){
        for(int i=0; i<n;i++){
            moveSlider();
        }
    }
    public String getResult(){
        return    driver.findElement(result).getText();

    }

}
