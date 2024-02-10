package com.robertgluszkiewicz.luma.gui.pages.common;

import org.openqa.selenium.WebDriver;

import com.zebrunner.carina.webdriver.gui.AbstractPage;

public abstract class GearPageBase extends AbstractPage {
    public GearPageBase(WebDriver driver) {
        super(driver);
        setPageURL("/gear.html");
    }

    @Override
    public void open() {
        super.open();
    }
}
