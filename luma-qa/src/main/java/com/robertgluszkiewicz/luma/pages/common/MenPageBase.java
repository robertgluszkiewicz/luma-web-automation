package com.robertgluszkiewicz.luma.pages.common;

import org.openqa.selenium.WebDriver;

import com.zebrunner.carina.webdriver.gui.AbstractPage;

public abstract class MenPageBase extends AbstractPage {
    public MenPageBase(WebDriver driver) {
        super(driver);
        this.setPageURL("/men.html");
    }

    @Override
    public void open() {
        super.open();
    }
}
