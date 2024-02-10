package com.robertgluszkiewicz.luma.gui.pages.desktop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.robertgluszkiewicz.luma.gui.pages.common.MenPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = MenPageBase.class)
public class MenPage extends MenPageBase {
    @FindBy(xpath="//h1[@id='page-title-heading']")
    private ExtendedWebElement pageTitle;
    public MenPage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(pageTitle);
    }
}
