package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part1 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\faruk\\OneDrive\\Masaüstü\\selenium-java-4.3.0\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://demoqa.com/text-box");

        driver.manage().window().maximize();

        WebElement fullName = driver.findElement(By.cssSelector("input[placeholder='Full Name']"));
        String value = "Automation";
        fullName.sendKeys(value);

        WebElement eMail = driver.findElement(By.cssSelector("input[placeholder='name@example.com']"));
        String value2 = "Testing@gmail.com";
        eMail.sendKeys(value2);

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        String value3 = "Testing Current Address";
        currentAddress.sendKeys(value3);

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        String value4 = "Testing Permanent Address";
        permanentAddress.sendKeys(value4);

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        WebElement name = driver.findElement(By.id("name"));
        String tagName = name.getText();
        System.out.println(tagName);

        WebElement eMailFromWebsite = driver.findElement(By.id("email"));
        String mailAddress = eMailFromWebsite.getText();
        System.out.println(mailAddress);

        Thread.sleep(1000);

        WebElement currentAddressFromWebsite = driver.findElement(By.cssSelector(".border.col-md-12.col-sm-12>#currentAddress"));
        String currentAddressString = currentAddressFromWebsite.getText();
        System.out.println(currentAddressString);

        Thread.sleep(1000);

        WebElement permanentAddress2 = driver.findElement(By.cssSelector(".border.col-md-12.col-sm-12>#permanentAddress"));
        String permanentAddresString = permanentAddress2.getText();
        System.out.println(permanentAddresString);

        driver.quit();






    }
}
