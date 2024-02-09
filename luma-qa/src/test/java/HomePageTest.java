import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.robertgluszkiewicz.luma.pages.common.MenPageBase;
import com.robertgluszkiewicz.luma.pages.common.SalePageBase;
import com.robertgluszkiewicz.luma.pages.common.TrainingPageBase;
import com.robertgluszkiewicz.luma.pages.common.WhatsNewPageBase;
import com.robertgluszkiewicz.luma.pages.common.WomenPageBase;
import com.robertgluszkiewicz.luma.pages.desktop.HomePage;
import com.zebrunner.carina.core.AbstractTest;

public class HomePageTest extends AbstractTest {
    private WebDriver driver;
    private HomePage homePage;

    @BeforeTest
    public void beforeTest(){
        driver = getDriver();
        homePage = new HomePage(driver);
        homePage.open();
    }

    @Test
    public void testOpenHomePage() {
        assertTrue(homePage.isPageOpened(),"Home page is not opened");
    }

    @Test
    public void testOpenWhatsNewPage() {
        WhatsNewPageBase whatsNewPage = homePage.openWhatsNewPage();
        assertTrue(whatsNewPage.isPageOpened(),"What's new page is not opened");
    }

    @Test
    public void testOpenSalePage() {
        SalePageBase salePage = homePage.openSalePage();
        assertTrue(salePage.isPageOpened(),"Sale page is not opened");
    }

    @Test
    public void testOpenWomanPage() {
        WomenPageBase womenPage = homePage.openWomenPage();
        assertTrue(womenPage.isPageOpened(),"Women page is not opened");
    }

    @Test
    public void testOpenMenPage() {
        MenPageBase menPage = homePage.openMenPage();
        assertTrue(menPage.isPageOpened(),"Men page is not opened");
    }

    @Test
    public void testOpenTrainingPage() {
        TrainingPageBase trainingPage = homePage.openTrainingPage();
        assertTrue(trainingPage.isPageOpened(),"Training page is not opened");
    }
}
