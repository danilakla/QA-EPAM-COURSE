package com.example.demotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartUpPage extends AbstractPage {
    private static final String HOMEPAGE_URL ="https://www.linkedin.com/login";

    public StartUpPage(WebDriver driver) {
        super(driver);
    }

    public StartUpPage openPage() {
        super.driver.get(HOMEPAGE_URL);
        return this;
    }


    @FindBy(id = "username")
    private WebElement emailElem;

    @FindBy(id = "password")
    private WebElement passwordElem;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    @FindBy(xpath = "//input[@placeholder='Поиск']")
    private WebElement searchBox;
    @FindBy(xpath = "//input[@placeholder='Поиск']")
    private WebElement networkButn;
    //input[@placeholder='Поиск']
    @FindBy(xpath = "//div[contains(@class, 'search-global-typeahead__overlay')]")
    private WebElement resultList;

    public StartUpPage clickSearchBox() {
        searchBox.click();
        return  this;

    }

        public StartUpPage clickOtherinfo(){
            WebElement divElement = driver.findElement(By.className("basic-typeahead__triggered-content"));
        divElement.click();
                return  this;
    }
    public  StartUpPage clickFiletBYcOMP(){
            driver.get("https://www.linkedin.com/search/results/COMPANIES/?keywords=google&origin=SWITCH_SEARCH_VERTICAL&sid=wtZ");
        return  this;
    }


    public  StartUpPage startFolow(){
        WebElement spanElement = driver.findElement(By.xpath("//span[text()='Отслеживать']"));
        spanElement.click();
        return  this;

    }
    public StartUpPage enterSearchKeyword(String keyword) {
        WebElement searchBox = super.driver.findElement(By.xpath("//input[@placeholder='Поиск']"));
        searchBox.click();

        // Step 2: Start to write a characters
        searchBox.sendKeys("google");
        return  this;

    }

    public boolean areSearchResultsDisplayed() {
        return resultList.isDisplayed();
    }
    public StartUpPage enterEmail(String email) {
        emailElem.sendKeys(email);
        return  this;
    }

    public StartUpPage enterPassword(String password) {
        passwordElem.sendKeys(password);
        return  this;
    }

    public StartUpPage clickLoginButton() {
        loginButton.click();
        return  this;
    }


}