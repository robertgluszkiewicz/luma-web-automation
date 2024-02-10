package com.robertgluszkiewicz.luma.gui.pages.desktop;

import org.openqa.selenium.WebDriver;

import com.robertgluszkiewicz.luma.gui.pages.common.GearPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = GearPageBase.class)
public class GearPage extends GearPageBase {
    public GearPage(WebDriver driver) {
        super(driver);
    }
}
