package com.robertgluszkiewicz.luma.pages.desktop;

import org.openqa.selenium.WebDriver;

import com.robertgluszkiewicz.luma.pages.common.MenPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = MenPageBase.class)
public class MenPage extends MenPageBase {
    public MenPage(WebDriver driver) {
        super(driver);
    }
}
