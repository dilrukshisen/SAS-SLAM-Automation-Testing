package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class MainMenue extends BrowserDriver {

    public static String home_page = "//*[@id=\"menu\"]/ul/li[1]/a";
    public static String venue_update = "//*[@id=\"menu\"]/ul/li[2]/a";
    public static String order_your_gear = "//*[@id=\"menu\"]/ul/li[3]/a";
    public static String division = "//*[@id=\"menu\"]/ul/li[4]/a";
    public static String size_guide = "//*[@id=\"menu\"]/ul/li[5]/a";
    public static String close_btn = "//*[@id=\"menu-toggle\"]";


    public static String getText_home_page() throws InterruptedException {
        return driver.findElement(By.xpath(home_page)).getText();

    }
    public static String getText_venue_update() throws InterruptedException {
        return driver.findElement(By.xpath(venue_update)).getText();

    }
    public static String getText_order_your_gear() throws InterruptedException {
        return driver.findElement(By.xpath(order_your_gear)).getText();
    }
    public static String getText_division() throws InterruptedException {
        return driver.findElement(By.xpath(division)).getText();
    }

    public static String getText_size_guide() throws InterruptedException {
        return driver.findElement(By.xpath(size_guide)).getText();
    }
    public static void click_close_btn() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(close_btn)).click();
    }


}

