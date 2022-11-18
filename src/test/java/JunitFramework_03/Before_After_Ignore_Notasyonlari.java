package JunitFramework_03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Before_After_Ignore_Notasyonlari {

    // @Test başlangıcında before çalışır test başlar after çalışır test biter 2 teste geçer


    WebDriver driver;

    @Before
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
    }

    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void test01(){
        driver.get("https://www.amazon.com");
    }
    @Test @Ignore

    public void test02(){
        driver.get("https://www.facebook.com");
    }
    @Test

    public void test03(){
        driver.get("https://www.bestbuy.com");
    }
    @Test

    public void test04(){
        driver.get("https://www.amazon.com");
    }




}
