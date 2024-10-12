package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;

public class Homes extends BrowserDriver {

    public static String sasslam_logo_xpath = "//*[@class=\"brand-logo\"]";
    public static String countdown_name_xpath = "//*[text() = 'COUNTDOWN TO TIP-OFF']";
    public static String countdown_days_xpath = "";
    public static String countdown_hours_xpath = "";
    public static String countdown_minutes_xpath = "";

    public static Void click_sasslam_logo_xpath() throws InterruptedException {
        WebDriverManager.chromedriver().browserVersion("126.0.6478.182").setup();
        driver = new ChromeDriver();
        driver.get("https://stage.sasslam.co.nz/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath(sasslam_logo_xpath));
        Thread.sleep(2000);
        return null;
    }




    public static String getText_countdown_name_xpath() throws InterruptedException {
        return driver.findElement(By.xpath(countdown_name_xpath)).getText();

    }

}

