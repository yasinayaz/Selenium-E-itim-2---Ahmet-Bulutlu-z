package JunitAssentionOrnek_05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JunitAssention_1 {

    @Test
    public void test01(){

        //1.Browsera giriş yapılır
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2. https://automationexercise.com adresine gidin
        driver.get("https://automationexercise.com");

        //3.Ana sayfanın başarılı bir şekilde açıldığını test edin
        WebElement logoElement=driver.findElement(By.xpath("//img[@src='/static/images/home/logo.png']"));
        Assert.assertTrue(logoElement.isDisplayed());

        //4.Singup/Login butonuna tıklayın

        WebElement singupButton= driver.findElement(By.xpath("//a[@href=\'/login\']"));
        singupButton.click();

        //5."Login to your account" olduğunu doğrulayın
        WebElement yazıKontrol=driver.findElement(By.xpath("//h2[text()='Login to your account']"));
        Assert.assertTrue(yazıKontrol.isDisplayed());

        //6.Email adresi ve şifre doğru olarak girilir
        WebElement email=driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]"));
        email.click();
        email.sendKeys("yayaz4226@gmail.com");

        WebElement sifre=driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]"));
        sifre.click();
        sifre.sendKeys("Yasinayaz44");


        //7.Login butonuna tıklayın
        WebElement loginButton=driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]"));
        loginButton.click();

        //8.Doğru kullanıcı ile giriş yapıldığını test et

        WebElement yazıKontrol2=driver.findElement(By.xpath("//a[text()=' Logged in as ']"));
        System.out.println(yazıKontrol2.getText());
        Assert.assertTrue(yazıKontrol2.isDisplayed());

        //9.Logout butonuna tıklanır
        WebElement logoutButton=driver.findElement(By.xpath("//a[@href='/logout']"));
        logoutButton.click();

        //10.Tarayıcı kapatılır
        driver.close();



















    }


}
