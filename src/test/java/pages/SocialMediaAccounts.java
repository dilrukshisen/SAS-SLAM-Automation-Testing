package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class SocialMediaAccounts extends BrowserDriver {

    public static String instagram = "//*[@id=\"menu\"]/div/div[1]/a";
    public static String facebook = "//*[@id=\"menu\"]/div/div[2]/a";
    public static String tiktok = "//*[@id=\"menu\"]/div/div[3]/a";




    public static void click_instagram() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath(instagram)).click();

    }

    public static void click_facebook() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(By.xpath(facebook)).click();
    }

    public static void click_tiktok() throws InterruptedException {
        Thread.sleep(15000);
        driver.findElement(By.xpath(tiktok)).click();
        Thread.sleep(5000);

        driver.quit();
    }
}
