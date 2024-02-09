package com.robertgluszkiewicz.luma.pages.desktop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.robertgluszkiewicz.luma.pages.common.HomePageBase;
import com.robertgluszkiewicz.luma.pages.common.MenPageBase;
import com.robertgluszkiewicz.luma.pages.common.SalePageBase;
import com.robertgluszkiewicz.luma.pages.common.TrainingPageBase;
import com.robertgluszkiewicz.luma.pages.common.WhatsNewPageBase;
import com.robertgluszkiewicz.luma.pages.common.WomenPageBase;
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
    @FindBy(xpath="//a[@id='ui-id-7']")

    private ExtendedWebElement trainingButton;
    @FindBy(xpath="//a[@id='ui-id-8']")

    private ExtendedWebElement saleButton;
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WhatsNewPageBase openWhatsNewPage() {
        whatsNewButton.click();
        return initPage(driver, WhatsNewPageBase.class);
    }

    public SalePageBase openSalePage() {
        saleButton.click();
        return initPage(driver, SalePageBase.class);
    }

    public WomenPageBase openWomenPage() {
        womenButton.click();
        return initPage(driver, WomenPageBase.class);
    }

    public TrainingPageBase openTrainingPage() {
        trainingButton.click();
        return initPage(driver, TrainingPageBase.class);
    }

    public MenPageBase openMenPage() {
        menButton.click();
        return  initPage(driver, MenPageBase.class);
    }
}
