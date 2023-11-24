package com.example.demo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.Assert;
import org.testng.annotations.Listeners;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;

@SpringBootTest

public class LinkedInSearchTest {

	@Value("password")
	private  String password;

	@Value("username")
	private  String username;
	@Value("test123")
	private  String testtp;
	private WebDriver driver;

	@BeforeEach
	public void setUp() throws InterruptedException {
		driver = new EdgeDriver();

	}

	@Test
	public  void folow() throws InterruptedException {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		try {
			StartUpPage audiHomePagePF =
					new StartUpPage(driver).openPage()
							.enterEmail("xxxxxx")
							.enterPassword("xxxxxx")
							.clickLoginButton().enterSearchKeyword("google").clickOtherinfo().clickFiletBYcOMP().startFolow();

			Thread.sleep(4000);
		} finally {
			// Clean up
			driver.quit();
			LoggerService.log("success");
		}
	}

	@Test
	public  void unfolow() throws InterruptedException {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		try {
			StartUpPage audiHomePagePF =
					new StartUpPage(driver).openPage()
							.enterEmail("xxxxxx")
							.enterPassword("xxxxxx")
							.clickLoginButton().clickNetwork().unfolowCompany();

			Thread.sleep(4000);
		} finally {
			// Clean up
			driver.quit();
		}
	}

	@Test
	public void testSearchFunctionality() throws InterruptedException {
		// Setup the WebDriver and open LinkedIn
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		try {
			StartUpPage audiHomePagePF =
					new StartUpPage(driver).openPage()
							.enterEmail("xxxxxx")
							.enterPassword("xxxxxx")
							.clickLoginButton().enterSearchKeyword("google");

			Thread.sleep(4000);
		} finally {
			// Clean up
			driver.quit();
		}
	}


	@Test
	public void editProfile() throws InterruptedException {
		// Setup the WebDriver and open LinkedIn
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		try {
			StartUpPage audiHomePagePF =
					new StartUpPage(driver).openPage()
							.enterEmail("xxxxxx")
							.enterPassword("xxxxxx")
							.clickLoginButton().goToProfile().clickEditBtn().enterSearchKeywordForEditSeconName("1")
							.saveEditInform();

			Thread.sleep(4000);
		} finally {
			// Clean up
			driver.quit();
		}
	}


	@Test
	public void sendMessage() throws InterruptedException {
		// Setup the WebDriver and open LinkedIn
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		try {
			StartUpPage audiHomePagePF =
					new StartUpPage(driver).openPage()
							.enterEmail("xxxxxx")
							.enterPassword("xxxxxx")
							.clickLoginButton()
							.clickMessage()
							.openGif()
							.sendgift();

			Thread.sleep(4000);
		} finally {
			// Clean up
			driver.quit();
		}
	}

	@Test
	public void reactToPostLike() throws InterruptedException {
		// Setup the WebDriver and open LinkedIn
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		try {
			StartUpPage audiHomePagePF =
					new StartUpPage(driver).openPage()
							.enterEmail("xxxxxx")
							.enterPassword("xxxxxx")
							.clickLoginButton()
									.likePost();

			Thread.sleep(4000);
		} finally {
			// Clean up
			driver.quit();
		}
	}

	@Test
	public void markAsUnread() throws InterruptedException {
		// Setup the WebDriver and open LinkedIn
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		try {
			StartUpPage audiHomePagePF =
					new StartUpPage(driver).openPage()
							.enterEmail("xxxxxx")
							.enterPassword("xxxxxx")
							.clickLoginButton()
							.clickMessage()
							.hoverToOption()
							.clickToOption()
							.markAsUnread();

			Thread.sleep(4000);
		} finally {
			// Clean up
			driver.quit();
		}
	}

	@Test
	public void markarchiveUser() throws InterruptedException {
		// Setup the WebDriver and open LinkedIn
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		try {
			StartUpPage audiHomePagePF =
					new StartUpPage(driver).openPage()
							.enterEmail("xxxxxx")
							.enterPassword("xxxxxx")
							.clickLoginButton()
							.clickMessage()
							.hoverToOption()
							.clickToOption()
							.archiveUser();

			Thread.sleep(4000);
		} finally {
			// Clean up
			driver.quit();
		}
	}

	@Test
	public void markAsImportant() throws InterruptedException {
		// Setup the WebDriver and open LinkedIn
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		try {
			StartUpPage audiHomePagePF =
					new StartUpPage(driver).openPage()
							.enterEmail("xxxxxx")
							.enterPassword("xxxxxx")
							.clickLoginButton()
							.clickMessage()
							.hoverToOption()
							.clickToOption()
							.markAsImportan();

			Thread.sleep(4000);
		} finally {
			// Clean up
			driver.quit();
		}
	}



	@Test
	public void markAsMute() throws InterruptedException {
		// Setup the WebDriver and open LinkedIn
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		try {
			StartUpPage audiHomePagePF =
					new StartUpPage(driver).openPage()
							.enterEmail("xxxxxx")
							.enterPassword("xxxxxx")
							.clickLoginButton()
							.clickMessage()
							.hoverToOption()
							.clickToOption()
							.turnoffMicro();

			Thread.sleep(4000);
		} finally {
			// Clean up
			driver.quit();
		}
	}



}