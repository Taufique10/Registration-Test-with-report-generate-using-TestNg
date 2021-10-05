package com.Opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RegisterTest {

    public static WebDriver driver;


    @BeforeTest
    @Parameters("Browsers")

    public static void launch_Browser(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://demo.opencart.com/index.php?route=account/register");
        }
        else if(browserName.equalsIgnoreCase("Opera")){
            System.setProperty("webdriver.opera.driver","./src/main/resources/operadriver.exe");
            driver=new OperaDriver();
            driver.manage().window().maximize();
            driver.get("https://demo.opencart.com/index.php?route=account/register");
        }
    }
    @Test
    public static void TestCase001(){
        WebElement First_Name=driver.findElement(By.id("input-firstname"));
        First_Name.clear();
        First_Name.sendKeys("Taufique");

        WebElement Last_Name=driver.findElement(By.id("input-lastname"));
        Last_Name.clear();
        Last_Name.sendKeys("Hasan1");

        WebElement Email=driver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys("lohfoaaatttttttaufffikkk@gmail.com");

        WebElement Telephone=driver.findElement(By.id("input-telephone"));
        Telephone.clear();
        Telephone.sendKeys("01700000020");

        WebElement Password=driver.findElement(By.id("input-password"));
        Password.clear();
        Password.sendKeys("123456");

        WebElement Password_Confirm=driver.findElement(By.id("input-confirm"));
        Password_Confirm.clear();
        Password_Confirm.sendKeys("123456");

        WebElement Subscribe=driver.findElement(By.cssSelector("#content > form > fieldset:nth-child(3) > div > div > label:nth-child(1) > input[type=radio]"));
        Subscribe.click();

        WebElement Privacy=driver.findElement(By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)"));
        Privacy.click();

        WebElement Continue=driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));
        Continue.click();

        String Expected_URL="https://demo.opencart.com/index.php?route=account/success";
        String Actual_URL=driver.getCurrentUrl();
        if (Expected_URL.equals(Actual_URL)){
            System.out.println("Test Case 001 Passed");
        }
        else {
            System.out.println("Test Case 001 Failed");
        }

        WebElement Continue_=driver.findElement(By.cssSelector("#content > div > div > a"));
        Continue_.click();

        WebElement Logout=driver.findElement(By.cssSelector("#column-right > div > a:nth-child(13)"));
        Logout.click();

        WebElement Register_=driver.findElement(By.cssSelector("#column-right > div > a:nth-child(2)"));
        Register_.click();
    }

    @Test
    public static void TestCase002() {


        WebElement First_Name = driver.findElement(By.id("input-firstname"));
        First_Name.clear();
        First_Name.sendKeys("1111");

        WebElement Last_Name = driver.findElement(By.id("input-lastname"));
        Last_Name.clear();
        Last_Name.sendKeys("121212");

        WebElement Email = driver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys("bppb2jjuiooorrffaat1taauufikk@gmail.com");

        WebElement Telephone = driver.findElement(By.id("input-telephone"));
        Telephone.clear();
        Telephone.sendKeys("01700000000");

        WebElement Password = driver.findElement(By.id("input-password"));
        Password.clear();
        Password.sendKeys("123456");

        WebElement Password_Confirm = driver.findElement(By.id("input-confirm"));
        Password_Confirm.clear();
        Password_Confirm.sendKeys("123456");

        WebElement Subscribe = driver.findElement(By.cssSelector("#content > form > fieldset:nth-child(3) > div > div > label:nth-child(1) > input[type=radio]"));
        Subscribe.click();

        WebElement Privacy = driver.findElement(By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)"));
        Privacy.click();

        WebElement Continue = driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));
        Continue.click();

        String Expected_URL="https://demo.opencart.com/index.php?route=account/register";
        String Actual_URL=driver.getCurrentUrl();
        if (Expected_URL.equals(Actual_URL)){
            System.out.println("Test Case 002 Passed");
        }
        else {
            System.out.println("Test Case 002 Failed");
        }

        WebElement Continue_=driver.findElement(By.cssSelector("#content > div > div > a"));
        Continue_.click();

        WebElement Logout=driver.findElement(By.cssSelector("#column-right > div > a:nth-child(13)"));
        Logout.click();

        WebElement Register_=driver.findElement(By.cssSelector("#column-right > div > a:nth-child(2)"));
        Register_.click();

    }

    @Test
    public static void TestCase003() {

        WebElement First_Name = driver.findElement(By.id("input-firstname"));
        First_Name.clear();
        First_Name.sendKeys("Taufique");

        WebElement Last_Name = driver.findElement(By.id("input-lastname"));
        Last_Name.clear();
        Last_Name.sendKeys("Hasan");

        WebElement Email = driver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys("111333221155556634122233");

        WebElement Telephone = driver.findElement(By.id("input-telephone"));
        Telephone.clear();
        Telephone.sendKeys("01700000000");

        WebElement Password = driver.findElement(By.id("input-password"));
        Password.clear();
        Password.sendKeys("123456");

        WebElement Password_Confirm = driver.findElement(By.id("input-confirm"));
        Password_Confirm.clear();
        Password_Confirm.sendKeys("123456");

        WebElement Subscribe = driver.findElement(By.cssSelector("#content > form > fieldset:nth-child(3) > div > div > label:nth-child(1) > input[type=radio]"));
        Subscribe.click();

        WebElement Privacy = driver.findElement(By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)"));
        Privacy.click();

        WebElement Continue = driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));
        Continue.click();

        String Expected_URL = "https://demo.opencart.com/index.php?route=account/register";
        String Actual_URL = driver.getCurrentUrl();
        if (Expected_URL.equals(Actual_URL)) {
            System.out.println("Test Case 003 Passed");
        } else {
            System.out.println("Test Case 003 Failed");
        }
    }

    @Test
    public static void TestCase004() {

        WebElement First_Name = driver.findElement(By.id("input-firstname"));
        First_Name.clear();
        First_Name.sendKeys("Taufique");

        WebElement Last_Name = driver.findElement(By.id("input-lastname"));
        Last_Name.clear();
        Last_Name.sendKeys("Hasan");

        WebElement Email = driver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys("wwwaretfasspoihhhoiott@gmail.com");

        WebElement Telephone = driver.findElement(By.id("input-telephone"));
        Telephone.clear();
        Telephone.sendKeys("aaaaabbbbbb");

        WebElement Password = driver.findElement(By.id("input-password"));
        Password.clear();
        Password.sendKeys("123456");

        WebElement Password_Confirm = driver.findElement(By.id("input-confirm"));
        Password_Confirm.clear();
        Password_Confirm.sendKeys("123456");

        WebElement Subscribe = driver.findElement(By.cssSelector("#content > form > fieldset:nth-child(3) > div > div > label:nth-child(1) > input[type=radio]"));
        Subscribe.click();

        WebElement Privacy = driver.findElement(By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)"));
        Privacy.click();

        WebElement Continue = driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));
        Continue.click();

        String Expected_URL = "https://demo.opencart.com/index.php?route=account/register";
        String Actual_URL = driver.getCurrentUrl();
        if (Expected_URL.equals(Actual_URL)) {
            System.out.println("Test Case 004 Passed");
        } else {
            System.out.println("Test Case 004 Failed");
        }
    }

    @Test
    public static void TestCase005() {

        WebElement First_Name = driver.findElement(By.id("input-firstname"));
        First_Name.clear();
        First_Name.sendKeys("Taufique");

        WebElement Last_Name = driver.findElement(By.id("input-lastname"));
        Last_Name.clear();
        Last_Name.sendKeys("Hasan");

        WebElement Email = driver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys("wwwpopjjjnyssassstkklott@gmail.com");

        WebElement Telephone = driver.findElement(By.id("input-telephone"));
        Telephone.clear();
        Telephone.sendKeys("017560066334");

        WebElement Password = driver.findElement(By.id("input-password"));
        Password.clear();
        Password.sendKeys("123456");

        WebElement Password_Confirm = driver.findElement(By.id("input-confirm"));
        Password_Confirm.clear();
        Password_Confirm.sendKeys("1234532326");

        WebElement Subscribe = driver.findElement(By.cssSelector("#content > form > fieldset:nth-child(3) > div > div > label:nth-child(1) > input[type=radio]"));
        Subscribe.click();

        WebElement Privacy = driver.findElement(By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)"));
        Privacy.click();

        WebElement Continue = driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));
        Continue.click();

        String Expected_URL = "https://demo.opencart.com/index.php?route=account/register";
        String Actual_URL = driver.getCurrentUrl();
        if (Expected_URL.equals(Actual_URL)) {
            System.out.println("Test Case 005 Passed");
        } else {
            System.out.println("Test Case 005 Failed");
        }

    }

    @Test
    public static void TestCase006() {

        WebElement First_Name = driver.findElement(By.id("input-firstname"));
        First_Name.clear();
        First_Name.sendKeys("Taufique");

        WebElement Last_Name = driver.findElement(By.id("input-lastname"));
        Last_Name.clear();
        Last_Name.sendKeys("Hasan");

        WebElement Email = driver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys("sjjjjyokkkksssopopopopasssttt@gmail.com");

        WebElement Telephone = driver.findElement(By.id("input-telephone"));
        Telephone.clear();
        Telephone.sendKeys("017560066334");

        WebElement Password = driver.findElement(By.id("input-password"));
        Password.clear();
        Password.sendKeys("123456");

        WebElement Password_Confirm = driver.findElement(By.id("input-confirm"));
        Password_Confirm.clear();
        Password_Confirm.sendKeys("1234532326");

        WebElement Subscribe = driver.findElement(By.cssSelector("#content > form > fieldset:nth-child(3) > div > div > label:nth-child(1) > input[type=radio]"));
        Subscribe.click();

        WebElement Continue = driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));
        Continue.click();

        String Expected_URL = "https://demo.opencart.com/index.php?route=account/register";
        String Actual_URL = driver.getCurrentUrl();
        if (Expected_URL.equals(Actual_URL)) {
            System.out.println("Test Case 006 Passed");
        } else {
            System.out.println("Test Case 006 Failed");
        }

    }

    @AfterTest
    public static void close_browser(){
        driver.close();
    }
}
