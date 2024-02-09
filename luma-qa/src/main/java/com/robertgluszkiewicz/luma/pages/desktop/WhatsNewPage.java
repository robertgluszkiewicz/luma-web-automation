package com.robertgluszkiewicz.luma.pages.desktop;

import org.openqa.selenium.WebDriver;

import com.robertgluszkiewicz.luma.pages.common.WhatsNewPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = WhatsNewPageBase.class)
public class WhatsNewPage extends WhatsNewPageBase {
    public WhatsNewPage(WebDriver driver) {
        super(driver);
    }
}
