package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class HomePage extends BrowserDriver {

    public static String sasslam_logo_xpath = "//*[@class=\"brand-logo\"]";
    public static String hamburger_menu_xpath = "//*[@id=\"menu-toggle\"]";
    public static String countdown_text_xpath= "//*[@id=\"section0\"]/div/div/div/p" ;
    public static String main_text_xpath= "//*[@id=\"section0\"]/div/div/div/p" ;
    public static String register_now_btn_xpath= "//*[@class=\"theme-btn\"]";


    //public static void click_hamburger_menu_xpath() throws InterruptedException {
        //WebDriverManager.chromedriver().browserVersion("126.0.6478.127").setup();
        //driver = new ChromeDriver();
        //driver.get("https://stage.sasslam.co.nz/");
        //driver.manage().window().maximize();
        //Thread.sleep(2000);
        //driver.findElement(By.xpath(sasslam_logo_xpath)).click();
        //Thread.sleep(2000);



    }

    //public static String getText_countdown_text_xpath() throws InterruptedException {
        //return driver.findElement(By.id(countdown_text_xpath)).getText();






