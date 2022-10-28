package slider;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class SliderTest extends BaseTests {


    @Test
    public  void testSlider(){

       var sliderPage = homePage.clickHorizontalSlider();
       sliderPage.clickSlider();
       sliderPage.moveSlider();
       sliderPage.severalmoves(2);
       assertTrue(sliderPage.getResult().contains("4"));
    }
}
