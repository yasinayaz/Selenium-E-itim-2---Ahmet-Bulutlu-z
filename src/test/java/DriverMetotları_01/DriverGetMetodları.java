package DriverMetotları_01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverGetMetodları {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");           //Yazılan URL e gider
        System.out.println(driver.getTitle());          //İçinde bulunan sayfanın başlığını gösterir
        System.out.println(driver.getCurrentUrl());     //İçinde bluunan sayfanın URL dönderir
        System.out.println(driver.getPageSource());     //Sayfanın kaynak kodlarını verir
        System.out.println(driver.getWindowHandle());   //Sayfanın UNIQUE  hash kodunu döndürür
        System.out.println(driver.getWindowHandles());  //Açılan tüm sayfaların UNIQUE  hash kodunu döndürür


    }


}
