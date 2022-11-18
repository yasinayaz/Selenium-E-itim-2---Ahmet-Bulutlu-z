package JunitFramework_03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BeforClass_AfterClass_Notasyonları {

    //  beforclass ve afterclass lar clas başında before çalışır , class sonunda after çalışır biter
   static WebDriver driver;

    @BeforeClass
    public static void setUp(){

        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

    }

    @AfterClass
    public static void tearDown(){
        driver.close();
    }

    @Test
    public void test01(){
        driver.get("https://www.amazon.com");
    }
    @Test

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
