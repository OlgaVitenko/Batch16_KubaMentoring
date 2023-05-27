package lambda_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utils.BrowserUtils;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class kuba {
    @Test
    public void TC_01() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://www.lambdatest.com/selenium-playground");

        WebElement tablePagination = driver.findElement(By.linkText("Table Pagination"));
        tablePagination.click();
        WebElement dropDown = driver.findElement(By.cssSelector("#maxRows"));
        Select select = new Select(dropDown);
        select.selectByIndex(0);
        List<WebElement> allNames = driver.findElements(By.xpath("//tr//td[2]"));
        List<WebElement> allEmails = driver.findElements(By.xpath("//tr//td[3]"));
        Map<String,String> map = new TreeMap<>();

                for(int i = 0; i < allNames.size(); i++){
                  map.put(allNames.get(i).getText().trim(),allEmails.get(i).getText().trim())  ;
                }
        System.out.println(map);
    }
    @Test
    public void TC_013() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://www.lambdatest.com/selenium-playground");

        WebElement tablePagination = driver.findElement(By.linkText("Table Pagination"));
        tablePagination.click();
        WebElement dropDown = driver.findElement(By.cssSelector("#maxRows"));
        Select select = new Select(dropDown);
        BrowserUtils.selectBy(dropDown,"5000","value");
        List<WebElement> names =  driver.findElements(By.xpath("//tr//td[2]"));
        List<WebElement> allNumbers = driver.findElements(By.xpath("//tr//td[4]"));

        Map<String, Long> map = new HashMap<>();
        for(int i = 0; i< names.size();i++){

            map.put(BrowserUtils.getText(names.get(i)),Long.parseLong(BrowserUtils.getText(allNumbers.get(i)).replace("-","")));

        }
        System.out.println(map);
        System.out.println( );
    }
}
