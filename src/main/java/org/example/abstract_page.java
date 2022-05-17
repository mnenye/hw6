package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class abstract_page {

    public abstract_page(WebDriver driver) {

    }

    public abstract class abstract_page0 {

        private WebDriver driver;

        public abstract_page0(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        protected WebDriver getDriver(){
            return this.driver;
        }
    }

}
