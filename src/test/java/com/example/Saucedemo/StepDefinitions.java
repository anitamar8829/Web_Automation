package com.example.Saucedemo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class StepDefinitions {
    WebDriver driver;

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @When("the user enters valid credentials")
    public void theUserEntersValidCredentials() {
        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
    }

    @When("the user leaves username and password fields blank")
    public void theUserLeavesUsernameAndPasswordFieldsBlank() {
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
    }

    @When("the user enters an invalid username and invalid password")
    public void theUserEntersInvalidCredentials() {
        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        username.sendKeys("invalid_user");
        password.sendKeys("invalid_password");
    }

    @When("clicks the login button")
    public void clicksTheLoginButton() {
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
    }

    @Then("the user should be redirected to the inventory page")
    public void theUserShouldBeRedirectedToTheInventoryPage() {
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        Assert.assertEquals("User is not on the inventory page", expectedUrl, driver.getCurrentUrl());
        driver.quit();
    }

    @Then("an error message should be displayed")
    public void anErrorMessageShouldBeDisplayed() {
        WebElement errorMessage = driver.findElement(By.cssSelector("h3[data-test='error']"));
        Assert.assertTrue("Error message is not displayed", errorMessage.isDisplayed());
        driver.quit();
    }
}
