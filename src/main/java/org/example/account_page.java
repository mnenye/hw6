package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class account_page extends abstract_page {

        @FindBy(xpath = ".//span[text()='Sign out']")
        private WebElement exit;

        public account_page(WebDriver driver){
            super(driver);

        }


        public void logOut(){
            this.exit.click();

        }
}
