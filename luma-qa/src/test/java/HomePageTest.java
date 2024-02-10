import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.robertgluszkiewicz.luma.gui.components.ProductItem;
import com.robertgluszkiewicz.luma.gui.pages.common.GearPageBase;
import com.robertgluszkiewicz.luma.gui.pages.common.MenPageBase;
import com.robertgluszkiewicz.luma.gui.pages.common.SalePageBase;
import com.robertgluszkiewicz.luma.gui.pages.common.TrainingPageBase;
import com.robertgluszkiewicz.luma.gui.pages.common.WhatsNewPageBase;
import com.robertgluszkiewicz.luma.gui.pages.common.WomenPageBase;
import com.robertgluszkiewicz.luma.gui.pages.desktop.HomePage;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;

public class HomePageTest implements IAbstractTest {
    private WebDriver driver;
    private HomePage homePage;

    @BeforeMethod
    public void beforeMethod(){
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
    public void testOpenGearPage() {
        GearPageBase gearPage = homePage.openGearPage();
        assertTrue(gearPage.isPageOpened(),"Gear page is not opened");
    }

    @Test
    public void testOpenTrainingPage() {
        TrainingPageBase trainingPage = homePage.openTrainingPage();
        assertTrue(trainingPage.isPageOpened(),"Training page is not opened");
    }

    @Test
    public void testByElementOpeningStrategy(){
        MenPageBase menPage = homePage.openMenPage();
        menPage.setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        assertTrue(menPage.isPageOpened(), "Men page is not opened");
    }

    @Test
    public void testByUrlAndElementOpeningStrategy() {
        MenPageBase menPage = homePage.openMenPage();
        menPage.setPageOpeningStrategy(PageOpeningStrategy.BY_URL_AND_ELEMENT);
        assertTrue(menPage.isPageOpened(), "Men page is not opened");
    }

    @Test
    public void shouldFindProduct() {
        String existingProduct = "Jacket";

        List<ProductItem> products = homePage.searchProduct(existingProduct);
        assertFalse(products.isEmpty(), "Products not found!");
        SoftAssert softAssert = new SoftAssert();
        for (ProductItem item : products) {
            System.out.println(item.readName());
            softAssert.assertTrue(StringUtils.containsIgnoreCase(item.readName(), existingProduct),
                    "Invalid search results for " + item.readName());
        }
        softAssert.assertAll();
    }

    @Test
    public void shouldNotFindProduct() {
        String nonExistentProduct = "!@#$#";

        List<ProductItem> products = homePage.searchProduct(nonExistentProduct);
        assertTrue(products.isEmpty(), "Products not found!");
    }
}
