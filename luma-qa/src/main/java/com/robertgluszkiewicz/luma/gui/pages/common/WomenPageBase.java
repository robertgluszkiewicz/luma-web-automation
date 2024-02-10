package com.robertgluszkiewicz.luma.gui.pages.common;

import org.openqa.selenium.WebDriver;

import com.zebrunner.carina.webdriver.gui.AbstractPage;

public abstract class WomenPageBase extends AbstractPage {
    public WomenPageBase(WebDriver driver) {
        super(driver);
        this.setPageURL("/women.html");
    }

    @Override
    public void open() {
        super.open();
    }
}
