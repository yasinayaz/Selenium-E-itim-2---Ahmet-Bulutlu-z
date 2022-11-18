package DriverMetotları_01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigateMetodları {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");                    // istenilen URL e gider
        driver.navigate().to("https://www.facebook.com");    //İstenilen URL gider oradan başka URL geçilecekse kullanılır
        driver.navigate().back();                                //Bir önceki sayfaya gider
        driver.navigate().forward();                             //Bir sonraki sayfaya gider...Facebook
        driver.navigate().refresh();                             //Sayfayı yeniler
        driver.close();                                          //bulunduğu sayfayı kapatır
        driver.quit();                                           //Tüm sayfaları kapatır

    }

}
