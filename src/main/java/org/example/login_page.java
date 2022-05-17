package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static java.sql.DriverManager.getDriver;

public class login_page extends abstract_page {


        @FindBy(id = "user-identifier-input")
        private WebElement login;

        @FindBy(id = "password")
        private WebElement password;

        @FindBy(id="password-input")
        private WebElement passwordInput;

        @FindBy(id = "submit-button")
        private WebElement submit;


        public login_page(WebDriver driver){

            super(driver);
        }

        public void loginIn(){
            this.submit.click();
        }

        public login_page setLogin(String login){
            this.login.sendKeys(login);
            return this;
        }

        public login_page setPassword(String password){
            this.password.click();
            this.passwordInput.sendKeys(password);
            return this;
        }

        public void loginIn(String login, String password){

            Actions loginIn = new Actions(getDriver());
            loginIn
                    .sendKeys(this.login,login)
                    .click(this.password)
                    .sendKeys(password)
                    .click(this.submit)
                    .build()
                    .perform();
        }

    }
