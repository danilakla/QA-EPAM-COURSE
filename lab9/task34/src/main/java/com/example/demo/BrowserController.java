package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.List;

@RestController
public class BrowserController {

    @GetMapping("/test")
    public String uploadPhoto() {


//        // Save the photo to a temporary location for Selenium to pick up
//        File tempFile=null;
//        try {
//            tempFile = File.createTempFile("upload", photo.getOriginalFilename());
//            photo.transferTo(tempFile);
//        } catch (IOException e) {
//            e.printStackTrace();
//
//        }
        WebDriver driver=new EdgeDriver();
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
//        WebElement fileInput = driver.findElement(By.className("al-hidden"));
////        fileInput.sendKeys(tempFile.getAbsolutePath());
//
//        List<WebElement> imgElements = driver.findElements(By.tagName("img"));
//        String imgSrc = imgElements.get(2).getAttribute("src");
    return "dsds";


    }
    @PostMapping("/upload-endpoint")
    public ResponseEntity<byte[]> handleFileUpload(@RequestParam("file") MultipartFile file) throws IOException {
        // Your logic to handle the file data
        // You can now get the byte[] using file.getBytes()

            byte[] result = file.getBytes();
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.IMAGE_PNG); // or MediaType.IMAGE_JPEG
            return new ResponseEntity<>(result, headers, HttpStatus.OK);
    }
}
