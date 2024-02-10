package com.robertgluszkiewicz.luma.gui.pages.common;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.robertgluszkiewicz.luma.gui.components.ProductItem;
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
    public abstract GearPageBase openGearPage();
    public abstract SalePageBase openSalePage();
    public abstract TrainingPageBase openTrainingPage();
    public abstract WhatsNewPageBase openWhatsNewPage();
    public abstract WomenPageBase openWomenPage();
    public abstract List<ProductItem> searchProduct(String searchInput);
}
