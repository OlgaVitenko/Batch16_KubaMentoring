package lambda_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test1 {
    @Test()
    public void TC_01() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://www.lambdatest.com/selenium-playground");
        WebElement inputForm = driver.findElement(By.xpath("//a[contains(text(),'Input Form')]"));
        inputForm.click();
        WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
        name.sendKeys("Olga");
        WebElement email = driver.findElement(By.xpath("//input[@id='inputEmail4']"));
        email.sendKeys("olga@gmail.com");
        WebElement password = driver.findElement(By.xpath("//input[@id='inputPassword4']"));
        password.sendKeys("Password");
        WebElement company = driver.findElement(By.xpath("//input[@id='company']"));
        company.sendKeys("Company");
        WebElement website = driver.findElement(By.xpath("//input[@id='websitename']"));
        website.sendKeys("//websiteName");
        WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
        country.sendKeys("United States");
        WebElement city = driver.findElement(By.xpath("//input[@id='inputCity']"));
        city.sendKeys("Sun Prairie");
        WebElement address = driver.findElement(By.xpath("//input[@id='inputAddress1']"));
        address.sendKeys("123 Main St");
        WebElement address2 = driver.findElement(By.xpath("//input[@id='inputAddress2']"));
        address2.sendKeys("123 W main St");
        WebElement state = driver.findElement(By.xpath("//input[@id='inputState']"));
        state.sendKeys("WI");
        WebElement zip = driver.findElement(By.xpath("//input[@id='inputZip']"));
        zip.sendKeys("24567");
        WebElement submitButton = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
//        Thread.sleep(1000);
//        submitButton.click();
//        Thread.sleep(2500);
//        WebElement actualText = driver.findElement(By.cssSelector(".success-msg "));
//        Assert.assertTrue(actualText.toString().contains("Thanks"));

    }
}
