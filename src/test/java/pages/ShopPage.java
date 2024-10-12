package pages;

import org.junit.Test;
import org.openqa.selenium.By;
import utility.BrowserDriver;

public class ShopPage extends BrowserDriver {

    public static String order_your_gear_page = "//*[@id=\"menu\"]/ul/li[3]/a";
    public static String merch_page = "//*[@id=\"section2\"]/div/div[2]/div[1]/a[1]";
    public static String uniform_page_class = "//*[@id=\"section2\"]/div/div[2]/div[1]/a[2]";
    public static String order_uniform_xpath = "/html/body/section/div/div/div[2]/div/div/div/div[5]/div/a/div[1]/img";
    public static String size_chart_popup_id = "//*[@id='size-chart-open']";
    //public static String size_chart_closed_xpath = "//*[@id=\"chart-close\"]/i";
    public static String size_id ="//li[.//span[text()='L']]\n";




    public static void click_order_your_gear_page() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(order_your_gear_page)).click();

    }

    public static void click_merch_page() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(merch_page)).click();

    }

    public static void uniform_page_class() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(order_uniform_xpath)).click();

    }


    public static void click_order_uniform_xpath () throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(order_uniform_xpath )).click();

    }



    public static void click_size_id() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id(size_id)).click();

    }



}
