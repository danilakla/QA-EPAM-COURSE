package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

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

    @FindBy(id = "password")
    private WebElement passwordElem1;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton2;

    @FindBy(xpath = "//input[@placeholder='Поиск']")
    private WebElement searchBox3;
    @FindBy(xpath = "//input[@placeholder='Поиск']")
    private WebElement networkButn4;
    //input[@placeholder='Поиск']
    @FindBy(xpath = "//div[contains(@class, 'search-global-typeahead__overlay')]")
    private WebElement resultList5;

    public StartUpPage clickSearchBox() {
        searchBox.click();
        return  this;

    }

    public  StartUpPage clickNetwork(){
        WebElement divElement = driver.findElements(By.className("app-aware-link")).get(2);

        divElement.click();
        driver.get("https://www.linkedin.com/mynetwork/network-manager/company/");
        return  this;
    }

    public  StartUpPage clickMessage(){
        WebElement divElement = driver.findElements(By.className("app-aware-link")).get(4);

        divElement.click();
//        driver.get("https://www.linkedin.com/mynetwork/network-manager/company/");
        return  this;
    }

    public  StartUpPage unfolowCompany(){
        WebElement divElement = driver.findElements(By.className("bnt-link-unflow")).get(2);
        return this;
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

    public StartUpPage clickLoginButton() throws InterruptedException {
        loginButton.click();
        Thread.sleep(25000);
        return  this;
    }
    public  StartUpPage goToProfile(){
        driver.get("https://www.linkedin.com/in/danila-kartuzov-737613252/");
        return  this;
    }

    public  StartUpPage clickEditBtn(){
        WebElement element = driver.findElements(By.cssSelector("[aria-label='Редактировать']")).get(1);
        element.click();
        return  this;
    }

    public StartUpPage enterSearchKeywordForEditSeconName(String keyword) {
        WebElement searchBox = super.driver.findElements(By.className("artdeco-text-input--input")).get(2);
        searchBox.click();

        // Step 2: Start to write a characters
        searchBox.sendKeys("1");
        return  this;

    }

    public  StartUpPage saveEditInform(){
        WebElement element = driver.findElement(By.cssSelector("[data-view-name='profile-form-save']"));
        element.click();
        return  this;
    }

    public  StartUpPage openGif(){
        WebElement element = driver.findElement(By.cssSelector("[title='Открыть клавиатуру GIF']"));
        element.click();
        return  this;
    }

    public  StartUpPage sendgift(){
        WebElement element = driver.findElement(By.className("tenor-gif__select-gif"));
        element.click();
        return  this;
    }

        public  StartUpPage likePost(){
            WebElement element = driver.findElement(By.cssSelector("[aria-label='Добавить реакцию «Нравится»']"));
            element.click();
            return  this;
        }

    public  StartUpPage hoverToOption(){
        WebElement element = driver.findElement(By.className("msg-conversation-card__content--selectable"));
        element.click();
        return  this;
    }

    public StartUpPage clickToOption(){

        WebElement element = driver.findElement(By.className("msg-conversation-card__inbox-shortcuts"));
        element.click();
        return  this;
    }

    public StartUpPage markAsUnread(){

//         WebElement element = driver.findElement(By.className("artdeco-dropdown__content-inner"));
//        String innerHTML = element.getAttribute("innerHTML");

        // Print the inner HTML
//        System.out.println(innerHTML);
         WebElement element = driver.findElements(By.className("artdeco-dropdown__item")).get(0);
         element.click();

        return  this;
    }
    public StartUpPage markAsRead(){

//         WebElement element = driver.findElement(By.className("artdeco-dropdown__content-inner"));
//        String innerHTML = element.getAttribute("innerHTML");

        // Print the inner HTML
//        System.out.println(innerHTML);
        WebElement element = driver.findElements(By.className("artdeco-dropdown__item")).get(0);
        element.click();

        return  this;
    }


    public StartUpPage markAsImportan(){

//         WebElement element = driver.findElement(By.className("artdeco-dropdown__content-inner"));
//        String innerHTML = element.getAttribute("innerHTML");

        // Print the inner HTML
//        System.out.println(innerHTML);
        WebElement element = driver.findElements(By.className("artdeco-dropdown__item")).get(1);
        element.click();

        return  this;
    }
    public StartUpPage markAsUnImportan(){

//         WebElement element = driver.findElement(By.className("artdeco-dropdown__content-inner"));
//        String innerHTML = element.getAttribute("innerHTML");

        // Print the inner HTML
//        System.out.println(innerHTML);
        WebElement element = driver.findElements(By.className("artdeco-dropdown__item")).get(1);
        element.click();

        return  this;
    }

    public StartUpPage turnoffMicro(){

//         WebElement element = driver.findElement(By.className("artdeco-dropdown__content-inner"));
//        String innerHTML = element.getAttribute("innerHTML");

        // Print the inner HTML
//        System.out.println(innerHTML);
        WebElement element = driver.findElements(By.className("artdeco-dropdown__item")).get(2);
        element.click();

        return  this;
    }

    public StartUpPage turnomMicro(){

//         WebElement element = driver.findElement(By.className("artdeco-dropdown__content-inner"));
//        String innerHTML = element.getAttribute("innerHTML");

        // Print the inner HTML
//        System.out.println(innerHTML);
        WebElement element = driver.findElements(By.className("artdeco-dropdown__item")).get(2);
        element.click();

        return  this;
    }

    public StartUpPage archiveUser(){

        WebElement element = driver.findElements(By.className("artdeco-dropdown__item")).get(3);
        element.click();

        return  this;
    }


}