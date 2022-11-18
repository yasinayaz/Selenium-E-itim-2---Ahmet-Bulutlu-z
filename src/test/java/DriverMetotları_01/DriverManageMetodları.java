package DriverMetotları_01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManageMetodları {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
// 1- WINDOWS

        System.out.println(driver.manage().window().getSize());      //Sayfanın piksel ölçülerini verir
        System.out.println(driver.manage().window().getPosition());  //Sayfanın piksel olarak konumunu gösterir

        driver.manage().window().setPosition(new Point(45,45));//Sayfanon sol alt köşesini istediğiimi konuma taşır
        driver.manage().window().setSize(new Dimension(1200,1200));


        System.out.println("Yeni pencere ölçüleri : "+ driver.manage().window().getSize());
        System.out.println("Yeni pencere konumu : "+ driver.manage().window().getPosition());

        driver.manage().window().maximize();
        System.out.println("maximize konum : "+driver.manage().window().getPosition());
        System.out.println("maximize boyut : "+driver.manage().window().getSize());

        driver.manage().window().fullscreen();
        System.out.println("fullscreen konum : "+driver.manage().window().getPosition());
        System.out.println("fullscreen boyut : "+driver.manage().window().getSize());

//2- TIMEOUT

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));  // 15 sn işlem yapmasını bekler. İŞlem yaparsa hemen devam eder, işlem yapılmazsa exception fırlatır

    }


}
