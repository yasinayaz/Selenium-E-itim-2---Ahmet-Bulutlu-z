package ActionClass_06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class ActionsClassUygulama {
    @Test

    public void test01(){

        // 1.Browser çalıştırılır
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 2.İlgili adrese gidilir
        driver.get("https://automationexercise.com");

        // 3.SingUp butonuna tıklayınız
        WebElement singUpButton=driver.findElement(By.xpath("//a[@href='/login']"));
        Actions actions= new Actions(driver);
        actions.click(singUpButton).perform();

        // 4.Isim ve email adres girilir
        // 5.Singup butonuna tıklanır
        WebElement nameBox= driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
        actions.click(nameBox)
                .sendKeys("ahmet")
                .sendKeys(Keys.TAB)
                .sendKeys("a@gmsail.com")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();

        // 6.Tüm alanlar doldurulur
        WebElement titleCheckBox= driver.findElement(By.xpath("//div[@id='uniform-id_gender1']"));
            actions.click(titleCheckBox)
                    .sendKeys(Keys.TAB)
                    .sendKeys(Keys.TAB)
                    .sendKeys("12345")
                    .sendKeys(Keys.TAB)
                    .sendKeys("6")
                    .sendKeys(Keys.TAB)
                    .sendKeys("March")
                    .sendKeys(Keys.TAB)
                    .sendKeys("1995")
                    .sendKeys(Keys.TAB)
                    .click()
                    .sendKeys(Keys.TAB)
                    .click()
                    .sendKeys(Keys.TAB)
                    .sendKeys("yasin")
                    .sendKeys(Keys.TAB)
                    .sendKeys("ayaz")
                    .sendKeys(Keys.TAB)
                    .sendKeys(Keys.TAB)
                    .sendKeys("ıstanbul")
                    .sendKeys(Keys.TAB)
                    .sendKeys(Keys.TAB)
                    .sendKeys("India")
                    .sendKeys(Keys.TAB)
                    .sendKeys("CEKMEKOY")
                    .sendKeys(Keys.TAB)
                    .sendKeys("343434")
                    .sendKeys(Keys.TAB)
                    .sendKeys("5456549878")
                    .sendKeys(Keys.TAB)
                    .sendKeys(Keys.ENTER).perform();






    }

}
