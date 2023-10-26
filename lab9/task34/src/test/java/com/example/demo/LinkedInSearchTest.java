package com.example.demo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;

@SpringBootTest
public class LinkedInSearchTest {

	private WebDriver driver;

	@BeforeEach
	public void setUp() {
		// Setup the WebDriver and open LinkedIn
		driver = new EdgeDriver();
		driver.get("https://www.linkedin.com/login");
		// Find the email input field and enter your email
		WebElement emailElem = driver.findElement(By.id("username"));
		emailElem.sendKeys("mail"); // Replace with your email

		// Find the password input field and enter your password
		WebElement passwordElem = driver.findElement(By.id("password"));
		passwordElem.sendKeys("password"); // Replace with your password

		// Find and click the login button
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
	}
	@Test
	public void testSearchFunctionality() {
		// Setup the WebDriver and open LinkedIn
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		try {
			// Step 1: Click on the "Search" input
			WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Поиск']"));
			searchBox.click();

			// Step 2: Start to write a characters
			searchBox.sendKeys("Selenium");

			// Step 3: Wait and ensure results are displayed
			WebElement resultList = driver.findElement(By.xpath("//div[contains(@class, 'search-global-typeahead__overlay')]"));
			if (resultList.isDisplayed()) {
				System.out.println("Search results are displayed based on the entered keyword.");
			} else {
				System.out.println("Search results are NOT displayed.");
			}
		} finally {
			// Clean up
			driver.quit();
		}
	}
}