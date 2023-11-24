package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.TimeUnit;

@SpringBootTest

public class TestwITHsERVOCE {
    private WebDriver driver;
    private StartService startService;

    @BeforeEach
    public void setUp() throws InterruptedException {
        driver = new EdgeDriver();
        startService = new StartService(driver);

    }

    @Test
    public  void test1() throws InterruptedException {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            startService.test1();
            Thread.sleep(4000);
        } finally {
            // Clean up
            driver.quit();

        }
        LoggerService.log("success");

    }

    @Test
    public  void test2() throws InterruptedException {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            startService.test2();
            Thread.sleep(4000);
        } finally {
            // Clean up
            driver.quit();
        }
        LoggerService.log("success");

    }

    @Test
    public  void test3() throws InterruptedException {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            startService.test3();
            Thread.sleep(4000);
        } finally {
            // Clean up
            driver.quit();
        }
        LoggerService.log("success");

    }

    @Test
    public  void test4() throws InterruptedException {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            startService.test4();
            Thread.sleep(4000);
        } finally {
            // Clean up
            driver.quit();
        }
        LoggerService.log("success");

    }

    @Test
    public  void test5() throws InterruptedException {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            startService.test5();
            Thread.sleep(4000);
        } finally {
            // Clean up
            driver.quit();
        }
        LoggerService.log("success");

    }
    @Test
    public  void test6() throws InterruptedException {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            startService.test6();
            Thread.sleep(4000);
        } finally {
            // Clean up
            driver.quit();
        }
        LoggerService.log("success");

    }
    @Test
    public  void test7() throws InterruptedException {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            startService.test7();
            Thread.sleep(4000);
        } finally {
            // Clean up
            driver.quit();
        }
        LoggerService.log("success");

    }
    @Test
    public  void test8() throws InterruptedException {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            startService.test8();
            Thread.sleep(4000);
        } finally {
            // Clean up
            driver.quit();
        }
        LoggerService.log("success");

    }
    @Test
    public  void test9() throws InterruptedException {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            startService.test9();
            Thread.sleep(4000);
        } finally {
            // Clean up
            driver.quit();
        }
        LoggerService.log("success");

    }
    @Test
    public  void test10() throws InterruptedException {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            startService.test10();
            Thread.sleep(4000);
        } finally {
            // Clean up
            driver.quit();
        }
        LoggerService.log("success");

    }

}
