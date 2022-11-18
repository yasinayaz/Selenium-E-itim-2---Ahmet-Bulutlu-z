package WebElements_02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebElements01_Amazon {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");

        WebElement serchBox= driver.findElement(By.id("twotabsearchtextbox"));
        serchBox.click();
        serchBox.sendKeys("nutella");

        WebElement serchIkon=driver.findElement(By.id("nav-search-submit-button"));
        serchIkon.click();

        WebElement miktar=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(miktar.getText());

    }

}
