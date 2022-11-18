package WebElements_02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebElement02_Facebook {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        WebElement eposta=driver.findElement(By.xpath("//input[@type='text']"));
        eposta.click();
        eposta.sendKeys("ayazyasin4226@gmail.com");

        WebElement sifre=driver.findElement(By.id("pass"));
        sifre.click();
        sifre.sendKeys("Yasinayaz");

        WebElement girisYapButton= driver.findElement(By.xpath("//button[@value='1']"));
        girisYapButton.click();


    }
}
