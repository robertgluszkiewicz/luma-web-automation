package com.robertgluszkiewicz.luma.pages.desktop;

import org.openqa.selenium.WebDriver;

import com.robertgluszkiewicz.luma.pages.common.WomenPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = WomenPageBase.class)
public class WomenPage extends WomenPageBase {
    public WomenPage(WebDriver driver) {
        super(driver);
    }
}
