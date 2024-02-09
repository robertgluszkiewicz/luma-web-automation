package com.robertgluszkiewicz.luma.pages.common;

import org.openqa.selenium.WebDriver;

import com.zebrunner.carina.webdriver.gui.AbstractPage;

public abstract class TrainingPageBase extends AbstractPage {
    public TrainingPageBase(WebDriver driver) {
        super(driver);
        this.setPageURL("/training.html");
    }

    @Override
    public void open() {
        super.open();
    }
}
