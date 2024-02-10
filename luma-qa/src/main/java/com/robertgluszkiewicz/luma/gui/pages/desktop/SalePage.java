package com.robertgluszkiewicz.luma.gui.pages.desktop;

import org.openqa.selenium.WebDriver;

import com.robertgluszkiewicz.luma.gui.pages.common.SalePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = SalePageBase.class)
public class SalePage extends SalePageBase {
    public SalePage(WebDriver driver) {
        super(driver);
    }
}
