package com.robertgluszkiewicz.luma.pages.desktop;

import org.openqa.selenium.WebDriver;

import com.robertgluszkiewicz.luma.pages.common.TrainingPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = TrainingPageBase.class)
public class TrainingPage extends TrainingPageBase {
    public TrainingPage(WebDriver driver) {
        super(driver);
    }
}
