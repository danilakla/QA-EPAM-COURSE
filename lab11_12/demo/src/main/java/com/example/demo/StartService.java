package com.example.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.springframework.stereotype.Service;

public class StartService {
    private WebDriver driver;
    public StartService(WebDriver driver) {
    this.driver=driver;

    }

    public void test1() throws InterruptedException {
        StartUpPage audiHomePagePF =
                new StartUpPage(driver).openPage()
                        .enterEmail("xxxxxx")
                        .enterPassword("xxxxxx")
                        .clickLoginButton().enterSearchKeyword("google").clickOtherinfo().clickFiletBYcOMP().startFolow();

    }

    public void test2() throws InterruptedException {
        StartUpPage audiHomePagePF =
                new StartUpPage(driver).openPage()
                        .enterEmail("xxxxxx")
                        .enterPassword("xxxxxx")
                        .clickLoginButton().clickNetwork().unfolowCompany();


    }

    public void test3() throws InterruptedException {

        StartUpPage audiHomePagePF =
                new StartUpPage(driver).openPage()
                        .enterEmail("xxxxxx")
                        .enterPassword("xxxxxx")
                        .clickLoginButton().enterSearchKeyword("google");

    }

    public void test4() throws InterruptedException {

        StartUpPage audiHomePagePF =
                new StartUpPage(driver).openPage()
                        .enterEmail("xxxxxx")
                        .enterPassword("xxxxxx")
                        .clickLoginButton().goToProfile().clickEditBtn().enterSearchKeywordForEditSeconName("1")
                        .saveEditInform();

    }

    public void test5() throws InterruptedException {
        StartUpPage audiHomePagePF =
                new StartUpPage(driver).openPage()
                        .enterEmail("xxxxxx")
                        .enterPassword("xxxxxx")
                        .clickLoginButton()
                        .clickMessage()
                        .openGif()
                        .sendgift();

    }

    public void test6() throws InterruptedException {

        StartUpPage audiHomePagePF =
                new StartUpPage(driver).openPage()
                        .enterEmail("xxxxxx")
                        .enterPassword("xxxxxx")
                        .clickLoginButton()
                        .likePost();
    }

    public void test7() throws InterruptedException {

        StartUpPage audiHomePagePF =
                new StartUpPage(driver).openPage()
                        .enterEmail("xxxxxx")
                        .enterPassword("xxxxxx")
                        .clickLoginButton()
                        .clickMessage()
                        .hoverToOption()
                        .clickToOption()
                        .markAsUnread();
    }

    public void test8() throws InterruptedException {
        StartUpPage audiHomePagePF =
                new StartUpPage(driver).openPage()
                        .enterEmail("xxxxxx")
                        .enterPassword("xxxxxx")
                        .clickLoginButton()
                        .clickMessage()
                        .hoverToOption()
                        .clickToOption()
                        .archiveUser();


    }

    public void test9() throws InterruptedException {
        StartUpPage audiHomePagePF =
                new StartUpPage(driver).openPage()
                        .enterEmail("xxxxxx")
                        .enterPassword("xxxxxx")
                        .clickLoginButton()
                        .clickMessage()
                        .hoverToOption()
                        .clickToOption()
                        .markAsImportan();


    }

    public void test10() throws InterruptedException {
        StartUpPage audiHomePagePF =
                new StartUpPage(driver).openPage()
                        .enterEmail("xxxxxx")
                        .enterPassword("xxxxxx")
                        .clickLoginButton()
                        .clickMessage()
                        .hoverToOption()
                        .clickToOption()
                        .turnoffMicro();


    }
}
