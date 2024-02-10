package com.robertgluszkiewicz.luma.gui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;

public class ProductItem extends AbstractUIObject {

    @FindBy(xpath="//a[@class='product-item-link']")
    public ExtendedWebElement productName;

    public ProductItem(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public String readName() {
        return productName.getText();
    }
}
