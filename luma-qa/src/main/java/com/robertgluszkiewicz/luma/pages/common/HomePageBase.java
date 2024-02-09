package com.robertgluszkiewicz.luma.pages.common;

import org.openqa.selenium.WebDriver;

import com.zebrunner.carina.webdriver.gui.AbstractPage;

public abstract class HomePageBase extends AbstractPage {
    public HomePageBase(WebDriver driver) {
        super(driver);
    }

    @Override
    public void open() {
        super.open();
    }

    public abstract MenPageBase openMenPage();
    public abstract SalePageBase openSalePage();
    public abstract TrainingPageBase openTrainingPage();
    public abstract WhatsNewPageBase openWhatsNewPage();
    public abstract WomenPageBase openWomenPage();
}
