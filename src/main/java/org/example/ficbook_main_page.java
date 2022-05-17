package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.sql.DriverManager.getDriver;

public class ficbook_main_page extends abstract_page {

    @FindBy(css = "div.orb-nav-section.orb-nav-links.orb-nav-focus>ul>li.orb-nav-sport>a")
    private WebElement sport;

    @FindBy(css = "div.orb-nav-section.orb-nav-links.orb-nav-focus>ul>li.orb-nav-reeldotcom>a")
    private WebElement reel;

    @FindBy(css = "div.orb-nav-section.orb-nav-links.orb-nav-focus>ul>li.orb-nav-worklife>a")
    private WebElement worklife;

    @FindBy(css = "div.orb-nav-section.orb-nav-links.orb-nav-focus>ul>li.orb-nav-traveldotcom>a")
    private WebElement travel;

    @FindBy(id = "idcta-username")
    private WebElement signIn;
    private String https;
    private Object ficbook;

    public ficbook_main_page(WebDriver driver){
        super(driver);

    }

    public void go_to_account_page(){
        signIn.click();
        new WebDriverWait(getDriver(ficbook.net/authors), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("https://ficbook.net/authors/"));

    }

    public void navigateToSport(){
        this.sport.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("sport"));
    }

    public void navigateToTravel(){
        this.travel.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("travel"));
    }

    public void navigateToWorklife(){
        this.worklife.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("worklife"));
    }

    public void navigateToReal(){
        this.reel.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("reel"));
    }

}

}
