package com.robertgluszkiewicz.luma.gui.pages.common;

import org.openqa.selenium.WebDriver;

import com.zebrunner.carina.webdriver.gui.AbstractPage;

public abstract class WhatsNewPageBase extends AbstractPage {
    public WhatsNewPageBase(WebDriver driver) {
        super(driver);
        this.setPageURL("/what-is-new.html");
    }

    @Override
    public void open() {
        super.open();
    }
}
