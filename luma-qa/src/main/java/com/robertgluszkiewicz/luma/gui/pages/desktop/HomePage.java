package com.robertgluszkiewicz.luma.gui.pages.desktop;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.robertgluszkiewicz.luma.gui.components.ProductItem;
import com.robertgluszkiewicz.luma.gui.pages.common.GearPageBase;
import com.robertgluszkiewicz.luma.gui.pages.common.HomePageBase;
import com.robertgluszkiewicz.luma.gui.pages.common.MenPageBase;
import com.robertgluszkiewicz.luma.gui.pages.common.SalePageBase;
import com.robertgluszkiewicz.luma.gui.pages.common.TrainingPageBase;
import com.robertgluszkiewicz.luma.gui.pages.common.WhatsNewPageBase;
import com.robertgluszkiewicz.luma.gui.pages.common.WomenPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {

    @FindBy(xpath="//a[@id='ui-id-3']")
    private ExtendedWebElement whatsNewButton;
    @FindBy(xpath="//a[@id='ui-id-4']")
    private ExtendedWebElement womenButton;
    @FindBy(xpath="//a[@id='ui-id-5']")
    private ExtendedWebElement menButton;
    @FindBy(xpath="//a[@id='ui-id-6']")
    private ExtendedWebElement gearButton;
    @FindBy(xpath="//a[@id='ui-id-7']")
    private ExtendedWebElement trainingButton;
    @FindBy(xpath="//a[@id='ui-id-8']")
    private ExtendedWebElement saleButton;
    @FindBy(xpath="//input[@id='search']")
    private ExtendedWebElement searchField;
    @FindBy(xpath="//button[@title='Search']")
    private ExtendedWebElement searchButton;

    @FindBy(xpath="//div[contains(@class, 'product details')]")
    private List<ProductItem> products;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public WhatsNewPageBase openWhatsNewPage() {
        whatsNewButton.click();
        return initPage(driver, WhatsNewPageBase.class);
    }

    @Override
    public SalePageBase openSalePage() {
        saleButton.click();
        return initPage(driver, SalePageBase.class);
    }

    @Override
    public WomenPageBase openWomenPage() {
        womenButton.click();
        return initPage(driver, WomenPageBase.class);
    }

    @Override
    public GearPageBase openGearPage() {
        gearButton.click();
        return initPage(driver, GearPageBase.class);
    }

    @Override
    public TrainingPageBase openTrainingPage() {
        trainingButton.click();
        return initPage(driver, TrainingPageBase.class);
    }

    @Override
    public MenPageBase openMenPage() {
        menButton.click();
        return  initPage(driver, MenPageBase.class);
    }

    @Override
    public List<ProductItem> searchProduct(String searchInput) {
        searchField.type(searchInput);
        searchButton.click();
        return products;
    }
}
